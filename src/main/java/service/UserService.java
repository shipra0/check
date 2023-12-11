package service;

import dto.UserDto;

public interface UserService {
    void updateUserById(UserDto userDto, Integer id);

}
