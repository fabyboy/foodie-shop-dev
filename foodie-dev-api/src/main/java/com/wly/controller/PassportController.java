package com.wly.controller;

import com.wly.utils.JSONResult;
import com.wly.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述 : 用户登录注册
 *
 * @author wangliyong
 * @date 2020/4/2
 * @return
 */
@RestController
@RequestMapping("passport")
public class PassportController {
    @Autowired
    private UserService userService;

    /**
     * 功能描述 : 用户是否存在
     *
     * @author wangliyong
     * @date 2020/4/2
     */
    @GetMapping("usernameIsExist")
    public JSONResult usernameIsExist(@RequestParam String username) {
        // 1.判断用户名不能为空
        if (StringUtils.isBlank(username)) {
            return JSONResult.errorMsg("用户名不能为空");        }
        // 2.查找注册用户是否存在
        boolean isExist = userService.queryUsernameIsExist(username);
        if (isExist) {
            return JSONResult.errorMsg("用户名不能为空");
        } else {
            return JSONResult.ok();
        }
    }
}
