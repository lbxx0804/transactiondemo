package com.example.transactiondemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.transactiondemo.dao")
@SpringBootApplication
public class TransactiondemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransactiondemoApplication.class, args);
    }

}
