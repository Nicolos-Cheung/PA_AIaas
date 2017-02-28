package com.paic.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 个人认证证书信息
 */
@Entity()
@Table(name = "personalQualifyInfo")
public class PersonalQualifyInfo
{
    public PersonalQualifyInfo()
    {
        super();
    }
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id()
    @Column(name = "id",nullable = false,unique = true)
    private Integer id;

	/**
	 * 用户uuid
	 */
	@Column(name = "userID",length = 32)
	private String userID;
    //用户名
    @Column(name = "username",length = 32)
    private String username;
    //姓名
    @Column(name = "realname",length = 32)
    private String realname;
    //身份证号
    @Column(name = "idcardnumber",length = 20)
    private String idcardnumber;
    //身份证图片路径
    @Column(name = "imgpath",length = 32)
    private String imgpath;

	public String getUserID()
	{
		return userID;
	}

	public void setUserID(String userID)
	{
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getIdcardnumber() {
		return idcardnumber;
	}
	public void setIdcardnumber(String idcardnumber) {
		this.idcardnumber = idcardnumber;
	}
	public String getImgpath() {
		return imgpath;
	}
	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}
}