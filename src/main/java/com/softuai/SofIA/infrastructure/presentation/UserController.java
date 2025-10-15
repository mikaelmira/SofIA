package com.softuai.SofIA.infrastructure.presentation;

import com.softuai.SofIA.core.entity.User;
import com.softuai.SofIA.core.useCase.user.CreateUserUseCase;
import com.softuai.SofIA.infrastructure.dto.CreateUserDTO;
import com.softuai.SofIA.infrastructure.dto.UserResponseDTO;
import com.softuai.SofIA.infrastructure.mapper.user.CreateUserMapper;
import com.softuai.SofIA.infrastructure.mapper.user.UserCoreMapper;
import com.softuai.SofIA.infrastructure.mapper.user.UserResponseMapper;
import com.softuai.SofIA.infrastructure.persistence.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final CreateUserUseCase createUserUseCase;
    private final CreateUserMapper createUserMapper;
    private final UserCoreMapper userCoreMapper;
    private final UserResponseMapper userResponseMapper;

    @PostMapping
    private ResponseEntity<UserResponseDTO> createUser(@RequestBody CreateUserDTO request) {
        UserEntity userEntity = createUserMapper.toEntity(request);
        User userCore = userCoreMapper.toCore(userEntity);
        User createdUser = createUserUseCase.execute(userCore);
        UserResponseDTO response = userResponseMapper.toResponse(createdUser);
        return ResponseEntity.ok(response);
    }

}
