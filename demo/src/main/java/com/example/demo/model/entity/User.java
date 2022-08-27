package com.example.demo.model.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Table(name = "USER")
@Entity
@Data
public class User {

    @GeneratedValue(generator = "id", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "id", strategy = "uuid")
    @Id
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;
}
