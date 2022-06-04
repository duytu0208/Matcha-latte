package com.latte.matcha.services.Impl;

import com.latte.matcha.dto.CardDTO;
import com.latte.matcha.entity.Card;
import com.latte.matcha.repository.CardRepository;
import com.latte.matcha.services.CardService;
import com.latte.matcha.specification.CardSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepositoty;

    @Autowired
    private CardSpecification cardSpecification;

    @Override
    public List<CardDTO> getCards() {

        List<Card> cards = cardRepositoty.findAll();

        List<CardDTO> cardDTOList = cards.stream().map(obj -> {
            CardDTO cardDTO = new CardDTO();
            cardDTO.setCardId(obj.getId());

            return cardDTO;
        }).collect(Collectors.toList());

        return cardDTOList;
    }
}
