package com.xdkj.bean;

import com.sun.xml.internal.ws.spi.db.DatabindingException;

import java.util.Date;

/**
 * @author ShangGuan
 * @create 2019-10-21 10:49
 */

//工作信息类
public class job_information {
    private Integer jid;//工作信息编号
    private Date time;//工作时间
    private Date untime;//非工作时间
    private String address;//可工作地址
    private Integer hours;//周工作时长
    private double daysal;//日薪
    private String pattern;//工作形势
    private Integer jperson;//所属人
}
