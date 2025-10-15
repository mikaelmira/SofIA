package com.softuai.SofIA.core.useCase.user;

import com.softuai.SofIA.core.gateway.UserGateway;

public class ResetPasswordUseCaseImpl implements ResetPasswordUseCase {

    private final UserGateway userGateway;

    public ResetPasswordUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(Long id, String token, String newPassword) {
        userGateway.resetPasswordUseCase(id, token, newPassword);
    }

}
