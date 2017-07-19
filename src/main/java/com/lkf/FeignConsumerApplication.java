package com.lkf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
/**
 * Spring Cloud Feign整合了Spring Cloud Ribbon和Spring Cloud Hystrix，除了提供这两者的强大功能以外，它还提供了一种声明式的web服务客户端定义式
 *@EnableFeignClients开启Spring Cloud Feign支持
 * Feign默认实现了Ribbon重试机制
 *@author: lkf
 *@Date: 2017/7/18 17:03
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class FeignConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignConsumerApplication.class, args);
	}
}
