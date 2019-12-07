package com.bjsxt.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpStatus;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 网关过滤器
 * 加入到Spring容器
 */
@Component
public class UserLoginZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //前置过滤器
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        //设置执行顺序
        return FilterConstants.PRE_DECORATION_FILTER_ORDER+1;
    }

    @Override
    public boolean shouldFilter() {
        //设置过滤器是否生效
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String token = request.getParameter("token");
        if (StringUtils.isEmpty(token)) {
            //过滤该请求,不对其进行路由
            requestContext.setSendZuulResponse(false);
            //设置响应状态码
            requestContext.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
            //设置响应信息
            requestContext.setResponseBody("token is empty!");

        }
        return null;
    }
}
