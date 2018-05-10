package com.yexuejc.springcloud.client.web;

import com.yexuejc.base.http.Resps;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: com.yexuejc.springcloud.springcloudconfigclient
 * @Description:
 * @author: maxf
 * @date: 2018/5/10 15:05
 */
@RestController
public class TestCtrl {

    @Value("${version}")
    String version;
    @Value("${info}")
    String info;
    @Value("${update-time}")
    String updateTime;

    /**
     * @return
     */
    @RequestMapping("/conf")
    public Resps conf() {
        Map map = new HashMap();
        map.put("version", version);
        map.put("info", info);
        map.put("updateTime", updateTime);
        return Resps.success().setSucc(map);
    }
}
