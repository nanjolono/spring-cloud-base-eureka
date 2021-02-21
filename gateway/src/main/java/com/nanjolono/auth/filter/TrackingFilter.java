package com.nanjolono.auth.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class TrackingFilter extends ZuulFilter {

    private static final int FILTER_ORDER = 1;
    private static final boolean SHOULD_FILTER=true;
    private static final Logger logger = LoggerFactory.getLogger(TrackingFilter.class);

    @Autowired
    FilterUtils filterUtils;

    @Override
    /**
     * 前置路由过滤器
     */
    public String filterType() {
        return FilterUtils.PRE_FILTER_TYPE;
    }

    @Override
    /**
     * 指定不同类型的过滤器的执行顺序
     */
    public int filterOrder() {
        return FILTER_ORDER;
    }

    @Override
    /**
     * 表示该过滤器是否执行
     */
    public boolean shouldFilter() {
        return SHOULD_FILTER;
    }

    @Override
    public Object run() throws ZuulException {
        if(isCorrelationIdPresent()){
            logger.debug("tmx-correlation-id found in tracking filter{}",
                    filterUtils.getCorrelationId());
        }else {
            filterUtils.setCorrelationId(generateCorrelationId());
            logger.debug("tmx-correlation-id found in tracking filter{}",
                    filterUtils.getCorrelationId());
        }

        RequestContext ctx = RequestContext.getCurrentContext();
        logger.debug("Processing incoming request for {}.",
                ctx.getRequest().getRequestURI());
        return null;
    }

    /**
     * 生成随机uuid
     * @return uuid
     */
    private String generateCorrelationId(){
        return java.util.UUID.randomUUID().toString();
    }

    private boolean isCorrelationIdPresent(){
        return filterUtils.getCorrelationId() != null;
    }
}
