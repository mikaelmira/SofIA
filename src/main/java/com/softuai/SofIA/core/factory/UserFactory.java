package com.softuai.SofIA.core.factory;

import com.softuai.SofIA.core.entity.User;
import com.softuai.SofIA.core.enums.AccountStatus;

import java.time.LocalDate;

public final class UserFactory {

    private UserFactory() {}

    public static User create(
            String name,
            String email,
            String password,
            String profilePicture,
            String phone,
            LocalDate birthday
    ) {

        return new User(
                null,
                name,
                email,
                password,
                profilePicture,
                phone,
                0,
                null,
                AccountStatus.ACTIVE,
                birthday,
                null,
                null,
                null,
                null,
                null,
                false,
                null,
                null
        );
    }

}
