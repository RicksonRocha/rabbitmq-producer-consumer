package com.example.producer.rest;

import com.example.producer.dto.MessageTextRequestDTO;
import com.example.producer.model.MessageText;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/producer")
public class ProducerRest {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveCustomer(@ModelAttribute MessageTextRequestDTO data) {
        String routingKey = "producer-request";
        rabbitTemplate.convertAndSend(routingKey, data);
    }
}
