package com.timor.service;

import com.timor.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser(String uid) {
        User zhouyu = new User(uid, "zhouyu");
        return zhouyu;
    }
}