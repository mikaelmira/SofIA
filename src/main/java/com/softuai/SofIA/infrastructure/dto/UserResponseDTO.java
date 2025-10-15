package com.softuai.SofIA.infrastructure.dto;

import com.softuai.SofIA.core.enums.AccountStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record UserResponseDTO(
        Long id,
        String name,
        String email,
        String profilePicture,
        String phone,
        int loginAttempts,
        LocalDateTime temporaryBlockUntil,
        AccountStatus accountStatus,
        LocalDate birthday,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        LocalDateTime lastNameChange,
        String passwordResetToken,
        LocalDateTime passwordResetTokenExpiry,
        boolean twoFactorEnabled,
        String twoFactorSecret,
        LocalDateTime lastTwoFactorValidation
        //TODO: List<LoginAttempt> loginHistory
) {
}
