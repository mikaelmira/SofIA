package com.softuai.SofIA.core.useCase.user;

import com.softuai.SofIA.core.entity.User;
import com.softuai.SofIA.core.enums.AccountStatus;
import com.softuai.SofIA.core.gateway.UserGateway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CreateUserUseCaseImplTest {

    private UserGateway userGateway;
    private CreateUserUseCaseImpl createUserUseCase;

    @BeforeEach
    void setUp() {
        userGateway = mock(UserGateway.class);
        createUserUseCase = new CreateUserUseCaseImpl(userGateway);
    }

    @Test
    void shouldCreateUserSuccessfully() {
        User inputUser = new User(
                null,
                "Mikael Mira",
                "mikael@example.com",
                "123456",
                null,
                "+5511999999999",
                0,
                null,
                AccountStatus.ACTIVE,
                LocalDate.of(2000, 4, 15),
                null,
                null,
                null,
                null,
                null,
                false,
                null,
                null
        );

        User savedUser = new User(
                null,
                "Mikael Mira",
                "mikael@example.com",
                "encodedPassword",
                null,
                "+5511999999999",
                0,
                null,
                AccountStatus.ACTIVE,
                LocalDate.of(2000, 4, 15),
                null,
                null,
                null,
                null,
                null,
                false,
                null,
                null
        );
        when(userGateway.createUserUseCase(any(User.class))).thenReturn(savedUser);
        when(userGateway.encodePasswordUseCase("123456")).thenReturn("encodedPassword");

        User result = createUserUseCase.execute(inputUser);

        assertNotNull(result);
        assertEquals("Mikael Mira", result.name());
        assertEquals("mikael@example.com", result.email());
        assertEquals("encodedPassword", result.password());

        ArgumentCaptor<User> captor = ArgumentCaptor.forClass(User.class);
        verify(userGateway).createUserUseCase(captor.capture());

        User capturedUser = captor.getValue();
        assertEquals("Mikael Mira", capturedUser.name());
        assertEquals("mikael@example.com", capturedUser.email());
        assertEquals("encodedPassword", capturedUser.password());
    }
}