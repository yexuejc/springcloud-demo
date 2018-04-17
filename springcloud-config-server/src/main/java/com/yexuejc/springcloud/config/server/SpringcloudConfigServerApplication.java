package com.yexuejc.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 分布式配置中心(Spring Cloud Config)
 *
 * @ClassName: SpringcloudConfigServerApplication
 * @Description:
 * @author: maxf
 * @date: 2018/4/17 11:15
 */
@SpringBootApplication
//开启配置服务
@EnableConfigServer
public class SpringcloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigServerApplication.class, args);
    }
}
