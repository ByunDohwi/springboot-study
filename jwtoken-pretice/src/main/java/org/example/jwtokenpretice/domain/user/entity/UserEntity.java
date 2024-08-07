package org.example.jwtokenpretice.domain.user.entity;

import jakarta.persistence.*;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nickName;

    private String realName;

    private String password;


    private String Email;
    private String Address;
}
