package com.yexuejc.springcloud.eureka.client.web;

import com.yexuejc.base.http.Resps;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName: com.yexuejc.springcloud.eureka.client
 * @Description:
 * @author: maxf
 * @date: 2018/4/16 11:37
 */
@RestController
public class ApiCtrl {

    @Value("${server.port}")
    Integer port;

    /**
     * index
     *
     * @return
     */
    @RequestMapping("/api/test")
    public Resps test() {
        return Resps.success().setSucc("server.port：" + port);
    }
}
