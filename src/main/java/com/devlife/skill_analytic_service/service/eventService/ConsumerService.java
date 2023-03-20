package com.devlife.skill_analytic_service.service.eventService;

import org.springframework.messaging.Message;

public interface ConsumerService<T> {
    void handle(Message<T> message);
}
