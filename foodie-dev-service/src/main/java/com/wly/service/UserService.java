package com.wly.service;

import com.wly.pojo.Users;
import com.wly.pojo.bo.UserBO;

public interface UserService {

    /**
     * 功能描述 :判断用户是否存在
     * @author wangliyong
     * @date 2020/4/2
     */
    public boolean queryUsernameIsExist(String username);

    public Users createUser(UserBO userBO);
}
