package com.lkf.external;

import com.lkf.Fallback.HelloClientFallback;
import com.lkf.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *通过@FeignClient注解绑定服务,然后使用Spring Mvc的注解来绑定具体该服务提供的REST接口
 * fallback利用Hystrix实现降级服务
 * Created by likaifeng on 2017/7/18.
 * 在使用@FeigClient注解时，Spring Cloud Feigon会根据该注解的name属性或者value属性
 * 指定的服务名，自动创建一个同名的Ribbon客户端，然后我们就可以配置ribbon的参数，
 * 例如:
 *      hello-service.ribbon.ConnectTimeout=500
 */
@Component
@FeignClient(name = "hello-service",fallback = HelloClientFallback.class)
public interface HelloClient {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping("/hello1")
    String hello(@RequestParam("name") String name);

    @RequestMapping("/hello2")
    User hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age);

    @RequestMapping("/hello3")
    String hello(@RequestBody User user);
}
