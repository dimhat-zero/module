package com.jianla.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TorgAuthinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "torg_authinfo")
public class TorgAuthinfo implements java.io.Serializable {

	// Fields

	private Long id;
	private Torgnization torgnization;
	private String authorizerName;
	private String idcard;
	private String idcardPicture;
	private String legalpersonName;
	private String legalpersonIdcard;
	private String legalpersonIdcardPicture;
	private String authCredential;
	private String icregistNumber;
	private String icregistPicture;
	private String orgCodeId;
	private String orgCodePicture;
	private String taxNumber;
	private String taxPicture;
	private String bankCertificate;
	private String cnasNumber;
	private String cnasPicture;
	private String cmaNumber;
	private String cmaPicture;
	private String cmafNumber;
	private String cmafPicture;
	private Short status;

	// Constructors

	/** default constructor */
	public TorgAuthinfo() {
	}

	/** minimal constructor */
	public TorgAuthinfo(Torgnization torgnization) {
		this.torgnization = torgnization;
	}

	/** full constructor */
	public TorgAuthinfo(Torgnization torgnization, String authorizerName, String idcard, String idcardPicture, String legalpersonName, String legalpersonIdcard, String legalpersonIdcardPicture, String authCredential, String icregistNumber, String icregistPicture, String orgCodeId, String orgCodePicture, String taxNumber, String taxPicture, String bankCertificate, String cnasNumber, String cnasPicture, String cmaNumber, String cmaPicture, String cmafNumber, String cmafPicture, Short status) {
		this.torgnization = torgnization;
		this.authorizerName = authorizerName;
		this.idcard = idcard;
		this.idcardPicture = idcardPicture;
		this.legalpersonName = legalpersonName;
		this.legalpersonIdcard = legalpersonIdcard;
		this.legalpersonIdcardPicture = legalpersonIdcardPicture;
		this.authCredential = authCredential;
		this.icregistNumber = icregistNumber;
		this.icregistPicture = icregistPicture;
		this.orgCodeId = orgCodeId;
		this.orgCodePicture = orgCodePicture;
		this.taxNumber = taxNumber;
		this.taxPicture = taxPicture;
		this.bankCertificate = bankCertificate;
		this.cnasNumber = cnasNumber;
		this.cnasPicture = cnasPicture;
		this.cmaNumber = cmaNumber;
		this.cmaPicture = cmaPicture;
		this.cmafNumber = cmafNumber;
		this.cmafPicture = cmafPicture;
		this.status = status;
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
	@JoinColumn(name = "org_id", nullable = false)
	public Torgnization getTorgnization() {
		return this.torgnization;
	}

	public void setTorgnization(Torgnization torgnization) {
		this.torgnization = torgnization;
	}

	@Column(name = "authorizer_name")
	public String getAuthorizerName() {
		return this.authorizerName;
	}

	public void setAuthorizerName(String authorizerName) {
		this.authorizerName = authorizerName;
	}

	@Column(name = "idcard")
	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	@Column(name = "idcard_picture")
	public String getIdcardPicture() {
		return this.idcardPicture;
	}

	public void setIdcardPicture(String idcardPicture) {
		this.idcardPicture = idcardPicture;
	}

	@Column(name = "legalperson_name")
	public String getLegalpersonName() {
		return this.legalpersonName;
	}

	public void setLegalpersonName(String legalpersonName) {
		this.legalpersonName = legalpersonName;
	}

	@Column(name = "legalperson_idcard")
	public String getLegalpersonIdcard() {
		return this.legalpersonIdcard;
	}

	public void setLegalpersonIdcard(String legalpersonIdcard) {
		this.legalpersonIdcard = legalpersonIdcard;
	}

	@Column(name = "legalperson_idcard_picture")
	public String getLegalpersonIdcardPicture() {
		return this.legalpersonIdcardPicture;
	}

	public void setLegalpersonIdcardPicture(String legalpersonIdcardPicture) {
		this.legalpersonIdcardPicture = legalpersonIdcardPicture;
	}

	@Column(name = "auth_credential")
	public String getAuthCredential() {
		return this.authCredential;
	}

	public void setAuthCredential(String authCredential) {
		this.authCredential = authCredential;
	}

	@Column(name = "icregist_number")
	public String getIcregistNumber() {
		return this.icregistNumber;
	}

	public void setIcregistNumber(String icregistNumber) {
		this.icregistNumber = icregistNumber;
	}

	@Column(name = "icregist_picture")
	public String getIcregistPicture() {
		return this.icregistPicture;
	}

	public void setIcregistPicture(String icregistPicture) {
		this.icregistPicture = icregistPicture;
	}

	@Column(name = "org_code_id")
	public String getOrgCodeId() {
		return this.orgCodeId;
	}

	public void setOrgCodeId(String orgCodeId) {
		this.orgCodeId = orgCodeId;
	}

	@Column(name = "org_code_picture")
	public String getOrgCodePicture() {
		return this.orgCodePicture;
	}

	public void setOrgCodePicture(String orgCodePicture) {
		this.orgCodePicture = orgCodePicture;
	}

	@Column(name = "tax_number")
	public String getTaxNumber() {
		return this.taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	@Column(name = "tax_picture")
	public String getTaxPicture() {
		return this.taxPicture;
	}

	public void setTaxPicture(String taxPicture) {
		this.taxPicture = taxPicture;
	}

	@Column(name = "bank_certificate")
	public String getBankCertificate() {
		return this.bankCertificate;
	}

	public void setBankCertificate(String bankCertificate) {
		this.bankCertificate = bankCertificate;
	}

	@Column(name = "cnas_number")
	public String getCnasNumber() {
		return this.cnasNumber;
	}

	public void setCnasNumber(String cnasNumber) {
		this.cnasNumber = cnasNumber;
	}

	@Column(name = "cnas_picture")
	public String getCnasPicture() {
		return this.cnasPicture;
	}

	public void setCnasPicture(String cnasPicture) {
		this.cnasPicture = cnasPicture;
	}

	@Column(name = "cma_number")
	public String getCmaNumber() {
		return this.cmaNumber;
	}

	public void setCmaNumber(String cmaNumber) {
		this.cmaNumber = cmaNumber;
	}

	@Column(name = "cma_picture")
	public String getCmaPicture() {
		return this.cmaPicture;
	}

	public void setCmaPicture(String cmaPicture) {
		this.cmaPicture = cmaPicture;
	}

	@Column(name = "cmaf_number")
	public String getCmafNumber() {
		return this.cmafNumber;
	}

	public void setCmafNumber(String cmafNumber) {
		this.cmafNumber = cmafNumber;
	}

	@Column(name = "cmaf_picture")
	public String getCmafPicture() {
		return this.cmafPicture;
	}

	public void setCmafPicture(String cmafPicture) {
		this.cmafPicture = cmafPicture;
	}

	@Column(name = "status")
	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

}