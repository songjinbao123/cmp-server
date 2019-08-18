package com.cmp.server.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.cmp.server.entity.User;
import com.cmp.server.service.UserService;
import com.cmp.server.util.LayerData;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.WebUtils;

import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/8/17.
 */
@Controller
@RequestMapping("user")
public class UserConteroller {


    @Autowired
    protected UserService userService;

    @GetMapping("list")
    @ResponseBody
    public LayerData<User> list(@RequestParam(value = "page",defaultValue = "1")Integer page,
                                @RequestParam(value = "limit",defaultValue = "10")Integer limit,
                                ServletRequest request){
        Map map = WebUtils.getParametersStartingWith(request, "s_");
        LayerData<User> userLayerData = new LayerData<>();
        EntityWrapper<User> userEntityWrapper = new EntityWrapper<>();
        if(!map.isEmpty()){
            String keys = (String) map.get("key");
            if(StringUtils.isNotBlank(keys)) {
                userEntityWrapper.like("login_name", keys).or().like("tel", keys).or().like("email", keys);
            }
        }
        Page<User> userPage = userService.selectPage(new Page<User>(page,limit),userEntityWrapper);
        userLayerData.setCount(userPage.getTotal());
        userLayerData.setData(userPage.getRecords());
        return  userLayerData;
    }

    @GetMapping("findUserById")
    @ResponseBody
    public LayerData<User> findUserById(Long id){
//        LayerData<User> userLayerData = new LayerData<>();
//        EntityWrapper<User> userEntityWrapper = new EntityWrapper<>();
//        Page<User> userPage = userService.selectPage(new Page<User>(1,10),userEntityWrapper);


        User user = userService.findUserById(id);
        List<User> list = new ArrayList<>();
        list.add(user);
        LayerData<User> userLayerData = new LayerData<>();
        userLayerData.setCount(1);
        userLayerData.setData(list);
        return  userLayerData;
    }
}
