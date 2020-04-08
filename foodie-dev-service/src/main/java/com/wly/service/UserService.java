package com.wly.service;

import com.wly.pojo.Users;
import com.wly.pojo.bo.UserBO;

public interface UserService {

    /**
     * 功能描述 :判断用户是否存在
     *
     * @author wangliyong
     * @date 2020/4/2
     */
    public boolean queryUsernameIsExist(String username);

    /**
     * 创建用户
     *
     * @author wangliyong
     * @date 2020/4/7
     */
    public Users createUser(UserBO userBO);

    /**
     * 检索用户名和密码是否匹配，用于登录
     *
     * @author wangliyong
     * @date 2020/4/7
     */
    public Users queryUserForLogin(String username, String password);
}
