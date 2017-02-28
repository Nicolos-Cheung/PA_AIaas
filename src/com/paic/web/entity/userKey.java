package com.paic.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户密钥
 */
@Entity()
@Table(name = "userkey")
public class UserKey
{
    public UserKey()
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

    @Column(name = "username",length = 32 )
    private String username;

    @Column(name = "accesskey",length = 32)
    private String accesskey;

    @Column(name = "secretkey",length = 32)
    private String secretkey;

    @Column(name = "illustration",length = 50)
    private String illustration;

    @Column(name = "createtime",length = 32)
    private String createtime;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccesskey() {
		return accesskey;
	}

	public void setAccesskey(String accesskey) {
		this.accesskey = accesskey;
	}

	public String getSecretkey() {
		return secretkey;
	}

	public void setSecretkey(String secretkey) {
		this.secretkey = secretkey;
	}

	public String getIllustration() {
		return illustration;
	}

	public void setIllustration(String illustration) {
		this.illustration = illustration;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
}