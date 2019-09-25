package ir.shayandaneshvar.apiconsumer.services;

import ir.shayandaneshvar.apiconsumer.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getUser() {
        User user = apiService.getUser(1);
        System.err.println(" $$$ " + user.getEmail());
        assertTrue(user.getEmail().equals("ali@alavi.com"));
    }

    @Test
    public void getUsers() {
        //do later
    }
}