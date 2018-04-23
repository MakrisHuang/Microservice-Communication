package com.makris.microservice.service;

import com.makris.microservice.model.User;

public interface MyServiceC {
    User getUserByOkHttp(String username);
}
