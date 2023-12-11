package dto;

import entity.AddressEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private List<AddressDto> addressDtoList;
}
