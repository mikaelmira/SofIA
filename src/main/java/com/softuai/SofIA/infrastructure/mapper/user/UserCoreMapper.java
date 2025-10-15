package com.softuai.SofIA.infrastructure.mapper.user;

import com.softuai.SofIA.core.entity.User;
import com.softuai.SofIA.infrastructure.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserCoreMapper {

    User toCore(UserEntity entity);

    UserEntity toEntity(User core);

}
