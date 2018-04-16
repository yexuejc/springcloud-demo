package com.yexuejc.springcloud.feign.service;

import com.yexuejc.base.http.Resps;
import org.springframework.stereotype.Service;

/**
 * @PackageName: com.yexuejc.springcloud.feign.service
 * @Description:
 * @author: maxf
 * @date: 2018/4/16 16:43
 */
@Service("com.yexuejc.springcloud.feign.service.TestServiceImpl")
public class TestServiceImpl implements TestService {
    @Override
    public Resps test() {
        return Resps.error("服务器异常");
    }
}
