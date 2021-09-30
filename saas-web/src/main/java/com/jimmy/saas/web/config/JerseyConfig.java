package com.jimmy.saas.web.config;

import com.jimmy.saas.web.config.filter.RequestFilter;
import com.jimmy.saas.web.config.filter.RequestReaderInterceptor;
import com.jimmy.saas.web.config.filter.ResponseFilter;
import com.jimmy.saas.web.config.filter.ResponseWriterInterceptor;
import com.jimmy.saas.web.config.handler.ResponseExceptionHandler;
import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

/**
 * @Description
 * @Author zhangguoq
 **/
@Configuration
@ApplicationPath("/saas-web")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        //注册Spring Filter
        register(RequestContextFilter.class);
        //自动扫描包
        packages("com.jimmy.saas.web.controller");
        //手动添加配置选项
        property(LoggingFeature.LOGGING_FEATURE_LOGGER_LEVEL_SERVER, "INFO");
        property(LoggingFeature.LOGGING_FEATURE_VERBOSITY_SERVER, LoggingFeature.Verbosity.PAYLOAD_ANY);
        //自定义异常处理
        register(ResponseExceptionHandler.class);

        // 上传下载 注册支持multipart-formdata格式的请求
        register(MultiPartFeature.class);

        //自定义过滤器
        register(RequestFilter.class);
        register(ResponseFilter.class);
        //自定义拦截器
        register(RequestReaderInterceptor.class);
        register(ResponseWriterInterceptor.class);


    }
}