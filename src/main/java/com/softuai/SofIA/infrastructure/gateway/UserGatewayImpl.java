package com.softuai.SofIA.infrastructure.gateway;

import com.softuai.SofIA.core.entity.User;
import com.softuai.SofIA.core.gateway.UserGateway;

import java.util.Map;

public class UserGatewayImpl implements UserGateway {

    @Override
    public void BlocUserUseCase(Long id) {

    }

    @Override
    public void ChangePasswordUseCase(Long id, String currentPassword, String newPassword) {

    }

    @Override
    public User CreateUserUseCase(User user) {
        return null;
    }

    @Override
    public User GetUserByIdUseCase(Long id) {
        return null;
    }

    @Override
    public User PatchUserUseCase(Long id, Map<String, Object> params) {
        return null;
    }

    @Override
    public void RecordFailedLoginUseCase(Long id) {

    }

    @Override
    public void RequestPasswordResetUseCase(Long userId, String token, int minutesValid) {

    }

    @Override
    public void ResetPasswordUseCase(Long id, String token, String newPassword) {

    }

    @Override
    public void UnblockUserUseCase(Long id) {

    }
}
