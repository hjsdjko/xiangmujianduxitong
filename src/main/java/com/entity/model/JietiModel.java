package com.entity.model;

import com.entity.JietiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 项目结题
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JietiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 教师
     */
    private Integer jiaoshiId;


    /**
     * 项目
     */
    private Integer xiangmuId;


    /**
     * 结题时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jeitiTime;


    /**
     * 项目结题详情
     */
    private String jietiContent;


    /**
     * 要交经费
     */
    private Double yaojiaoJingfei;


    /**
     * 是否已缴
     */
    private Integer jietiTypes;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 设置：教师
	 */
    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：项目
	 */
    public Integer getXiangmuId() {
        return xiangmuId;
    }


    /**
	 * 设置：项目
	 */
    public void setXiangmuId(Integer xiangmuId) {
        this.xiangmuId = xiangmuId;
    }
    /**
	 * 获取：结题时间
	 */
    public Date getJeitiTime() {
        return jeitiTime;
    }


    /**
	 * 设置：结题时间
	 */
    public void setJeitiTime(Date jeitiTime) {
        this.jeitiTime = jeitiTime;
    }
    /**
	 * 获取：项目结题详情
	 */
    public String getJietiContent() {
        return jietiContent;
    }


    /**
	 * 设置：项目结题详情
	 */
    public void setJietiContent(String jietiContent) {
        this.jietiContent = jietiContent;
    }
    /**
	 * 获取：要交经费
	 */
    public Double getYaojiaoJingfei() {
        return yaojiaoJingfei;
    }


    /**
	 * 设置：要交经费
	 */
    public void setYaojiaoJingfei(Double yaojiaoJingfei) {
        this.yaojiaoJingfei = yaojiaoJingfei;
    }
    /**
	 * 获取：是否已缴
	 */
    public Integer getJietiTypes() {
        return jietiTypes;
    }


    /**
	 * 设置：是否已缴
	 */
    public void setJietiTypes(Integer jietiTypes) {
        this.jietiTypes = jietiTypes;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
