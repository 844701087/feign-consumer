package com.lkf.Fallback;

import com.lkf.external.HelloClient;
import com.lkf.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by likaifeng on 2017/7/18.
 */
@Component
public class HelloClientFallback implements HelloClient {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("未知",0);
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
