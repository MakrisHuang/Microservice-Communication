package com.makris.microservice.service;

import com.alibaba.fastjson.JSON;
import com.makris.microservice.model.User;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MyServiceCImpl implements MyServiceC{
    @Autowired
    OkHttpClient okHttpClient;

    @Override
    public User getUserByOkHttp(String username){
        User user = null;
        Response response = null;
        String url = "http://localhost:8080/myserviceD/getUser?username=" + username;
        try{
            Request request = new Request.Builder().url(url).build();
            response = okHttpClient.newCall(request).execute();
            String userStr = response.body().string();
            user = JSON.parseObject(userStr, User.class);
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (response != null && response.body() != null){
                try {
                    response.body().close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return user;
    }
}
