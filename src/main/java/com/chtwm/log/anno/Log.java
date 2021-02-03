package com.chtwm.log.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author mayunliang
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Log {
    /**
     * 描述
     * @return
     * @author mayunliang
     */
    String desc() default "";

    /**
     * 系统名称
     * @return
     * @author mayunliang
     */
    String sysName() default "";

}