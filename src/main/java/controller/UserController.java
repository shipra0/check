package controller;

import dto.UserDto;
import jakarta.persistence.Id;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

@PutMapping("/updateUser/{id}")
    public String updateUserById(@RequestBody UserDto userDto, @PathVariable("id")Integer id) throws Exception{
userService.updateUserById(userDto,id);
return "user updated";
}



}
