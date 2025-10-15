package com.softuai.SofIA.core.gateway;

import com.softuai.SofIA.core.entity.User;

import java.util.Map;

public interface UserGateway {

    void BlocUserUseCase(Long id);
    void ChangePasswordUseCase(Long id, String currentPassword, String newPassword);
    User CreateUserUseCase(User user);
    User GetUserByIdUseCase(Long id);
    User PatchUserUseCase(Long id, Map<String, Object> params);
    void RecordFailedLoginUseCase(Long id);
    void RequestPasswordResetUseCase(Long userId, String token, int minutesValid);
    void ResetPasswordUseCase(Long id, String token, String newPassword);
    void UnblockUserUseCase(Long id);

}
