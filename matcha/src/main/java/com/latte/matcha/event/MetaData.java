//package com.latte.matcha.event;
//
//import com.latte.matcha.entity.Card;
//import com.latte.matcha.entity.CardTopic;
//import com.latte.matcha.entity.Topic;
//import com.latte.matcha.repository.CardRepositoty;
//import com.latte.matcha.repository.CardTopicRepository;
//import com.latte.matcha.repository.TopicRepositoty;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Slf4j
//@Component
//public class MetaData {
//
//    private static List<Card> cardList = new ArrayList<>();
//    private static List<Topic> topicList = new ArrayList<>();
//
//    static {
//        Card card1 = new Card();
//        card1.setEnValue("Card01");
//        Card card2 = new Card();
//        card2.setEnValue("Card02");
//        Card card3 = new Card();
//        card3.setEnValue("Card03");
//        Card card4 = new Card();
//        card4.setEnValue("Card04");
//
//        cardList = List.of(card1, card2, card3, card4);
//
//        Topic topic1 = new Topic();
//        topic1.setName("Topic01");
//        Topic topic2 = new Topic();
//        topic2.setName("Topic02");
//
//        topicList = List.of(topic1, topic2);
//
//    }
//
//    @Autowired
//    private CardRepositoty cardRepositoty;
//
//    @Autowired
//    private TopicRepositoty topicRepositoty;
//
//    @Autowired
//    private CardTopicRepository cardTopicRepository;
//
//    @EventListener(ApplicationReadyEvent.class)
//    public void insertData() {
//        log.info("Add data for table Card, Topic");
//
//        List<Card> cards = cardRepositoty.saveAll(cardList);
//        List<Topic> topics = topicRepositoty.saveAll(topicList);
//
//        CardTopic cardTopic1 = new CardTopic();
//        cardTopic1.setCardId(cards.get(0).getId());
//        cardTopic1.setTopicId(topics.get(0).getId());
//        cardTopicRepository.saveAll(List.of(cardTopic1));
//
//    }
//}
