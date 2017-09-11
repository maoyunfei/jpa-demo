package com.mao.service;

import com.mao.model.User;
import com.mao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 *
 * @author: maoyunfei
 * Date: 2017/9/6
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public User getUser(Integer id) {
        return userRepository.findOne(id);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Integer id) {
        userRepository.delete(id);
    }

}
