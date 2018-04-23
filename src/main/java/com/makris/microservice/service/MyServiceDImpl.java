package com.makris.microservice.service;

import com.makris.microservice.model.User;
import org.springframework.stereotype.Service;

@Service
public class MyServiceDImpl implements MyServiceD{
    @Override
    public User getUser(){
        return new User("MockUser", 1);
    }
}
