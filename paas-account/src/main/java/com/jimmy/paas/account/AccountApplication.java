package com.jimmy.paas.account;

import com.taobao.pandora.boot.PandoraBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author zhangguoq
 **/
@SpringBootApplication
public class AccountApplication {

    public static void main(String[] args) {
        // 启动Pandora Boot用于加载Pandora容器。
        PandoraBootstrap.run(args);
        SpringApplication.run(AccountApplication.class, args);
        // 标记服务启动完成，并设置线程wait。防止业务代码运行完毕退出后，导致容器退出。
        PandoraBootstrap.markStartupAndWait();
    }
}