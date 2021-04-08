package de.trustable.ca3s.client.api;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import io.swagger.client.ApiException;

public class LoadTestAPI {

    private final RemoteADCSClient api = new RemoteADCSClient("https://localhost:23443/ADCSConnector", "unexpectedApiKey");

    X509TrustManager trustAllTm = new X509TrustManager() {
        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
        public X509Certificate[] getAcceptedIssuers() {return null;}
    };
    
    
	public static void main(String[] args) {
		
/*		
	   for (int i = 0; i < 10; i++) {
	        new Thread(() -> {

	    		LoadTestAPI instance = new LoadTestAPI();
	    		try {
	    			instance.callCertList(100);
	    		} catch( Exception ex) {
	    			
	    		}
	        }).start();
	    }
*/	    
	}
	
	public LoadTestAPI() {
		
		TrustManager[] managers = {trustAllTm};
		api.getApiClient().setTrustManagers(managers);

	}

	public void callCertList(int nTimes) {
		long startTime = System.currentTimeMillis();
		for( int i = 0; i < nTimes; i++) {
			try {
				api.getRequestIdList(100, 0);
			} catch (ApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("#" + nTimes + " took " + (System.currentTimeMillis() - startTime) /1000L + " sec.");
	}
}
