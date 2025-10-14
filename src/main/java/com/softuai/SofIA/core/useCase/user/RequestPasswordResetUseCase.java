package com.softuai.SofIA.core.useCase.user;

public interface RequestPasswordResetUseCase {

    void execute(Long userId, String token, int minutesValid);

}
