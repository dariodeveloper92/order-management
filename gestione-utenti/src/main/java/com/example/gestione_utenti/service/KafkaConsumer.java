package com.example.gestione_utenti.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "myTopic", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Received: " + message);
    }
}
