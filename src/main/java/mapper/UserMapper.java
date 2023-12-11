package mapper;

import dto.UserDto;
import entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;


@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {


    @Mapping(source = "addressDtoList", target = "addressEntityList")
    UserEntity toEntity(UserDto userDto);
    UserDto toDto(UserEntity userEntity);


}

