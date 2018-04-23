package com.makris.microservice.config;

import com.makris.microservice.service.MyServiceC;
import com.makris.microservice.service.MyServiceCImpl;
import com.squareup.okhttp.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class MyServiceCConfig {
    @Bean
    public OkHttpClient okHttpClient(){
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(2000, TimeUnit.MILLISECONDS);
        okHttpClient.setReadTimeout(3000, TimeUnit.MILLISECONDS);
        okHttpClient.setWriteTimeout(3000, TimeUnit.MILLISECONDS);
        return okHttpClient;
    }

    @Bean
    public MyServiceC myServiceC(){
        return new MyServiceCImpl();
    }
}
