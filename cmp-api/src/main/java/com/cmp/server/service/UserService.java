package com.cmp.server.service;

import com.baomidou.mybatisplus.service.IService;
import com.cmp.server.entity.User;

/**
 * Created by Administrator on 2019/8/17.
 */
public interface UserService extends IService<User> {
    User findUserById(Long id);
}
