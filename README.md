# adcsCert
Proxy to access ADCS CA functionality remotely

ca3s handles different CAs and certificate inventories. Microsoft ADCS is a quite important one as it is deployed in many organizations. The ADCSProxy act as an intermediary to provide a REST-styled interface to connect remotely to an ADCS instance, independently from invoking language and OS. 

The certificate creation (and revocation) functionality can be used by ca3s but the complete set of ADCS-created certificates is also relevant for analysing and tracking purposes.

The ADCS does not offer a standardized, remotely accessible interface. So we had to provide a custom build adapter to connect to ADCS, the ADCSProxy. This gateway offers the following functionalities:

    information about the ADCS instance

    request a certificate

    revoke a certificate

    retrieve the existing inventory of certificates

The modifying methods (request and revoke) require a caller authentication using a shared secret.

The ADCS does not use a ‘fully featured’ database but relies upon a file based storage. This implies restrictions on the retrieval methods. The access is pretty slow and the number of file handles is strictly limited (20 handles per default). Once all of these handles are in use the ADCS (not just the ADCSProxy!) is unable to issue new or revoke existing certificates! To avoid any negative impact on the ADCS the caller should cache issued certificates locally and should just poll for a chunk of new request ids (e.g. a block of 100 ids). In a second step the caller may retrieve the base64-encoded content of the certificates not yet known to the caller. The highest request id retrieved should be stored as a offset value for subsequent calls. This way the complete set of issued certificates will be copied into the local cache. 

Performing a new retrieval request regularly (e.g. every minute) keeps the local cache aligned with the set of ADCS issued certificates. 

Retrieving the revocation state of the certificates is currently not supported. The revocation status of a certificate should be retrieved by checking the corresponding CRLs or OCSP endpoints. This approach does not require the issuance of certificates by the ADSCS instance and therefore is more robust and versatile.
Instructions
Building

The project consists several modules:

adcsCert

    certcli

    certenrol

    certadmin

    adcsCertUtil

    adcsProxy

    adcsProxyClient

Invoking ‘mvn install’ on the top level builds all modules. 

The modules certcli, certenrol and certadmin generate adapter code to access native Windows interface for these three different dlls:

    c:/windows/system32/certcli.dll

    c:/windows/system32/CertEnroll.dll

    c:/windows/system32/certadm.dll

Special thanks to the contributors of the TlbCodeGenerator . It is an important building block of the ADCSProxy! Without the generated code we most probably didn’t succeed with the ADCSProxy! 

The generator output is included in the project sources so there is currently no need for the user to rebuild it. For details of using the generator consult the TlbCodeGenerator documentation.

The module ‘adcsCertUtil’ maps the remote interface onto the ADCS API.

The module ‘adcsProxy’ is a simple Spring Boot server based on the code generated using the Swagger editor. Invoking ‘mvn spring-boot:run’ starts the ADCSProxy from the current source and configuration.

The module ‘adcsProxyClient’ is a REST client generated using the Swagger editor with some modifications to connect to an ADCSProxy.
Configuration

Connect an ADCS instance:

    Install the ADCSProxy package on your ADCS server

    Create a secure passphrase and set it as ‘connection.secret’. Alternatively create a registry entry ‘de.trustable.ca3s.adcsproxy.secret' at the path 'Computer\HKEY_CURRENT_USER\Software\JavaSoft\Prefs’ and enter your passphrase as the value. The registry takes precedence over application properties. 

    For convenience reasons it is possible to start the ADCSProxy without a given passphrase. In this case a new passphrase will be generated on startup and written to the registry (see above). Just retrieve the passphrase e.g. using regedit.  

    Configure the ‘server.port’ number (defaults to 8443) and configure an appropriate firewall rule to allow the ca3s instance to access this port on the ADCS server.

    The ADCSProxy comes a adopted key store provider implementation which automatically retrieves a server certificate from the local ADCS. So there is no need to maintain a ‘classic’ key store. The embedded configuration file is preconfigured to use this key store provider. There is just one value to align with your environment:
    Find the name of an appropriate template for TLS Server certificates available in your ADCS server (or create a template). Configure the ‘server.ssl.key-alias' property by adding the template name after the '@’, for example:
    server.ssl.key-alias=localADCSAlias@{yourTemplateName}
    If you are using a non-domain embedded ADCS just leave out the template and the '@' character.

    Start the ADCSProxy. It is recommended to configure the ADCSProxy as Windows Service

    Login to the ca3s console as Admin and configure

        a new ADCS server for certificate creation

        a new ADCSInventory to keep track of the issued certificates

    The ‘ADCS’ entry needs the secure passphrase defined above to authorize the requestor for these sensitive calls.

After activation of the ADCSInventory the server starts to imports all certificates of the ADCS instance. Depending on the number of issued certificates this take some time. As a coarse orientation: 1000 certs / hour 
