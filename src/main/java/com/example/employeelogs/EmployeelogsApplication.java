package com.example.employeelogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.employeelogs.dao")
public class EmployeelogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeelogsApplication.class, args);
    }

}
