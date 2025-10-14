package com.softuai.SofIA.core.useCase.user;

public interface ResetPasswordUseCase {

    void execute(Long id, String token, String newPassword);

}
