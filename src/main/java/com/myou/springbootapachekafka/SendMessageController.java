package com.myou.springbootapachekafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/send")
public class SendMessageController {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public SendMessageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public String send(@RequestBody SendMessageDto sendMessageDto) {
        kafkaTemplate.send("myou", sendMessageDto.message());
        return "ok";
    }
}
