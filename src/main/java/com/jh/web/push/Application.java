package com.jh.web.push;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.jh.web.push.service.AccountService;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

public class Application extends ResourceConfig {

    // 公共的构造函数
    public Application(){
        // 注册逻辑处理的包名
//        packages("com.jh.web.push.service");  //调用父类方法
        packages(AccountService.class.getPackage().getName());  //调用父类方法
        // 注册Json解析器
        register(JacksonJsonProvider.class);
        // 注册日志打印输出
        register(Logger.class);
    }
}
