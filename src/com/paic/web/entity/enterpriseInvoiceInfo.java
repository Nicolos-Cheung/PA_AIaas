package com.paic.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 企业增值税发票信息
 */
@Entity()
@Table(name = "enterpriseInvoiceInfo")
public class EnterpriseInvoiceInfo
{
    public EnterpriseInvoiceInfo()
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
	//企业注册执照
    @Column(name = "licensenumber",length = 32)
    private String licensenumber;
    //税务登记号
    @Column(name = "registernumber",length = 32)
    private String registernumber;
    //开户银行
    @Column(name = "bank",length = 10)
    private String bank;
    //开户帐号
    @Column(name = "accountnumber",length = 32)
    private String accountnumber;
    //地址
    @Column(name = "address",length = 32)
    private String address;
    //电话
    @Column(name = "telnumber",length = 11)
    private String telnumber;
    //税务登记扫描件
    @Column(name = "taxlicenseimg",length = 32)
    private String taxlicenseimg;
    //纳税人资格扫描件
    @Column(name = "taxpayerlicenseimg",length = 32)
    private String taxpayerlicenseimg;
    
    public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getLicensenumber() {
		return licensenumber;
	}
	public void setLicensenumber(String licensenumber) {
		this.licensenumber = licensenumber;
	}
	public String getRegisternumber() {
		return registernumber;
	}
	public void setRegisternumber(String registernumber) {
		this.registernumber = registernumber;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelnumber() {
		return telnumber;
	}
	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}
	public String getTaxlicenseimg() {
		return taxlicenseimg;
	}
	public void setTaxlicenseimg(String taxlicenseimg) {
		this.taxlicenseimg = taxlicenseimg;
	}
	public String getTaxpayerlicenseimg() {
		return taxpayerlicenseimg;
	}
	public void setTaxpayerlicenseimg(String taxpayerlicenseimg) {
		this.taxpayerlicenseimg = taxpayerlicenseimg;
	}
}