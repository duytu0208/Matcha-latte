package com.latte.matcha.specification;

import com.latte.matcha.entity.Card;
import com.latte.matcha.entity.Card_;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public final class CardSpecification {

    public static Specification<Card> hasId(Long cardId) {
        return (root, query, cb) -> cb.equal(root.get(Card_.id), cardId);
    }

    public static Specification<Card> valueLike(String value) {
        return (root, query, cb) -> cb.equal(root.get(Card_.EN_VALUE), value);
    }

}
