package com.yexuejc.springcloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 服务消费者（Feign）
 *
 * @ClassName: SpringcloudFeignApplication
 * @Description:
 * @author: maxf
 * @date: 2018/4/16 15:21
 */
@SpringBootApplication
@EnableDiscoveryClient
//开启feign
@EnableFeignClients
//开启熔断器Hystrix仪表盘
@EnableHystrixDashboard
public class SpringcloudFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignApplication.class, args);
    }
}
