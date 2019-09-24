package ir.shayandaneshvar.apiconsumer.services;

import ir.shayandaneshvar.apiconsumer.domain.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(Integer count);
}
