package com.yexuejc.springcloud.ureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * spring cloid 服务注册中心
 *
 * @ClassName: SpringcloudEurekaServerApplication
 * @Description:
 * @author: maxf
 * @date: 2018/4/16 10:49
 */
@SpringBootApplication
//开启服务注册中心
@EnableEurekaServer
public class SpringcloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServerApplication.class, args);
    }
}
