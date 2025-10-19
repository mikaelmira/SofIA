package com.softuai.SofIA.infrastructure.configuration;

import com.softuai.SofIA.core.gateway.UserGateway;
import com.softuai.SofIA.core.useCase.user.CreateUserUseCase;
import com.softuai.SofIA.core.useCase.user.CreateUserUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserBeanConfiguration {

    @Bean
    public CreateUserUseCase createUserUseCase(UserGateway userGateway) {
        return new CreateUserUseCaseImpl(userGateway);
    }

}
