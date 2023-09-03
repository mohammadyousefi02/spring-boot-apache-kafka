package com.myou.springbootapachekafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "myou",
            groupId = "GID"
    )
    void listener(String data) {
        System.out.println(data);
    }
}
