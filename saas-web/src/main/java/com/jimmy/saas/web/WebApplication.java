package com.jimmy.saas.web;

import com.taobao.pandora.boot.PandoraBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author zhangguoq
 **/
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        PandoraBootstrap.run(args);
        SpringApplication.run(WebApplication.class, args);
        PandoraBootstrap.markStartupAndWait();
    }
}