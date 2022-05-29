package com.latte.matcha.services.Impl;

import com.latte.matcha.entity.Card;
import com.latte.matcha.repository.CardRepositoty;
import com.latte.matcha.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepositoty cardRepositoty;

    @Override
    public List<Card> getCards() {
        return cardRepositoty.findAll();
    }
}
