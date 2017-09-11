package com.mao;

import com.mao.model.User;
import com.mao.service.UserService;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaDemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void testJpa() {
        List<User> users = new ArrayList<>(Arrays.asList(
                new User(1, "mao", "毛"),
                new User(2, "liu", "刘")
        ));
        userService.addUser(users.get(0));
    }

}
