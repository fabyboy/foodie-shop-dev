package com.wly.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    final static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public Object hello() {

        LOGGER.debug("debug: hello~");
        LOGGER.info("info: hello~");
        LOGGER.warn("warn: hello~");
        LOGGER.error("error: hello~");

        return "Hello World~";
    }

    @GetMapping("/setSession")
    public Object setSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("userInfo", "new user");
        session.setMaxInactiveInterval(3600);
        session.getAttribute("userInfo");
//        session.removeAttribute("userInfo");
        return "ok";
    }
}
