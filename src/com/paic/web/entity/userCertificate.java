package com.paic.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 证书管理
 */
@Entity()
@Table(name = "userCertificate")
public class UserCertificate
{
	public UserCertificate()
	{
		super();
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false,unique = true)
    private Integer id;

	/**
	 * 用户uuid
	 */
	@Column(name = "userID",length = 32)
	private String userID;
	/**
	 * 用户证书名称
	 */
    @Column(name = "certificateID",length = 50)
    private String certificateID;
	/**
	 * 服务器证书
	 */
	@Column(name = "serverlicense",length = 300)
	private String serverlicense;
	/**
	 * 私钥
	 */
	@Column(name = "acessekey",length = 300)
	private String acessekey;
	/**
	 * 证书链
	 */
	@Column(name = "certificateChain",length = 300)
	private String certificateChain;
	/**
	 * 证书状态
	 */
    @Column(name = "status",length = 1)
    private Integer status;
	/**
	 * common name
	 */
    @Column(name = "commonname",length = 50)
    private String commonname;
	/**
	 * 有效期
	 */
    @Column(name = "expirydate",length = 20)
    private String expirydate;
    
	public String getServerlicense() {
		return serverlicense;
	}

	public void setServerlicense(String serverlicense) {
		this.serverlicense = serverlicense;
	}

	public String getAcessekey() {
		return acessekey;
	}

	public void setAcessekey(String acessekey) {
		this.acessekey = acessekey;
	}

	public String getCertificateChain() {
		return certificateChain;
	}

	public void setCertificateChain(String certificateChain) {
		this.certificateChain = certificateChain;
	}

	public String getUserID()
	{
		return userID;
	}

	public void setUserID(String userID)
	{
		this.userID = userID;
	}
    public String getCertificateID() {
		return certificateID;
	}

	public void setCertificateID(String certificateID) {
		this.certificateID = certificateID;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCommonname() {
		return commonname;
	}

	public void setCommonname(String commonname) {
		this.commonname = commonname;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
}