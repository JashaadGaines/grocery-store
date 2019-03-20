package com.grocer;

import lombok.Generated;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
@EnableScheduling
@EnableAsync
@EnableRetry
@SuppressWarnings("PMD.UseUtilityClass")
@Generated // Lie, so JaCoCo ignores in the report
public class Application {
    public static void main(final String... args) {
        run(Application.class, args);
    }
}
