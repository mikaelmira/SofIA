package com.softuai.SofIA.core.useCase.user;

import com.softuai.SofIA.core.entity.User;
import com.softuai.SofIA.core.gateway.UserGateway;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final UserGateway userGateway;

    public CreateUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(User user) {
        return userGateway.CreateUserUseCase(user);
    }

}
