package com.cmp.server.base;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2019/8/18.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MyBatisDao {
    String value() default "";
}
