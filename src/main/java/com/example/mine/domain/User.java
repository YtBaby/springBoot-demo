package com.example.mine.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 用户
 */
@Entity
@Table(name="user")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer uid;

    @Column(length = 20)
    private String userName;

    @Column(length = 20)
    private String userPwd;

}
