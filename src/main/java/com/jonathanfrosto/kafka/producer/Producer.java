package com.jonathanfrosto.kafka.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Producer {

    private final KafkaTemplate<String, String> template;

    public void sendMessage(String message) {
        template.send("topic_test", message);
    }
}
