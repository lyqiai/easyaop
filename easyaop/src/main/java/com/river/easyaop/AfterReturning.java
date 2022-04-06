package com.river.easyaop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: River
 * @Emial: 1632958163@qq.com
 * @Create: 2022/4/1
 * @Desc: 该注解用于在方法return前插入代码
 **/
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface AfterReturning {
    String clzName();
    String methodDesc();
}
