package com.myou.springbootapachekafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApacheKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApacheKafkaApplication.class, args);
    }

//	@Bean
//	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
//		return args -> {
//			kafkaTemplate.send("myou", "apache kafka with SB ✌");
//		};
//	}

}
