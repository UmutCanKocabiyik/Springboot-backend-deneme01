package com.example.springbootexamples01.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Data
@Document
public class User {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private HashMap properties;
}
