package com.yexuejc.springcloud.feign.web;

import com.yexuejc.base.http.Resps;
import com.yexuejc.springcloud.feign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: com.yexuejc.springcloud.ribbon
 * @Description:
 * @author: maxf
 * @date: 2018/4/16 14:58
 */
@RestController
public class TestCtrl {

    @Autowired
    TestService testService;

    @RequestMapping("/{id}/test")
    public Resps getTest(@PathVariable String id) {
        Map map = new HashMap();
        map.put("id", id);
        map.put("data", testService.test());
        return Resps.success().setSucc(map);
    }
}
