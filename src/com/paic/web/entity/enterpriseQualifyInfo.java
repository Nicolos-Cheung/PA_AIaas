package com.paic.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 企业用户证书信息
 */
@Entity()
@Table(name = "enterpriseQualifyInfo")
public class enterpriseQualifyInfo
{
    public enterpriseQualifyInfo()
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
    //组织类型
    @Column(name = "organazitionType",length = 32)
    private String organazitionType;
    //企业名称
    @Column(name = "enterprisename",length = 32)
    private String enterprisename;
    //企业注册执照
    @Column(name = "licensenumber",length = 32)
    private String licensenumber;
    //企业执照扫描件
    @Column(name = "licenseimgpath",length = 32)
    private String licenseimgpath;
    //其他资质(资质类型)
    @Column(name = "credentitaltype",length = 32)
    private String credentitaltype;
    //资质编号
    @Column(name = "credentitalnumber",length = 32)
    private String credentitalnumber;
    //资质证件有效期
    @Column(name = "credentitalexpire",length = 32)
    private String credentitalexpire;
    //资质扫描件路径地址
    @Column(name = "credentitalimgpath",length = 32)
    private String credentitalimgpath;

	public String getUserID()
	{
		return userID;
	}

	public void setUserID(String userID)
	{
		this.userID = userID;
	}
	public String getOrganazitionType() {
		return organazitionType;
	}
	public void setOrganazitionType(String organazitionType) {
		this.organazitionType = organazitionType;
	}
	public String getEnterprisename() {
		return enterprisename;
	}
	public void setEnterprisename(String enterprisename) {
		this.enterprisename = enterprisename;
	}
	public String getLicensenumber() {
		return licensenumber;
	}
	public void setLicensenumber(String licensenumber) {
		this.licensenumber = licensenumber;
	}
	public String getLicenseimgpath() {
		return licenseimgpath;
	}
	public void setLicenseimgpath(String licenseimgpath) {
		this.licenseimgpath = licenseimgpath;
	}
	public String getCredentitaltype() {
		return credentitaltype;
	}
	public void setCredentitaltype(String credentitaltype) {
		this.credentitaltype = credentitaltype;
	}
	public String getCredentitalnumber() {
		return credentitalnumber;
	}
	public void setCredentitalnumber(String credentitalnumber) {
		this.credentitalnumber = credentitalnumber;
	}
	public String getCredentitalexpire() {
		return credentitalexpire;
	}
	public void setCredentitalexpire(String credentitalexpire) {
		this.credentitalexpire = credentitalexpire;
	}
	public String getCredentitalimgpath() {
		return credentitalimgpath;
	}
	public void setCredentitalimgpath(String credentitalimgpath) {
		this.credentitalimgpath = credentitalimgpath;
	}
}