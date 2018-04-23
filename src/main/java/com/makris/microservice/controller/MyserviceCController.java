package com.makris.microservice.controller;

import com.makris.microservice.model.User;
import com.makris.microservice.service.MyServiceC;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api("myservicec相關API")
@RestController
@RequestMapping("/myserviceC")
public class MyserviceCController {
    @Autowired
    MyServiceC myServiceC;

    @RequestMapping(value = "/okhttp/getUser", method = RequestMethod.GET)
    public User getUserByokHttp(@RequestParam("username") String username){
        return myServiceC.getUserByOkHttp(username);
    }
}
