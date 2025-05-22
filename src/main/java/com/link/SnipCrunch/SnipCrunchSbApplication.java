package com.link.SnipCrunch;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnipCrunchSbApplication {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();

        SpringApplication.run(SnipCrunchSbApplication.class, args);
    }
}
