package com.lannis.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @PackgeName: com.lannis.mybatisplus.entity
 * @ClassName: organization
 * @Author: Lannis
 * Date: 2019-11-07 10:33
 * project name: mybatisplus
 * @Version:
 * @Description:
 */
@Data
@TableName("organization")
public class organization {

    /**
     * 机构编码
     */
    @TableId(value = "code",type = IdType.INPUT)
    private String code;
    /**
     * 机构名称
     */
    private String name;
    /**
     * 微信AppId
     */
    private String appid;
    /**
     * 微信AppsSecret
     */
    private String appsecret;

    /**
     * 机构地址
     */
    private String address;
    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date createtime;
    /**
     * 更新时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date updatetime;
    /**
     * 是否有效：
     * 1：有效【默认】
     * 0：无效
     */
    private Integer state;
}
