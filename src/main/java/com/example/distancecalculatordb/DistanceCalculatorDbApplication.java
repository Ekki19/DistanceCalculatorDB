package com.example.distancecalculatordb;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DistanceCalculatorDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistanceCalculatorDbApplication.class, args);
        System.out.println();
    }

}
