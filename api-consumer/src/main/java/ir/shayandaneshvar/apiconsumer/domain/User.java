package ir.shayandaneshvar.apiconsumer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Email;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Long id;
    private Name name;
    private String password;
    private Gender gender;
    private String Email;
    private Job job;
    private ir.shayandaneshvar.apiconsumer.domain.Data data;

    public User(Name name, String password, Gender gender, String Email, Job job) {
        this.name = name;
        this.job = job;
        this.password = password;
        this.gender = gender;
        this.Email = Email;
    }
}
