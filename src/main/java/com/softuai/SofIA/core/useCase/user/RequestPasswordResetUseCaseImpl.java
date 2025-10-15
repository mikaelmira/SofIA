package com.softuai.SofIA.core.useCase.user;

import com.softuai.SofIA.core.gateway.UserGateway;

public class RequestPasswordResetUseCaseImpl implements RequestPasswordResetUseCase {

    private final UserGateway userGateway;

    public RequestPasswordResetUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(Long userId, String token, int minutesValid) {
        userGateway.RequestPasswordResetUseCase(userId, token, minutesValid);
    }

}
