package impl;

import dto.UserDto;
import entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.UserRepo;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserImpl{

    @Autowired
    private UserRepo userRepo;

  public void updateUserById(UserDto userDto,Integer id){

      Optional<UserEntity> optionalUser = userRepo.findById(id);
      if(!optionalUser.isPresent()) {
          throw new RuntimeException();
      }
      UserEntity savedUser = optionalUser.get();
     if(Objects.nonNull(userDto.getFirstName()) &&
              !Objects.equals(userDto.getFirstName(), savedUser.getFirstName())) {
          savedUser.setFirstName(userDto.getFirstName());
      }

      userRepo.save(savedUser);





  }

}
