package com.softuai.SofIA.core.useCase.user;

import com.softuai.SofIA.core.gateway.UserGateway;

public class BlockUserUseCaseImpl implements BlockUserUseCase {

    private final UserGateway userGateway;

    public BlockUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(Long id) {
        userGateway.blockUserUseCase(id);
    }

}
