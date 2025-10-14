CREATE TABLE tb_user (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(120) NOT NULL UNIQUE,
    password TEXT NOT NULL,
    profile_picture TEXT,
    phone VARCHAR(20) NOT NULL UNIQUE,
    login_attempts INT NOT NULL DEFAULT 0,
    temporary_block_until TIMESTAMP,
    account_status VARCHAR(20) NOT NULL,
    birthday DATE NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    last_name_change TIMESTAMP,
    password_reset_token VARCHAR(255),
    password_reset_token_expiry TIMESTAMP,
    two_factor_enabled BOOLEAN NOT NULL DEFAULT FALSE,
    two_factor_secret VARCHAR(255),
    last_two_factor_validation TIMESTAMP
);

CREATE INDEX idx_user_email ON tb_user(email);
CREATE INDEX idx_user_phone ON tb_user(phone);
