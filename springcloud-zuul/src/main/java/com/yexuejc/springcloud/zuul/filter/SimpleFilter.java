package com.yexuejc.springcloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.yexuejc.base.http.Resps;
import com.yexuejc.base.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义网关zuul过滤器
 *
 * @PackageName: com.yexuejc.springcloud.zuul
 * @Description:
 * @author: maxf
 * @date: 2018/4/17 9:44
 */
@Component
public class SimpleFilter extends ZuulFilter {
    Logger logger = LoggerFactory.getLogger(SimpleFilter.class);

    /**
     * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型
     * 具体如下：
     * pre：路由之前
     * route：路由之时
     * post： 路由之后
     * error：发送错误调用
     *
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * filterOrder：过滤的顺序
     * 优先级为0，数字越大，优先级越低
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * shouldFilter：这里可以写逻辑判断，是否要过滤。
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
     *
     * @return
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        //这里只对  /my/xxx   xxxx/my  xx/my/xxx 过滤
        if (request.getServletPath().indexOf("/my") == -1) {
            return null;
        }
        Object accessToken = request.getHeader("token");
        if (accessToken == null) {
            logger.warn("token is empty");
            // 对该请求不进行路由
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write(JsonUtil.obj2Json(Resps.error("token is empty")));
            } catch (Exception e) {
            }

            return null;
        }
        logger.info("ok");
        return null;
    }
}
