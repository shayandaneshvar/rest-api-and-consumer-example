package ir.shayandaneshvar.apifactory.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @NonNull
    private Name name;
    private String password;
    @Enumerated
    @NonNull
    private Gender gender;
    @Email
    private String Email;
    @ManyToOne
    private Job job;
    @ManyToOne
    private ir.shayandaneshvar.apifactory.domain.Data data;

    public User(Name name, String password, Gender gender, String Email, Job job) {
        this.name = name;
        this.job = job;
        this.password = password;
        this.gender = gender;
        this.Email = Email;
    }
}
