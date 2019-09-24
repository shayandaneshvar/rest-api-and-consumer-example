package ir.shayandaneshvar.apiconsumer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Job implements Serializable {
    private Long id;
    private String title;
    public Job(String job) {
        title = job;
    }
}
