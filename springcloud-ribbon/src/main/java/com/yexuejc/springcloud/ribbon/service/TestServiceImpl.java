package com.yexuejc.springcloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yexuejc.base.http.Resps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @PackageName: com.yexuejc.springcloud.ribbon
 * @Description:
 * @author: maxf
 * @date: 2018/4/16 14:54
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "testErr")
    public Resps test() {
        return restTemplate.getForObject("http://SERVICE-API/api/test", Resps.class);
    }

    @Override
    public Resps testErr() {
        return Resps.error("服务器异常");
    }
}
