package com.paic.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户基本信息
 */
@Entity()
@Table(name = "baseInfo")
public class BaseInfo
{
    public BaseInfo()
    {
        super();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false,unique = true)
    private Integer id;
    //基本信息-用户名
    @Column(name = "username",length = 32)
    private String username;
    //基本信息-用户ID
    @Column(name = "userID",length = 32)
    private String userID;
    //基本信息-用户属性
    @Column(name = "property",length = 10)
    private String property;
    //基本信息-一级行业分类
    @Column(name = "primaryclassification",length = 32)
    private String primaryclassification;
    //基本信息-二级行业分类
    @Column(name = "secondaryclassification",length = 32)
    private String secondaryclassification;
    //基本信息-主营业务
    @Column(name = "bussiness",length = 100)
    private String bussiness;
    //基本信息-网址
    @Column(name = "url",length = 32)
    private String url;

    //安全信息-手机号
    @Column(name = "telnumber",length = 11)
    private String telnumber;
    //安全信息-邮箱
    @Column(name = "email",length = 32)
    private String email;
    //安全信息-密码
    @Column(name = "password",length = 32)
    private String password;
    
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public String getPrimaryclassification() {
		return primaryclassification;
	}
	public void setPrimaryclassification(String primaryclassification) {
		this.primaryclassification = primaryclassification;
	}
	public String getSecondaryclassification() {
		return secondaryclassification;
	}
	public void setSecondaryclassification(String secondaryclassification) {
		this.secondaryclassification = secondaryclassification;
	}
	public String getBussiness() {
		return bussiness;
	}
	public void setBussiness(String bussiness) {
		this.bussiness = bussiness;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTelnumber() {
		return telnumber;
	}
	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}