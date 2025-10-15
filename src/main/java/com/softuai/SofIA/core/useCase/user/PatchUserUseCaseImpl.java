package com.softuai.SofIA.core.useCase.user;

import com.softuai.SofIA.core.entity.User;
import com.softuai.SofIA.core.gateway.UserGateway;

import java.util.Map;

public class PatchUserUseCaseImpl implements PatchUserUseCase {

    private final UserGateway userGateway;

    public PatchUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(Long id, Map<String, Object> params) {
        return userGateway.patchUserUseCase(id, params);
    }

}
