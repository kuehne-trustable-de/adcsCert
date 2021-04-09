package de.trustable.ca3s.adcs.proxy;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("de.trustable.ca3s.adcs.proxy");

        noClasses()
            .that()
            .resideInAnyPackage("de.trustable.ca3s.adcs.proxy.service..")
            .or()
            .resideInAnyPackage("de.trustable.ca3s.adcs.proxy.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..de.trustable.ca3s.adcs.proxy.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
