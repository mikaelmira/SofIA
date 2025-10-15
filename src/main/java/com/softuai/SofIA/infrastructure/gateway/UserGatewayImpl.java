package com.softuai.SofIA.infrastructure.gateway;

import com.softuai.SofIA.core.entity.User;
import com.softuai.SofIA.core.gateway.UserGateway;
import com.softuai.SofIA.infrastructure.mapper.user.UserCoreMapper;
import com.softuai.SofIA.infrastructure.persistence.entity.UserEntity;
import com.softuai.SofIA.infrastructure.persistence.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
public class UserGatewayImpl implements UserGateway {

    private final UserRepository userRepository;
    private final UserCoreMapper userCoreMapper;

    @Override
    public void BlocUserUseCase(Long id) {

    }

    @Override
    public void ChangePasswordUseCase(Long id, String currentPassword, String newPassword) {

    }

    @Override
    public User CreateUserUseCase(User user) {
        UserEntity entityToSave = userCoreMapper.toEntity(user);
        UserEntity savedEntity = userRepository.save(entityToSave);
        return userCoreMapper.toCore(savedEntity);
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
