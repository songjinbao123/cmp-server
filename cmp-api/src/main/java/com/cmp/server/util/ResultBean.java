package com.cmp.server.util;

import com.baomidou.mybatisplus.plugins.Page;
import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/8/18.
 */
public class ResultBean {
    /**
     * 结果码
     */
    private Integer code;

    private String msg;

    private Map<String, Object> result ;

    public ResultBean() {

    }

    public Integer getCode() {
        return code;
    }

    public ResultBean setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResultBean setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }

    public ResultBean put(String key , Object value) {
        if ( this.result == null ) {
            result = Maps.newHashMap();
        }
        result.put(key, value);
        return this;
    }
}
