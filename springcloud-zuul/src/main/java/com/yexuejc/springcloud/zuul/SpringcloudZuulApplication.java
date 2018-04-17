package com.yexuejc.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * 路由网关(zuul)
 *
 * @ClassName: SpringcloudZuulApplication
 * @Description:
 * @author: maxf
 * @date: 2018/4/17 9:23
 */
@SpringBootApplication
@EnableEurekaClient
//开启zuul的功能
@EnableZuulProxy
public class SpringcloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuulApplication.class, args);
    }
}
