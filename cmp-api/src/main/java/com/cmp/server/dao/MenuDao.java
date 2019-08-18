package com.cmp.server.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cmp.server.entity.Menu;
import com.cmp.server.entity.vo.ShowMenu;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/8/17.
 */
public interface MenuDao extends BaseMapper<Menu> {
    List<Menu> showAllMenusList(Map map);

    List<Menu> getMenus(Map map);

    List<ShowMenu> selectShowMenuByUser(Map<String,Object> map);
}
