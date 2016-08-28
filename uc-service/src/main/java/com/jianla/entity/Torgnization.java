package com.jianla.entity;


import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Torgnization entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "torgnization")
public class Torgnization implements java.io.Serializable {

	// Fields

	private Long id;
	private TcontactsInfo tcontactsInfo;
	private Tmember tmember;
	private Tlevel tlevel;
	private Tactivity tactivity;
	private String acountName;
	private String pwd;
	private String nameCn;
	private String nameEn;
	private String logoUrl;
	private Short type;
	private Timestamp registTime;
	private Timestamp authApplyTime;
	private Timestamp authPassTime;
	private Timestamp expireTime;
	private Timestamp freezeTime;
	private Timestamp unfreezeTime;
	private Timestamp lastLoginTime;
	private Integer districtId;
	private String addressCn;
	private String addressEn;
	private String alipayAccount;
	private String alipay;
	private String officialWebsite;
	private String taobaoUrl;
	private String jdUrl;
	private String suningUrl;
	private String weiboUrl;
	private String weixinUrl;
	private String mainBusiness;
	private String serviceRange;
	private Short status;
	private String pwdToken;
	private Set<TorgDepartment> torgDepartments = new HashSet<TorgDepartment>(0);
	private Set<TorgFinance> torgFinances = new HashSet<TorgFinance>(0);
	private Set<Tmember> tmembers = new HashSet<Tmember>(0);
	private Set<TorgDdWithCodetype> torgDdWithCodetypes = new HashSet<TorgDdWithCodetype>(0);
	private Set<TorgAuthinfo> torgAuthinfos = new HashSet<TorgAuthinfo>(0);
	private Set<TorgExpressAddress> torgExpressAddresses = new HashSet<TorgExpressAddress>(0);
	private Set<Trole> troles = new HashSet<Trole>(0);

	private String qqOpenid;
	private String qqAccessToken;

	// Constructors

	/** default constructor */
	public Torgnization() {
	}

	public Torgnization(Long id) {
		this.id = id;
	}

