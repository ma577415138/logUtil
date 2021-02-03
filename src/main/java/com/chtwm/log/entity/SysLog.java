package com.chtwm.log.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysLog implements Serializable {
    //系统名称
    private String sysName;
    //唯一标识
    private String unique;
    //操作
    private String operation;
    //方法耗时
    private Integer time;
    //方法
    private String method;
    //参数
    private String params;
    private String ip;
    private Date createTime;
}
