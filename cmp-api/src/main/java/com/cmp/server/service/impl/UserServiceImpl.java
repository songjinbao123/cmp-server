package com.cmp.server.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cmp.server.dao.UserDao;
import com.cmp.server.entity.User;
import com.cmp.server.service.UserService;
import com.google.common.collect.Maps;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * Created by Administrator on 2019/8/17.
 */
@Service("userService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

//    @Cacheable(value = "user",key="'user_id_'+T(String).valueOf(#id)",unless = "#result == null")
    @Override
    public User findUserById(Long id) {
        // TODO Auto-generated method stub
        Map<String,Object> map = Maps.newHashMap();
        map.put("id", id);
        User user = baseMapper.selectUserByMap(map);
        return user;
    }
}
