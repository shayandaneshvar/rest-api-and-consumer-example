package ir.shayandaneshvar.apifactory.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@NoArgsConstructor
@Entity
@Data
@AllArgsConstructor
public class Name implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 2,max = 10)
    private String firstName;
    @NotBlank
    @Size(min = 2,max = 16)
    private String lastName;
    @NotBlank
    @Size(min = 3,max = 16)
    private String userName;
    @OneToOne(cascade = CascadeType.ALL)
    @NonNull
    private User user;

    public Name(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

}
