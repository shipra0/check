package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String city;
    private String country;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private UserEntity userEntity;

}
