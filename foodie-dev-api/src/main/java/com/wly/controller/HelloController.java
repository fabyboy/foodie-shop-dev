package com.wly.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author wangliyong
 * description com.wly.controller
 * @data 2020/3/22
 */
@ApiIgnore
// @Controller - 在springmvc里面使用的比较多-页面跳转
// restController返回json
@RestController
public class HelloController {
    @GetMapping("/hello")
    public Object hello(){
        return "Hello World ～";
    }
}
