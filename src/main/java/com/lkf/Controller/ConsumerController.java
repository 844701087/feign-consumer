package com.lkf.Controller;

import com.lkf.external.HelloClient;
import com.lkf.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by likaifeng on 2017/7/18.
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloClient helloClient;

    @RequestMapping(value = "/feignhello")
    public String helloConsumer(){
        return helloClient.hello();
    }

    @RequestMapping(value = "/feignhello1")
    public String helloConsumer1(){
        StringBuilder sb = new StringBuilder();
        sb.append(helloClient.hello()).append("-");
        sb.append(helloClient.hello("DIDI")).append("-");
        sb.append(helloClient.hello("DIDI",30)).append("-");
        sb.append(helloClient.hello(new User("DIDI",31))).append("-");
        return sb.toString();
    }


}

