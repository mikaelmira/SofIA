package com.softuai.SofIA.core.useCase.user;

import com.softuai.SofIA.core.entity.User;

public interface GetUserByIdUseCase {

    User execute(Long id);

}
