package com.example.producer.model;

import com.example.producer.dto.MessageTextRequestDTO;

public class MessageText {
    public String content;

    public MessageText(MessageTextRequestDTO data) {
        this.content = data.content();
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}

