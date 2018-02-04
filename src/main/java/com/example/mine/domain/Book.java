package com.example.mine.domain;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer bid;

    @Column(length = 20)
    private String bookName;

    @Column(length = 20)
    private String bookDescription;

    @Column(length = 20)
    private String bookPrice;

}
