package com.latte.matcha.services.Impl;

import com.latte.matcha.entity.Card;
import com.latte.matcha.repository.CardRepositoty;
import com.latte.matcha.services.CardService;
import com.latte.matcha.specification.CardSpecification;
import com.latte.matcha.specification.Filter;
import com.latte.matcha.specification.QueryOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepositoty cardRepositoty;

    @Autowired
    private CardSpecification cardSpecification;

    @Override
    public List<Card> getCards() {

        Specification conditions = Specification.where(CardSpecification.hasId(1L))
                .and(CardSpecification.valueLike("02"));

        return cardRepositoty.findAll(conditions);
    }
}
