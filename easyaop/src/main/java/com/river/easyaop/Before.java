package com.river.easyaop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: River
 * @Emial: 1632958163@qq.com
 * @Create: 2022/4/1
 * @Desc: 该方法用于在方法进入时插入代码
 **/
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface Before {
    String clzName();
    String methodDesc();
}
