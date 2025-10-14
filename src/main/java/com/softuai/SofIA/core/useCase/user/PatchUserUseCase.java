package com.softuai.SofIA.core.useCase.user;

import com.softuai.SofIA.core.entity.User;

import java.util.Map;

public interface PatchUserUseCase {

    User execute(Long id, Map<String, Object> params);

}
