package com.yexuejc.springcloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者（rest+ribbon）
 *
 * @ClassName: SpringcloudRibbonApplication
 * @Description:
 * @author: maxf
 * @date: 2018/4/16 14:52
 */
@SpringBootApplication
@EnableDiscoveryClient
//启动熔断器
@EnableHystrix
//开启熔断器Hystrix仪表盘
@EnableHystrixDashboard
public class SpringcloudRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRibbonApplication.class, args);
    }


    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
