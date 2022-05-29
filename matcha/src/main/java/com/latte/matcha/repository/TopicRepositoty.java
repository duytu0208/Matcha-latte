package com.latte.matcha.repository;

import com.latte.matcha.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepositoty extends JpaRepository<Topic, Long> {
}
