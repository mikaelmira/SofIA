package com.softuai.SofIA.infrastructure.gateway;

import com.softuai.SofIA.core.entity.User;
import com.softuai.SofIA.core.gateway.UserGateway;
import com.softuai.SofIA.infrastructure.configuration.security.Argon2PasswordEncoder;
import com.softuai.SofIA.infrastructure.mapper.user.UserCoreMapper;
import com.softuai.SofIA.infrastructure.persistence.entity.UserEntity;
import com.softuai.SofIA.infrastructure.persistence.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class UserGatewayImpl implements UserGateway {

    private final UserRepository userRepository;
    private final UserCoreMapper userCoreMapper;
    private final Argon2PasswordEncoder argon2PasswordEncoder;

    @Override
    public void blockUserUseCase(Long id) {

    }

    @Override
    public void changePasswordUseCase(Long id, String currentPassword, String newPassword) {

    }

    @Override
    public User createUserUseCase(User user) {
        UserEntity entityToSave = userCoreMapper.toEntity(user);
        UserEntity savedEntity = userRepository.save(entityToSave);
        return userCoreMapper.toCore(savedEntity);
    }

    @Override
    public User getUserByIdUseCase(Long id) {
        return null;
    }

    @Override
    public User patchUserUseCase(Long id, Map<String, Object> params) {
        return null;
    }

    @Override
    public void recordFailedLoginUseCase(Long id) {

    }

    @Override
    public void requestPasswordResetUseCase(Long userId, String token, int minutesValid) {

    }

    @Override
    public void resetPasswordUseCase(Long id, String token, String newPassword) {

    }

    @Override
    public void unblockUserUseCase(Long id) {

    }

    @Override
    public String encodePasswordUseCase(String password) {
        return argon2PasswordEncoder.encode(password);
    }

    @Override
    public boolean matchPasswordUseCase(String password, String databasePassword) {
        return false;
    }
}
