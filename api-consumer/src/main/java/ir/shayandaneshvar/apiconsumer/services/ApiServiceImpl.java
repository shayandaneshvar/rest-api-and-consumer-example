package ir.shayandaneshvar.apiconsumer.services;

import ir.shayandaneshvar.apiconsumer.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    // TODO: 9/24/19  
    @Override
    public List<User> getUsers(Integer count) {
        return null;
    }
}
