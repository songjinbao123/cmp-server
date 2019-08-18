package com.cmp.server.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cmp.server.dao.NewContentMapper;
import com.cmp.server.entity.NewContent;
import com.cmp.server.service.NewContentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2019/8/18.
 */
@Service("newContentService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class NewContentServiceImpl extends ServiceImpl<NewContentMapper, NewContent> implements NewContentService {

}
