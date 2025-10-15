package com.softuai.SofIA.core.useCase.user;

import com.softuai.SofIA.core.gateway.UserGateway;

public class UnblockUserUseCaseImpl implements UnblockUserUseCase {

    private final UserGateway userGateway;

    public UnblockUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(Long id) {
        userGateway.UnblockUserUseCase(id);
    }

}
