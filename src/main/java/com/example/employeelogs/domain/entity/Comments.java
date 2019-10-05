package com.example.employeelogs.domain.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "comments")
public class Comments {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String critic;

    private String comment;
}