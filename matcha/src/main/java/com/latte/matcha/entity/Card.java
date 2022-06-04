package com.latte.matcha.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CARD")
public class Card {

    @OneToMany(mappedBy = "card", fetch = FetchType.LAZY)
    private List<CardTopic> cardTopicList;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "EN_VALUE")
    private String enValue;

    @Column(name = "VI_VALUE")
    private String viValue;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "EXAMPLE")
    private String example;

}
