package com.latte.matcha.controller;

import com.latte.matcha.dto.CardDTO;
import com.latte.matcha.entity.Card;
import com.latte.matcha.services.CardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping(path = "/cardsList")
    public List<CardDTO> getCards() {
        log.info("Get card list");
        return cardService.getCards();
    }

}
