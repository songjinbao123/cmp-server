package com.cmp.server.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.cmp.server.entity.NewContent;
import com.cmp.server.service.NewContentService;
import com.cmp.server.util.LayerData;
import com.cmp.server.util.ResultBean;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;

/**
 * Created by Administrator on 2019/8/18.
 */
@Controller
@RequestMapping("content")
public class NewContentController {

    @Autowired
    private NewContentService newContentService;

    @RequiresPermissions("sys:user:list")
    @GetMapping("list")
    @ResponseBody
    public ResultBean list(Page<NewContent> page, ServletRequest request){
        LayerData<NewContent> userLayerData = new LayerData<>();
        EntityWrapper<NewContent> userEntityWrapper = new EntityWrapper<>();
        Page<NewContent> userPage = newContentService.selectPage(new Page<NewContent>(page.getCurrent(),page.getSize()),userEntityWrapper);
        if(null != userPage && userPage.getRecords().size() > 0){
            return  new ResultBean().put("data",userPage).setCode(0).setMsg("查询成功");
        }else {
            return  new ResultBean().put("data","").setCode(1).setMsg("未查询到数据");
        }

    }
}
