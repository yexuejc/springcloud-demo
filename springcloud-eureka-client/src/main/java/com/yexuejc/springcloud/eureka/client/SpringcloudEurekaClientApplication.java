package com.yexuejc.springcloud.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者
 *
 * @ClassName: SpringcloudEurekaClientApplication
 * @Description:
 * @author: maxf
 * @date: 2018/4/16 11:28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaClientApplication.class, args);
    }
}
