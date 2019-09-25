package ir.shayandaneshvar.apiconsumer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Name implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private User user;

    public Name(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

}
