package com.example.employeelogs.domain.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "logs")
public class Logs {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String datetime;

    private String username;

    private String log;

    private String project;
}