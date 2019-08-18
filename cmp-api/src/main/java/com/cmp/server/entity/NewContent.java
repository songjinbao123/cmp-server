package com.cmp.server.entity;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * Created by Administrator on 2019/8/18.
 */
@TableName("new_content")
public class NewContent {
    private Integer contentId;
    private String content;
    private String tags;

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
