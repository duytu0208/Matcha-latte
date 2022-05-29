package com.latte.matcha.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String englishValue;

    @Column
    private String vietNamValue;

    @Column
    private String type;

    @Column
    private String description;

    @Column
    private String example;

    @OneToMany(mappedBy = "card")
    Set<CardTopic> cardTopics;

}
