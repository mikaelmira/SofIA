package com.softuai.SofIA.core.useCase.user;

import com.softuai.SofIA.core.gateway.UserGateway;

public class RecordFailedLoginUseCaseImpl implements RecordFailedLoginUseCase {

    private final UserGateway userGateway;

    public RecordFailedLoginUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(Long id) {
        userGateway.recordFailedLoginUseCase(id);
    }

}
