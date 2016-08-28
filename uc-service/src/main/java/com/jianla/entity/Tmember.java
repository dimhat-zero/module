package com.jianla.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tmember entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tmember")
public class Tmember implements java.io.Serializable {

	// Fields

	private Long id;
	private TcontactsInfo tcontactsInfo;
	private TorgDepartment torgDepartment;
	private Torgnization torgnization;
	private String name;
	private String pwd;
	private String realName;
	private String nameEn;
	private String jobTitle;
	private String professionTitle;
	private String eduBackground;
	private String academicDegree;
	private String gender;
	private String idcard;
	private String idcardPicture;
	private Timestamp birth;
	private String address;
	private Integer districtId;
	private Timestamp registTime;
	private Timestamp lastLoginTime;
	private Short status;
	private String pwdToken;
	private Set<TorgDepartment> torgDepartments = new HashSet<TorgDepartment>(0);
	private Set<Tmembertrole> tmembertroles = new HashSet<Tmembertrole>(0);
	private Set<Torgnization> torgnizations = new HashSet<Torgnization>(0);

	// Constructors

	/** default constructor */
	public Tmember() {
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
	@JoinColumn(name = "contact_info_id")
	public TcontactsInfo getTcontactsInfo() {
		return this.tcontactsInfo;
	}

	public void setTcontactsInfo(TcontactsInfo tcontactsInfo) {
		this.tcontactsInfo = tcontactsInfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	public TorgDepartment getTorgDepartment() {
		return this.torgDepartment;
	}

	public void setTorgDepartment(TorgDepartment torgDepartment) {
		this.torgDepartment = torgDepartment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "org_id")
	public Torgnization getTorgnization() {
		return this.torgnization;
	}

	public void setTorgnization(Torgnization torgnization) {
		this.torgnization = torgnization;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "pwd", length = 50)
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Column(name = "district_id")
	public Integer getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	@Column(name = "real_name", length = 50)
	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	@Column(name = "name_en", length = 50)
	public String getNameEn() {
		return this.nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	@Column(name = "job_title", length = 20)
	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Column(name = "profession_title", length = 20)
	public String getProfessionTitle() {
		return this.professionTitle;
	}

	public void setProfessionTitle(String professionTitle) {
		this.professionTitle = professionTitle;
	}

	@Column(name = "edu_background", length = 20)
	public String getEduBackground() {
		return this.eduBackground;
	}

	public void setEduBackground(String eduBackground) {
		this.eduBackground = eduBackground;
	}

	@Column(name = "academic_degree", length = 20)
	public String getAcademicDegree() {
		return this.academicDegree;
	}

	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}

	@Column(name = "gender", length = 4)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "idcard", length = 30)
	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	@Column(name = "idcard_picture", length = 255)
	public String getIdcardPicture() {
		return idcardPicture;
	}

	public void setIdcardPicture(String idcardPicture) {
		this.idcardPicture = idcardPicture;
	}

	@Column(name = "birth", length = 19)
	public Timestamp getBirth() {
		return this.birth;
	}

	public void setBirth(Timestamp birth) {
		this.birth = birth;
	}

	@Column(name = "address")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "regist_time", length = 19)
	public Timestamp getRegistTime() {
		return this.registTime;
	}

	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}

	@Column(name = "last_login_time", length = 19)
	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Column(name = "status")
	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	@Column(name = "pwd_token")
	public String getPwdToken() {
		return pwdToken;
	}

	public void setPwdToken(String pwdToken) {
		this.pwdToken = pwdToken;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tmember")
	public Set<TorgDepartment> getTorgDepartments() {
		return this.torgDepartments;
	}

	public void setTorgDepartments(Set<TorgDepartment> torgDepartments) {
		this.torgDepartments = torgDepartments;
	}


	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tmember")
	public Set<Torgnization> getTorgnizations() {
		return this.torgnizations;
	}

	public void setTorgnizations(Set<Torgnization> torgnizations) {
		this.torgnizations = torgnizations;
	}

}