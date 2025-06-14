package com.sqx.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    public static final String QUEUE_NAME = "orderQueue";
    public static final String EXCHANGE_NAME = "orderExchange";
    public static final String ROUTING_KEY = "orderRoutingKey";

    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME);
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    @Bean
    public Binding binding() {
        return org.springframework.amqp.core.BindingBuilder.bind(queue())
                .to(exchange())
                .with(ROUTING_KEY);
    }
}
