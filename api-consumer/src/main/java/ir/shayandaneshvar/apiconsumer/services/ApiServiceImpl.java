package ir.shayandaneshvar.apiconsumer.services;

import ir.shayandaneshvar.apiconsumer.domain.Data;
import ir.shayandaneshvar.apiconsumer.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public User getUser(Integer number) {
        User user = restTemplate.getForObject("http://localhost:8081/users/" + number, User.class);
        return user;
    }

    @Override
    public List<User> getUsers() {
        Data data = restTemplate.getForObject("http://localhost:8081/datas", Data.class);
        return data.getUserData();
    }
}
