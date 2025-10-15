package com.softuai.SofIA.core.useCase.user;

import com.softuai.SofIA.core.gateway.UserGateway;

public class ChangePasswordUseCaseImpl implements ChangePasswordUseCase {

    private final UserGateway userGateway;

    public ChangePasswordUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(Long id, String currentPassword, String newPassword) {
        userGateway.ChangePasswordUseCase(id, currentPassword, newPassword);
    }

}
