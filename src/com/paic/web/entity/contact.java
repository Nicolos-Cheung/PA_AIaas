package com.paic.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户联系人
 */
@Entity()
@Table(name = "contact")
public class Contact
{
    public Contact()
    {
        super();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false,unique = true)
    private Integer id;
    //主联系人
    @Column(name = "maincontact",length = 32)
    private String maincontact;
	/**
	 *主联系人uuid
	 */
	@Column(name = "userID",length = 32)
	private String userID;

    //联系人
    @Column(name = "contact",length = 32)
    private String contact;
    //联系人电话
    @Column(name = "telnumber",length = 11)
    private String telnumber;
    //联系人群组
    @Column(name = "contactgroup",length = 32)
    private String contactgroup;

    //群组描述
    @Column(name = "description",length = 100)
    private String description;

	public String getUserID()
	{
		return userID;
	}

	public void setUserID(String userID)
	{
		this.userID = userID;
	}

	public String getMaincontact() {
		return maincontact;
	}

	public void setMaincontact(String maincontact) {
		this.maincontact = maincontact;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getTelnumber() {
		return telnumber;
	}

	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}

	public String getContactgroup() {
		return contactgroup;
	}

	public void setContactgroup(String contactgroup) {
		this.contactgroup = contactgroup;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
}