package com.cmp.server.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cmp.server.entity.Role;
import com.cmp.server.entity.User;

import java.util.Map;
import java.util.Set;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2019/8/17.
 */
public interface UserDao extends BaseMapper<User> {
    User selectUserByMap(Map<String, Object> map);

//    void saveUserRoles(@Param("userId")Long id, @Param("roleIds")Set<Role> roles);
//
//    void dropUserRolesByUserId(@Param("userId")Long userId);
//
//    Map selectUserMenuCount();
}
