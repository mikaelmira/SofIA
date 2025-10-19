package com.softuai.SofIA.core.factory;

import com.softuai.SofIA.core.entity.User;
import com.softuai.SofIA.core.enums.AccountStatus;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {

    @Test
    void shouldCreateUserWithCorrectDefaults() {
        String name = "Mikael Mira";
        String email = "mikael@example.com";
        String password = "123456";
        String profilePicture = null;
        String phone = "+5511999999999";
        LocalDate birthday = LocalDate.of(2000, 4, 15);

        User user = UserFactory.create(name, email, password, profilePicture, phone, birthday);

        assertNotNull(user);
        assertNull(user.id());
        assertEquals(name, user.name());
        assertEquals(email, user.email());
        assertEquals(password, user.password());
        assertEquals(profilePicture, user.profilePicture());
        assertEquals(phone, user.phone());
        assertEquals(birthday, user.birthday());
        assertEquals(AccountStatus.ACTIVE, user.accountStatus());
        assertEquals(0, user.loginAttempts());
        assertFalse(user.twoFactorEnabled());
        assertNull(user.temporaryBlockUntil());
        assertNull(user.createdAt());
        assertNull(user.updatedAt());
    }

}