	/** minimal constructor */
	public Torgnization(String acountName, String pwd, Timestamp registTime, Short status, String pwdToken) {
		this.acountName = acountName;
		this.pwd = pwd;
		this.registTime = registTime;
		this.status = status;
		this.pwdToken = pwdToken;
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
	@JoinColumn(name = "contacts_info_id")
	public TcontactsInfo getTcontactsInfo() {
		return this.tcontactsInfo;
	}

	public void setTcontactsInfo(TcontactsInfo tcontactsInfo) {
		this.tcontactsInfo = tcontactsInfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "linkman_id")
	public Tmember getTmember() {
		return this.tmember;
	}

	public void setTmember(Tmember tmember) {
		this.tmember = tmember;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "level_id")
	public Tlevel getTlevel() {
		return this.tlevel;
	}

	public void setTlevel(Tlevel tlevel) {
		this.tlevel = tlevel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "activity_id")
	public Tactivity getTactivity() {
		return this.tactivity;
	}

	public void setTactivity(Tactivity tactivity) {
		this.tactivity = tactivity;
	}

	@Column(name = "acount_name", nullable = false, length = 50)
	public String getAcountName() {
		return this.acountName;
	}

	public void setAcountName(String acountName) {
		this.acountName = acountName;
	}

	@Column(name = "pwd", nullable = false, length = 50)
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Column(name = "name_cn")
	public String getNameCn() {
		return this.nameCn;
	}

	public void setNameCn(String nameCn) {
		this.nameCn = nameCn;
	}

	@Column(name = "name_en")
	public String getNameEn() {
		return this.nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	@Column(name = "logo_url")
	public String getLogoUrl() {
		return this.logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	@Column(name = "type")
	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	@Column(name = "regist_time", nullable = false, length = 19)
	public Timestamp getRegistTime() {
		return this.registTime;
	}

	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}

	@Column(name = "auth_apply_time", length = 19)
	public Timestamp getAuthApplyTime() {
		return this.authApplyTime;
	}

	public void setAuthApplyTime(Timestamp authApplyTime) {
		this.authApplyTime = authApplyTime;
	}

	@Column(name = "auth_pass_time", length = 19)
	public Timestamp getAuthPassTime() {
		return this.authPassTime;
	}

	public void setAuthPassTime(Timestamp authPassTime) {
		this.authPassTime = authPassTime;
	}

	@Column(name = "expire_time", length = 19)
	public Timestamp getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Timestamp expireTime) {
		this.expireTime = expireTime;
	}

	@Column(name = "freeze_time", length = 19)
	public Timestamp getFreezeTime() {
		return this.freezeTime;
	}

	public void setFreezeTime(Timestamp freezeTime) {
		this.freezeTime = freezeTime;
	}

	@Column(name = "unfreeze_time", length = 19)
	public Timestamp getUnfreezeTime() {
		return this.unfreezeTime;
	}

	public void setUnfreezeTime(Timestamp unfreezeTime) {
		this.unfreezeTime = unfreezeTime;
	}

	@Column(name = "last_login_time", length = 19)
	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Column(name = "district_id")
	public Integer getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	@Column(name = "address_cn")
	public String getAddressCn() {
		return this.addressCn;
	}

	public void setAddressCn(String addressCn) {
		this.addressCn = addressCn;
	}

	@Column(name = "address_en")
	public String getAddressEn() {
		return this.addressEn;
	}

	public void setAddressEn(String addressEn) {
		this.addressEn = addressEn;
	}

	@Column(name = "alipay_account", length = 100)
	public String getAlipayAccount() {
		return this.alipayAccount;
	}

	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	@Column(name = "alipay", length = 100)
	public String getAlipay() {
		return this.alipay;
	}

	public void setAlipay(String alipay) {
		this.alipay = alipay;
	}

	@Column(name = "official_website")
	public String getOfficialWebsite() {
		return this.officialWebsite;
	}

	public void setOfficialWebsite(String officialWebsite) {
		this.officialWebsite = officialWebsite;
	}

	@Column(name = "taobao_url")
	public String getTaobaoUrl() {
		return this.taobaoUrl;
	}

	public void setTaobaoUrl(String taobaoUrl) {
		this.taobaoUrl = taobaoUrl;
	}

	@Column(name = "jd_url")
	public String getJdUrl() {
		return this.jdUrl;
	}

	public void setJdUrl(String jdUrl) {
		this.jdUrl = jdUrl;
	}

	@Column(name = "suning_url")
	public String getSuningUrl() {
		return this.suningUrl;
	}

	public void setSuningUrl(String suningUrl) {
		this.suningUrl = suningUrl;
	}

	@Column(name = "weibo_url")
	public String getWeiboUrl() {
		return this.weiboUrl;
	}

	public void setWeiboUrl(String weiboUrl) {
		this.weiboUrl = weiboUrl;
	}

	@Column(name = "weixin_url")
	public String getWeixinUrl() {
		return this.weixinUrl;
	}

	public void setWeixinUrl(String weixinUrl) {
		this.weixinUrl = weixinUrl;
	}

	@Column(name = "main_business")
	public String getMainBusiness() {
		return this.mainBusiness;
	}

	public void setMainBusiness(String mainBusiness) {
		this.mainBusiness = mainBusiness;
	}

	@Column(name = "service_range")
	public String getServiceRange() {
		return this.serviceRange;
	}

	public void setServiceRange(String serviceRange) {
		this.serviceRange = serviceRange;
	}

	@Column(name = "status", nullable = false)
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

	@Column(name = "qq_openid")
	public String getQqOpenid() {
		return qqOpenid;
	}

	public void setQqOpenid(String qqOpenid) {
		this.qqOpenid = qqOpenid;
	}

	@Column(name = "qq_access_token")
	public String getQqAccessToken() {
		return qqAccessToken;
	}

	public void setQqAccessToken(String qqAccessToken) {
		this.qqAccessToken = qqAccessToken;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "torgnization")
	public Set<TorgDepartment> getTorgDepartments() {
		return this.torgDepartments;
	}

	public void setTorgDepartments(Set<TorgDepartment> torgDepartments) {
		this.torgDepartments = torgDepartments;
	}


	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "torgnization")
	public Set<TorgFinance> getTorgFinances() {
		return this.torgFinances;
	}

	public void setTorgFinances(Set<TorgFinance> torgFinances) {
		this.torgFinances = torgFinances;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "torgnization")
	public Set<Tmember> getTmembers() {
		return this.tmembers;
	}

	public void setTmembers(Set<Tmember> tmembers) {
		this.tmembers = tmembers;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "torgnization")
	public Set<TorgDdWithCodetype> getTorgDdWithCodetypes() {
		return this.torgDdWithCodetypes;
	}

	public void setTorgDdWithCodetypes(Set<TorgDdWithCodetype> torgDdWithCodetypes) {
		this.torgDdWithCodetypes = torgDdWithCodetypes;
	}


	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "torgnization")
	public Set<TorgAuthinfo> getTorgAuthinfos() {
		return this.torgAuthinfos;
	}

	public void setTorgAuthinfos(Set<TorgAuthinfo> torgAuthinfos) {
		this.torgAuthinfos = torgAuthinfos;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "torgnization")
	public Set<TorgExpressAddress> getTorgExpressAddresses() {
		return this.torgExpressAddresses;
	}

	public void setTorgExpressAddresses(Set<TorgExpressAddress> torgExpressAddresses) {
		this.torgExpressAddresses = torgExpressAddresses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "torgnization")
	public Set<Trole> getTroles() {
		return troles;
	}

	public void setTroles(Set<Trole> troles) {
		this.troles = troles;
	}
}