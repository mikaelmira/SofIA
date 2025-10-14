package com.softuai.SofIA.core.useCase.user;

public interface ChangePasswordUseCase {

    void execute(Long id, String currentPassword, String newPassword);

}
