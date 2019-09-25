package ir.shayandaneshvar.apifactory.bootstrap;

import ir.shayandaneshvar.apifactory.domain.*;
import ir.shayandaneshvar.apifactory.repositories.DataRepository;
import ir.shayandaneshvar.apifactory.repositories.JobRepository;
import ir.shayandaneshvar.apifactory.repositories.NameRepository;
import ir.shayandaneshvar.apifactory.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;

@Component
@RequiredArgsConstructor
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private final NameRepository nameRepository;
    private final JobRepository jobRepository;
    private final UserRepository userRepository;
    private final DataRepository dataRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Job sd = new Job("Software Developer");
        Job dg = new Job("Designer");
        Job st = new Job("Student");
        jobRepository.save(st);
        jobRepository.save(sd);
        jobRepository.save(dg);
        Name ali = new Name("ali", "alavi", "ali20");
        Name naghi = new Name("naghi", "mamooli", "namool");
        nameRepository.save(ali);
        nameRepository.save(naghi);
        User us = new User(ali, "1234", Gender.MALE, "ali@alavi.com", dg);
        User us1 = new User(naghi, "1342", Gender.MALE, "namoo@kntu.ac.ir", st);
        Data data = new Data();
        data.getUserData().addAll(Arrays.asList(us, us1));
        dataRepository.save(data);
        userRepository.save(us);
        userRepository.save(us1);

    }
}
