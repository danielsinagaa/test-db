package com.example.demo.model.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Table(name = "USER_CONTACT")
@Entity
@Data
public class UserContact {

    @GeneratedValue(generator = "id", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "id", strategy = "uuid")
    @Id
    private String id;

    @Column(nullable = false)
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private User user;

}
