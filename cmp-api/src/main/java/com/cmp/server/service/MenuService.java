package com.cmp.server.service;

import com.baomidou.mybatisplus.service.IService;
import com.cmp.server.entity.Menu;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/8/18.
 */
public interface MenuService extends IService<Menu> {

    List<Menu> selectAllMenus(Map<String,Object> map);

//    List<ZtreeVO> showTreeMenus();
//
//    List<ShowMenu> getShowMenuByUser(Long id);

//    void saveOrUpdateMenu(Menu menu);
//
//    int getCountByPermission(String permission);
//
//    int getCountByName(String name);
}
