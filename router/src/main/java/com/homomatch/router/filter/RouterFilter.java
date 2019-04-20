package com.homomatch.router.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Nick Yuan
 * @date 2019/2/14
 * @mood shitty
 */
@Component
public class RouterFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
//        RequestContext context=RequestContext.getCurrentContext();
//        HttpServletRequest request = context.getRequest();
//        request.getHeader("auth")
        return null;
    }
}
