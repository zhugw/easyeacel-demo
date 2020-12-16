package com.example.easyexceldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class EasyexcelDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EasyexcelDemoApplication.class, args);
    }
    @Autowired
    private ReadService service;
    @Override
    public void run(String... args) throws Exception {
        File file = new File("/tmp/Book1.xlsx");
        service.read(file);

    }
}
