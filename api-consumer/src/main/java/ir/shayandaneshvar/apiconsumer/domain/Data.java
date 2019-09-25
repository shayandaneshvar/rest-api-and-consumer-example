package ir.shayandaneshvar.apiconsumer.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Data {
    private Long id;
    List<User> userData = new ArrayList<>();
}
