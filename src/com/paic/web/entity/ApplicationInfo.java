package com.paic.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "applicationInfo")
public class ApplicationInfo
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false,unique = true)
    private Integer id;
    /**
     * 用户uuid 
     * */
    @Column(name = "userID",length = 32)
    private String userID;
    /**
     * 应用名称
     */
    @Column(name = "applicationname",length = 32)
    private String applicationname;
    /**
     * AppID
     */
    @Column(name = "AppID",length = 32)
    private String AppID;
    /**
     * APIKey
     */
    @Column(name = "APIKey",length = 32)
    private String APIKey;

    /**
     * SecretKey
     */
    @Column(name = "SecretKey",length = 32)
    private String SecretKey;

    /**
     * 创建时间
     */
    @Column(name = "CreateTime",length = 32)
    private String CreateTime;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getApplicationname() {
		return applicationname;
	}

	public void setApplicationname(String applicationname) {
		this.applicationname = applicationname;
	}

	public String getAppID() {
		return AppID;
	}

	public void setAppID(String appID) {
		AppID = appID;
	}

	public String getAPIKey() {
		return APIKey;
	}

	public void setAPIKey(String aPIKey) {
		APIKey = aPIKey;
	}

	public String getSecretKey() {
		return SecretKey;
	}

	public void setSecretKey(String secretKey) {
		SecretKey = secretKey;
	}

	public String getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}

}