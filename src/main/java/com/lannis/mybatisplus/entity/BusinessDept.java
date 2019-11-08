package com.lannis.mybatisplus.entity;
//                            _ooOoo_
//                           o8888888o
//                           88" . "88
//                           (| -_- |)
//                            O\ = /O
//                        ____/`---'\____
//                      .   ' \\| |// `.
//                       / \\||| : |||// \
//                     / _||||| -:- |||||- \
//                       | | \\\ - /// | |
//                     | \_| ''\---/'' | |
//                      \ .-\__ `-` ___/-. /
//                   ___`. .' /--.--\ `. . __
//                ."" '< `.___\_<|>_/___.' >'"".
//               | | : `- \`.;`\ _ /`;.`/ - ` : | |
//                 \ \ `-. \_ __\ /__ _/ .-` / /
//         ======`-.____`-.___\_____/___.-`____.-'======
//                            `=---='
//
//         .............................................
//                  佛祖镇楼           BUG辟易
//
//                             佛曰:
//
//                  写字楼里写字间，写字间里程序员；
//                  程序人员写程序，又拿程序换酒钱。
//                  酒醒只在网上坐，酒醉还来网下眠；
//                  酒醉酒醒日复日，网上网下年复年。
//                  但愿老死电脑间，不愿鞠躬老板前；
//                  奔驰宝马贵者趣，公交自行程序员。
//                  别人笑我忒疯癫，我笑自己命太贱；
//                  不见满街漂亮妹，哪个归得程序员？

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @package: com.lannis.mybatisplus.entity
 * @program: mybatisplus
 * @description: 科室
 * @author: LuBangtao
 * @create: 2019-11-08 13:28
 **/
@Data
@TableName("web_wechat..business_department")
public class BusinessDept {
    /**
     * 科室编码
     */
    @TableId(value = "code",type = IdType.INPUT)
    private String code;
    /**
     * 上级科室编码
     */
    private String parent_code;
    /**
     * 科室名称
     */
    private String name;
    /**
     * 科室拼音码
     */
    private String pinyin;
    /**
     * 科室位置
     */
    private String position;
    /**
     * 是否可挂号
     */
    private Integer register_enable;
    /**
     * 挂号种类
     */
    private Integer register_type;
    /**
     * 号源模式
     */
    private Integer register_source_type;
    /**
     * 是否开启排队叫号
     */
    private Integer queue_enable;
    /**
     * 科室备注
     */
    private String description;
    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    /**
     * 更新时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;
}
