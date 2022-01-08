package com.example.message.controller;

import com.example.message.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageServiceApiController {

    @Autowired
    private Message messageEntity;

    @RequestMapping(path = "/message")
    public Message sendMessage(@RequestParam(value = "messageid") int messageId,
                               @RequestParam(value = "message", defaultValue = "This is the default message") String message) {
        messageEntity.setMessageId(messageId);
        messageEntity.setMessage(String.format("The message received  is: %s", message));
        return messageEntity;
    }

}
