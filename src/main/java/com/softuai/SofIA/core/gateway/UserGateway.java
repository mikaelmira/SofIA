package com.softuai.SofIA.core.gateway;

import com.softuai.SofIA.core.entity.User;

import java.util.Map;

public interface UserGateway {

    void blockUserUseCase(Long id);
    void changePasswordUseCase(Long id, String currentPassword, String newPassword);
    User createUserUseCase(User user);
    User getUserByIdUseCase(Long id);
    User patchUserUseCase(Long id, Map<String, Object> params);
    void recordFailedLoginUseCase(Long id);
    void requestPasswordResetUseCase(Long userId, String token, int minutesValid);
    void resetPasswordUseCase(Long id, String token, String newPassword);
    void unblockUserUseCase(Long id);

}
