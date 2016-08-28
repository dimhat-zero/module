package com.jianla.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TorgFinance entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "torg_finance")
public class TorgFinance implements java.io.Serializable {

	// Fields

	private Long id;
	private Torgnization torgnization;
	private String tenpay;
	private String tenpayAcount;
	private String bankCard;
	private String linkman;
	private String tel;
	private String bankAcount;
	private String taxNumber;
	private Short taxType;
	private String invoiceTitle;
	private Integer districtId;
	private String address;
	private String pay1;
	private String pay1Acount;
	private String pay2;
	private String pay2Acount;
	private String pay3;
	private String pay3Acount;
	private Short isDefault;

	// Constructors

	/** default constructor */
	public TorgFinance() {
	}

	/** full constructor */
	public TorgFinance(Torgnization torgnization, String tenpay, String tenpayAcount, String bankCard, String linkman, String tel, String bankAcount, String taxNumber, Short taxType, String invoiceTitle, Integer districtId, String address, String pay1, String pay1Acount, String pay2, String pay2Acount, String pay3, String pay3Acount, Short isDefault) {
		this.torgnization = torgnization;
		this.tenpay = tenpay;
		this.tenpayAcount = tenpayAcount;
		this.bankCard = bankCard;
		this.linkman = linkman;
		this.tel = tel;
		this.bankAcount = bankAcount;
		this.taxNumber = taxNumber;
		this.taxType = taxType;
		this.invoiceTitle = invoiceTitle;
		this.districtId = districtId;
		this.address = address;
		this.pay1 = pay1;
		this.pay1Acount = pay1Acount;
		this.pay2 = pay2;
		this.pay2Acount = pay2Acount;
		this.pay3 = pay3;
		this.pay3Acount = pay3Acount;
		this.isDefault = isDefault;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "org_id")
	public Torgnization getTorgnization() {
		return this.torgnization;
	}

	public void setTorgnization(Torgnization torgnization) {
		this.torgnization = torgnization;
	}

	@Column(name = "tenpay", length = 100)
	public String getTenpay() {
		return this.tenpay;
	}

	public void setTenpay(String tenpay) {
		this.tenpay = tenpay;
	}

	@Column(name = "tenpay_acount", length = 100)
	public String getTenpayAcount() {
		return this.tenpayAcount;
	}

	public void setTenpayAcount(String tenpayAcount) {
		this.tenpayAcount = tenpayAcount;
	}

	@Column(name = "bank_card", length = 50)
	public String getBankCard() {
		return this.bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	@Column(name = "linkman", length = 50)
	public String getLinkman() {
		return this.linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	@Column(name = "tel", length = 50)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "bank_acount", length = 100)
	public String getBankAcount() {
		return this.bankAcount;
	}

	public void setBankAcount(String bankAcount) {
		this.bankAcount = bankAcount;
	}

	@Column(name = "tax_number", length = 100)
	public String getTaxNumber() {
		return this.taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	@Column(name = "tax_type")
	public Short getTaxType() {
		return this.taxType;
	}

	public void setTaxType(Short taxType) {
		this.taxType = taxType;
	}

	@Column(name = "invoice_title", length = 100)
	public String getInvoiceTitle() {
		return this.invoiceTitle;
	}

	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	@Column(name = "district_id")
	public Integer getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "address")
	public String getAddress() {
		return this.address;
	}

	@Column(name = "pay1", length = 100)
	public String getPay1() {
		return this.pay1;
	}

	public void setPay1(String pay1) {
		this.pay1 = pay1;
	}

	@Column(name = "pay1_acount", length = 100)
	public String getPay1Acount() {
		return this.pay1Acount;
	}

	public void setPay1Acount(String pay1Acount) {
		this.pay1Acount = pay1Acount;
	}

	@Column(name = "pay2", length = 100)
	public String getPay2() {
		return this.pay2;
	}

	public void setPay2(String pay2) {
		this.pay2 = pay2;
	}

	@Column(name = "pay2_acount", length = 100)
	public String getPay2Acount() {
		return this.pay2Acount;
	}

	public void setPay2Acount(String pay2Acount) {
		this.pay2Acount = pay2Acount;
	}

	@Column(name = "pay3", length = 100)
	public String getPay3() {
		return this.pay3;
	}

	public void setPay3(String pay3) {
		this.pay3 = pay3;
	}

	@Column(name = "pay3_acount", length = 100)
	public String getPay3Acount() {
		return this.pay3Acount;
	}

	public void setPay3Acount(String pay3Acount) {
		this.pay3Acount = pay3Acount;
	}

	@Column(name = "is_default")
	public Short getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Short isDefault) {
		this.isDefault = isDefault;
	}
}