package com.example.message.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class Message {
    @Getter
    @Setter
    private int messageId;

    @Getter
    @Setter
    private String message;
}
