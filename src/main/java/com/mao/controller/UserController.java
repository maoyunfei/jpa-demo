package com.mao.controller;

import com.mao.model.User;
import com.mao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author: maoyunfei
 * Date: 2017/9/6
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/save")
    public Integer saveUser(@RequestParam("name") String name, @RequestParam("des") String description) {
        User user = new User();
        user.setName(name);
        user.setDescription(description);
        userService.addUser(user);
        return user.getId();
    }

    @GetMapping(value = "/user/{id:\\d+}")
    public User getUser(@PathVariable("id") Integer id) {
        return userService.getUser(id);
    }
}
