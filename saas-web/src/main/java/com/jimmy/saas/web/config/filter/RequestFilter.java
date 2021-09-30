package com.jimmy.saas.web.config.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import java.io.IOException;

/**
 * @ClassName RequestFilter
 * @Description 请求过滤 ContainerRequestFilter请求过滤接口
 * @Author Mr.Jangni
 * @Date 2019/3/28 13:29
 * @Version 1.0
 **/
public class RequestFilter implements ContainerRequestFilter {
    private final Logger logger = LoggerFactory.getLogger(RequestFilter.class);

    @Override
    public void filter(ContainerRequestContext request) throws IOException {
        logger.info("Request Filter Test ----");
        logger.info(request.getMethod());
    }
}
