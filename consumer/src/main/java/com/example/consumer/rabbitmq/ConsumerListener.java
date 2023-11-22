package com.example.consumer.rabbitmq;

import com.example.consumer.dto.MessageTextRequestDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RabbitListener(queues = "producer-request")
    public void producerMessage(MessageTextRequestDTO data) {
        System.out.println("Mensagem consumida: "+data.content());
    }
}
