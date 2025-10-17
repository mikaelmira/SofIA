package com.softuai.SofIA.core.useCase.user;

import com.softuai.SofIA.core.gateway.UserGateway;

public class MatchPasswordUseCaseImpl implements MatchPasswordUseCase {

    private final UserGateway userGateway;

    public MatchPasswordUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public boolean execute(String password, String databasePassword) {
        return userGateway.matchPasswordUseCase(password, databasePassword);
    }
}
