package com.cmp.server.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cmp.server.entity.Menu;
import com.cmp.server.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

/**
 * Created by Administrator on 2019/8/17.
 */
public interface RoleDao extends BaseMapper<Role> {
    Role selectRoleById(@Param("id") Long id);

    void saveRoleMenus(@Param("roleId") Long id, @Param("menus") Set<Menu> menus);

    void dropRoleMenus(@Param("roleId")Long roleId);

    void dropRoleUsers(@Param("roleId")Long roleId);
}
