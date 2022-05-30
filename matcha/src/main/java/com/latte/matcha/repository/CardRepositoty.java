package com.latte.matcha.repository;

import com.latte.matcha.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepositoty extends JpaRepository<Card, Long>, JpaSpecificationExecutor<Card> {


}
