package com.jonathanfrosto.kafka.controller;

import com.jonathanfrosto.kafka.producer.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaTestController {

    private final Producer kafkaProducer;

    @PostMapping("/topic")
    public void sendTopic(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);

    }
}
