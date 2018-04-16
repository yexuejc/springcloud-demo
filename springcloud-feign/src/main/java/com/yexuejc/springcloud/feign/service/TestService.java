package com.yexuejc.springcloud.feign.service;

import com.yexuejc.base.http.Resps;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @PackageName: com.yexuejc.springcloud.feign
 * @Description:
 * @author: maxf
 * @date: 2018/4/16 15:24
 */
@FeignClient(value = "SERVICE-API", fallback = com.yexuejc.springcloud.feign.service.TestServiceImpl.class)
public interface TestService {
    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    public Resps test();
}
