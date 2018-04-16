package com.yexuejc.springcloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yexuejc.base.http.Resps;

/**
 * @PackageName: com.yexuejc.springcloud.ribbon.service
 * @Description:
 * @author: maxf
 * @date: 2018/4/16 14:59
 */
public interface TestService {
    public Resps test();

    public Resps testErr();
}
