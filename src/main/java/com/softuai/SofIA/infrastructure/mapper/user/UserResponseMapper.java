package com.softuai.SofIA.infrastructure.mapper.user;

import com.softuai.SofIA.core.entity.User;
import com.softuai.SofIA.infrastructure.dto.UserResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserResponseMapper {

    UserResponseDTO toResponse(User core);

}
