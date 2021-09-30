package com.jimmy.saas.web.config;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author zhangguoq
 **/
@Configuration
public class ConfigBean {

    @Bean
    public ServletRegistrationBean jerseyServlet() {

        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/saas-web/*");
        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());
        return registration;
    }
}