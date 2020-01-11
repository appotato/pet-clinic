package com.hoan.petclinicweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.hoan")
public class PetClinicWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetClinicWebApplication.class, args);
    }

}
