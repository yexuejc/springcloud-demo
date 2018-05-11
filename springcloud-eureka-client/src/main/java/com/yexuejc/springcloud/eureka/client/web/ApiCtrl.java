package com.yexuejc.springcloud.eureka.client.web;

import com.yexuejc.base.http.Resps;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
        Map map = new HashMap();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        map.put("server.port", port);
        return Resps.success().setSucc(map);
    }
}
