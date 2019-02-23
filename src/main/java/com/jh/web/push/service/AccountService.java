package com.jh.web.push.service;

import com.jh.web.push.bean.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 * 服务接口采用映射的方式
 * 定义访问路径
 */
// 127.0.0.1/api/account/...
@Path("/account")
public class AccountService {

    //127.0.0.1/api/account/login
    @GET
    @Path("/login")
    public String get(){
        return "i get it 测试";  // 访问链接: http://localhost:8080/api/account/login
    }

    /**
     *
     * 访问链接: http://localhost:8080/api/account/login
     *
     * @POST POST请求方式
     *
     * 返回json字符串：
     * {
     *     "name": "tom",
     *     "sex": 1
     * }
     *
     * @return
     */
    // POST 127.0.0.1/api/account/login
    @POST
    @Path("/login")
    // 指定请求与返回的相应体为JSON
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User post(){
        User user = new User();
        user.setName("tom");
        user.setSex(1);
        return user;
    }

}
