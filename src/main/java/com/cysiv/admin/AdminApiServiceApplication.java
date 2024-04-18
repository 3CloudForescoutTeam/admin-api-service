package com.cysiv.admin;

import com.cysiv.caching.EnableDataCaching;
import com.cysiv.secrets.EnableSecrets;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableSecrets
@EnableDataCaching
@Slf4j
public class AdminApiServiceApplication {

    public static void main(String[] args) {

        Environment environment = SpringApplication.run(AdminApiServiceApplication.class, args).getEnvironment();

        log.info("Running Admin Api Service Application Profile(s) {}}", environment.getActiveProfiles());
    }

}
