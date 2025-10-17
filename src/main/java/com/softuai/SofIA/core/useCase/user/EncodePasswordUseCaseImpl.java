package com.softuai.SofIA.core.useCase.user;

import com.softuai.SofIA.core.gateway.UserGateway;

public class EncodePasswordUseCaseImpl implements EncodePasswordUseCase {

    private final UserGateway userGateway;

    public EncodePasswordUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public String execute(String password) {
        return userGateway.encodePasswordUseCase(password);
    }

}
