package com.paic.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 用户信息
 */
@Entity()
@Table(name="user")
public class UserInfo
{
	public UserInfo()
	{
        super();
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable = false, unique = true)
    private Integer id;
    
    @Column(name="username",length=32)
    private String username;
    
    /**
	 * 用户uuid
	 */
	@Column(name = "userID",length = 32)
	private String userID;
    
    /*@Column(name="age")
    private Integer age;*/
    
    @Column(name="password",length=32)
    private String password;
    
    @Column(name="telnumber",length=11)
    private String telnumber;
    
    public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getTelnumber() {
		return telnumber;
	}
	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}
	public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    /*public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }*/
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
