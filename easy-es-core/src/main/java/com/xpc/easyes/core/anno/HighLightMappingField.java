package com.xpc.easyes.core.anno;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 高亮字段注解
 *
 * @author yang
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@TableField(exist = false)
public @interface HighLightMappingField {
    /**
     * 高亮字段对应源数据库表字段
     *
     * @return 高亮返回字段名
     */
    String value();
}
