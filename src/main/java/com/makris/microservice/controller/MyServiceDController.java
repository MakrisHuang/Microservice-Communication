package com.makris.microservice.controller;

import com.makris.microservice.model.User;
import com.makris.microservice.service.MyServiceD;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api("myserviceD相關API")
@RestController
@RequestMapping("myserviceD")
public class MyServiceDController {
    @Autowired
    MyServiceD myServiceD;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUserByName(@RequestParam("username") String username){
        return myServiceD.getUser();
    }
}
