package ir.shayandaneshvar.apiconsumer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Name implements Serializable {
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
    private User user;

    public Name(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

}
