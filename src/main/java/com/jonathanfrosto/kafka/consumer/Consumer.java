package com.jonathanfrosto.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "topic_test", groupId = "group_id")
    public void consumeMessage(String message){
        System.out.println(message);
    }
}
