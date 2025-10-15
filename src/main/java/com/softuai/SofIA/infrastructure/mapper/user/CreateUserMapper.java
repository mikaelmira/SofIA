package com.softuai.SofIA.infrastructure.mapper.user;

import com.softuai.SofIA.infrastructure.dto.CreateUserDTO;
import com.softuai.SofIA.infrastructure.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CreateUserMapper {

    UserEntity toEntity(CreateUserDTO dto);

    CreateUserDTO toDTO(UserEntity userEntity);

}
