package com.latte.matcha.repository;

import com.latte.matcha.entity.CardTopic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardTopicRepository extends JpaRepository<CardTopic, Long> {
}
