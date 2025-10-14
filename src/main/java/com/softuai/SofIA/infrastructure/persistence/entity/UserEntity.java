package com.softuai.SofIA.infrastructure.persistence.entity;

import com.softuai.SofIA.core.enums.AccountStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(
        name = "tb_user",
        indexes = {
                @Index(name = "idx_user_email", columnList = "email"),
                @Index(name = "idx_user_phone", columnList = "phone")
        }
)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    @Column(name = "name", nullable = false)
    private String name;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email cannot be blank")
    @Size(max = 120, message = "Email 120 characters")
    @Column(name = "email", nullable = false, unique = true, length = 120)
    private String email;

    @NotBlank(message = "Password cannot be blank")
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "profile_picture")
    private String profilePicture;

    @NotBlank(message = "Phone number is required")
    @Pattern(
            regexp = "^(\\+\\d{1,3}\\s?)?(\\(\\d{2,3}\\)\\s?)?\\d{4,5}-\\d{4}$",
            message = "Invalid phone format"
    )
    @Column(name = "phone", nullable = false, unique = true, length = 20)
    private String phone;

    @Column(name = "login_attempts", nullable = false)
    private int loginAttempts;

    @Column(name = "temporary_block_until")
    private LocalDateTime temporaryBlockUntil;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_status", nullable = false)
    private AccountStatus accountStatus;

    @Column(name = "birthday", nullable = false)
    private LocalDate birthday;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "last_name_change")
    private LocalDateTime lastNameChange;

    @Column(name = "password_reset_token")
    String passwordResetToken;

    @Column(name = "password_reset_token_expiry")
    LocalDateTime passwordResetTokenExpiry;

    @Column(name = "two_factor_enabled", nullable = false)
    boolean twoFactorEnabled;

    @Column(name = "two_factor_secret")
    String twoFactorSecret;

    @Column(name = "last_two_factor_validation")
    LocalDateTime lastTwoFactorValidation;

}
