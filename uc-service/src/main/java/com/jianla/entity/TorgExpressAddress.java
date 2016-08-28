package com.jianla.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TorgExpressAddress entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "torg_express_address")
public class TorgExpressAddress implements java.io.Serializable {

	// Fields

	private Long id;
	private Torgnization torgnization;
	private String tel;
	private Integer districtId;
	private String address;
	private String recipient;
	private Short isDefault;

	/** 实验室名称 */
	private String wuliuName;

	/** 备注说明 */
	private String remark;

	// Constructors

	/** default constructor */
	public TorgExpressAddress() {
	}

	/** full constructor */
	public TorgExpressAddress(Torgnization torgnization, String tel, Integer districtId, String address,
			String recipient, Short isDefault) {
		this.torgnization = torgnization;
		this.tel = tel;
		this.districtId = districtId;
		this.address = address;
		this.recipient = recipient;
		this.isDefault = isDefault;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
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

	@Column(name = "tel", length = 50)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "district_id")
	public Integer getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	@Column(name = "address", length = 200)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "recipient", length = 50)
	public String getRecipient() {
		return this.recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	@Column(name = "is_default")
	public Short getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Short isDefault) {
		this.isDefault = isDefault;
	}

	@Column(name = "wuliu_name", length = 255)
	public String getWuliuName() {
		return wuliuName;
	}

	public void setWuliuName(String wuliuName) {
		this.wuliuName = wuliuName;
	}

	@Column(name = "remark", length = 255)
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}