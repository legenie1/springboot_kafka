package com.gesta;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListerners {

    @KafkaListener(topics = "gesta", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received: " + data + " :)");
    }
}
