package com.sqx.rabbitmq;

import com.sqx.rabbitmq.producer.RabbitProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    private RabbitProducer rabbitProducer;

    @GetMapping("/send")
    public String send() {
        rabbitProducer.sendMessage("您好世界");
        return "success";
    }
}
