package com.devlife.skill_analytic_service.config;

import com.devlife.skill_analytic_service.dto.asyncMessageModel.UserAsyncModel;
import com.devlife.skill_analytic_service.service.eventService.ConsumerService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import java.util.function.Consumer;


@Configuration
@RequiredArgsConstructor
public class CloudStreamConfig {
    private final ConsumerService<UserAsyncModel> userConsumerService;

    @Bean
    public Consumer<Message<UserAsyncModel>> userConsumer() {
        return userConsumerService::handle;
    }

}
