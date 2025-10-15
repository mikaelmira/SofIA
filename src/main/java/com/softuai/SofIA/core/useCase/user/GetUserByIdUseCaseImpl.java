package com.softuai.SofIA.core.useCase.user;

import com.softuai.SofIA.core.entity.User;
import com.softuai.SofIA.core.gateway.UserGateway;

public class GetUserByIdUseCaseImpl implements GetUserByIdUseCase {

    private final UserGateway userGateway;

    public GetUserByIdUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(Long id) {
        return userGateway.getUserByIdUseCase(id);
    }

}
