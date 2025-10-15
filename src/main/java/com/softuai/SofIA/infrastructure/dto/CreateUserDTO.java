package com.softuai.SofIA.infrastructure.dto;

import com.softuai.SofIA.core.enums.AccountStatus;

import java.time.LocalDate;

public record CreateUserDTO(
        String name,
        String email,
        String password,
        String profilePicture,
        String phone,
        AccountStatus accountStatus,
        LocalDate birthday
) {
}
