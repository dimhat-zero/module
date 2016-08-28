package com.jianla.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class OrgnizationModel implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 管理平台的类型编码
	 */
	public static final int ORG_TYPE_PLATFORM = 1;
	/**
	 * 被冻结的企业会员类型编码
	 */
	public static final int ORG_TYPE_CONSUMER_FROZEN = 2;
	/**
	 * 正常的企业会员类型编码
	 */
	public static final int ORG_TYPE_CONSUMER_ACTIVE = 3;
	/**
	 * 被冻结的机构会员类型编码结
	 */
	public static final int ORG_TYPE_PROVIDER_FROZEN = 4;
	/**
	 * 免费机构会员类型编码
	 */
	public static final int ORG_TYPE_PROVIDER_FREE = 5;
	/**
	 * 通过认证的机构会员类型编码
	 */
	public static final int ORG_TYPE_PROVIDER_CERTIFIED = 6;
	/**
	 * 付费机构会员类型编码
	 */
	public static final int ORG_TYPE_PROVIDER_PAY = 7;
	/**
	 * VIP机构会员类型编码
	 */
	public static final int ORG_TYPE_PROVIDER_VIP = 8;
	/**
	 * 合作伙伴会员类型编码
	 */
	public static final int ORG_TYPE_PROVIDER_PARTNER = 9;

	// 实体类属性
	/**
	 * 企业id(这里的企业指平台三种类型的用户：检测机构、公司、平台) 主键
	 */
	private Long id;
	/**
	 * 注册账号
	 */
	private String acountName;
	/**
	 * 密码
	 */
	private String pwd;
	/**
	 * 中文名称
	 */
	private String nameCn;
	/**
	 * 英文名称
	 */
	private String nameEn;
	/**
	 * 账号头像
	 */
	private String logoUrl;
	/**
	 * 企业类型：见上面的类型常量
	 */
	private Short type;
	/**
	 * 用于显示机构会员类型 trole表的name字段
	 */
	private String typeName;
	/**
	 * 注册时间
	 */
	private Timestamp registTime;
	/**
	 * 申请认证时间
	 */
	private Timestamp authApplyTime;
	/**
	 * 认证通过时间
	 */
	private Timestamp authPassTime;
	/**
	 * 最后一次登录时间
	 */
	private Timestamp lastLoginTime;

	private Date beginDate;// 时间范围
	private Date endDate;
	/**
	 * 搜索,时间范围类型 1:账号注册时间 2.认证通过时间 3.账号到期时间 4.账号冻结时间
	 */
	private Short dateType;

	/**
	 * 最低一级行政区id，可关联到国家-省-市-区
	 */
	private Integer districtId;
	private Integer cityId;
	/**
	 * 会员到期时间
	 */
	private Timestamp expireTime;
	/**
	 * 机构冻结时间
	 */
	private Timestamp freezeTime;
	/**
	 * 机构解冻时间
	 */
	private Timestamp unfreezeTime;
	/**
	 * 中文地址
	 */
	private String addressCn;
	/**
	 * 英文地址
	 */
	private String addressEn;
	/**
	 * 官网
	 */
	private String officialWebsite;
	/**
	 * 淘宝店铺
	 */
	private String taobaoUrl;
	/**
	 * 京东店铺
	 */
	private String jdUrl;
	/**
	 * 苏宁店铺
	 */
	private String suningUrl;
	/**
	 * 微博
	 */
	private String weiboUrl;
	/**
	 * 微信公众号
	 */
	private String weixinUrl;
	/**
	 * 主营业务
	 */
	private String mainBusiness;
	/**
	 * 服务产品范围
	 */
	private String serviceRange;
	/**
	 * 企业状态：
	 */
	private Short status;

	private String pwdToken;
	/**
	 * 账号绑定手机号,同时是机构/企业绑定手机
	 */
	private String orgTel;
	/**
	 * 是机构/企业电话
	 */
	private String orgMobile;
	/**
	 * 账号绑定Email,同时是机构/企业绑定邮箱
	 */
	private String orgEmail;

	/**
	 * 机构/企业 传真
	 */
	private String orgFax;

	/**
	 * 机构/企业 QQ
	 */
	private String orgQQ;
	/**
	 * 机构/企业 旺旺
	 */
	private String orgWangWang;
	private String orgFacebook;
	private String orgTweeter;
	private String orgLinkedin;
	/**
	 * 支付宝认证账户
	 */
	private String alipayAccount;
	/**
	 * 支付宝账号
	 */
	private String alipay;
	// 关联类属性
	// private TcontactsInfo tcontactsInfo;
	// private Tmember tmember;
	// private Tlevel tlevel;
	// private Tactivity tactivity;
	// /**
	// * 企业联系信息id
	// */
	// private Long contactsInfoId;
	/**
	 * 企业联系人id（linkman_id）,指向表Tmember
	 */
	private Long memberId;
	/**
	 * 企业联系人真实姓名
	 */
	private String memberRealName;

	/**
	 * 企业等级id
	 */
	private Long levelId;
	/**
	 * 企业等级名字，页面中用星星表示的，是否有必要？ tlevel(name)
	 */
	private String levelName;

	/**
	 * 企业活跃度id
	 */
	private Long activityId;
	/**
	 * 企业活跃度名,如:极度活跃 是否有必要?tactivity(Name)
	 */
	private String activityName;
	// 附加角色权限信息
	/**
	 * 企业的角色id：多角色的时候，用逗号分割组成字符串
	 */
	private String roleId;
	/**
	 * 企业的角色名：多角色的时候，用逗号分割组成字符串
	 */
	private String roleName;
	/**
	 * trole-type 1:平台 2.企业 3.机构
	 */
	private short roleType;
	/**
	 * 企业具有的权限id：多个权限的时候，用逗号分割组成字符串
	 */
	private String authIds;
	/**
	 * 企业具有的权限名：多个权限的时候，用逗号分割组成字符串
	 */
	private String authNames;
	/**
	 * 企业具有的权限url：多个权限的时候，用逗号分割组成字符串
	 */
	private String authUrls;
	/**
	 * 新密码，企业修改密码的时候使用。原密码存放pwd中
	 */
	private String newPwd;

	private Short orgAuthInfoStatus;

	private String businessTypeIds;
	private String serviceTypeIds;
	private String shopSld;
	private String shopName;
	private Long ddId;

	/** 店铺列表推荐的3个服务 */
	//private List<ServiceModel> introServices;

	/** 机构描述 */
	private String orgDescription;

	/** qq公开id*/
	private String qqOpenid;

	/** qq的token */
	private String qqAccessToken;

	public String getShopSld() {
		return shopSld;
	}

	public void setShopSld(String shopSld) {
		this.shopSld = shopSld;
	}

	public OrgnizationModel() {
		super();
	}

	public OrgnizationModel(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAcountName() {
		return acountName;
	}

	public void setAcountName(String acountName) {
		this.acountName = acountName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNameCn() {
		return nameCn;
	}

	public void setNameCn(String nameCn) {
		this.nameCn = nameCn;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Timestamp getRegistTime() {
		return registTime;
	}

	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}

	public Timestamp getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Timestamp expireTime) {
		this.expireTime = expireTime;
	}

	public Timestamp getFreezeTime() {
		return freezeTime;
	}

	public void setFreezeTime(Timestamp freezeTime) {
		this.freezeTime = freezeTime;
	}

	public Timestamp getUnfreezeTime() {
		return unfreezeTime;
	}

	public void setUnfreezeTime(Timestamp unfreezeTime) {
		this.unfreezeTime = unfreezeTime;
	}

	public String getAddressCn() {
		return addressCn;
	}

	public void setAddressCn(String addressCn) {
		this.addressCn = addressCn;
	}

	public String getAddressEn() {
		return addressEn;
	}

	public void setAddressEn(String addressEn) {
		this.addressEn = addressEn;
	}

	public String getOfficialWebsite() {
		return officialWebsite;
	}

	public void setOfficialWebsite(String officialWebsite) {
		this.officialWebsite = officialWebsite;
	}

	public String getTaobaoUrl() {
		return taobaoUrl;
	}

	public void setTaobaoUrl(String taobaoUrl) {
		this.taobaoUrl = taobaoUrl;
	}

	public String getJdUrl() {
		return jdUrl;
	}

	public void setJdUrl(String jdUrl) {
		this.jdUrl = jdUrl;
	}

	public String getSuningUrl() {
		return suningUrl;
	}

	public void setSuningUrl(String suningUrl) {
		this.suningUrl = suningUrl;
	}

	public String getWeiboUrl() {
		return weiboUrl;
	}

	public void setWeiboUrl(String weiboUrl) {
		this.weiboUrl = weiboUrl;
	}

	public String getWeixinUrl() {
		return weixinUrl;
	}

	public void setWeixinUrl(String weixinUrl) {
		this.weixinUrl = weixinUrl;
	}

	public String getMainBusiness() {
		return mainBusiness;
	}

	public void setMainBusiness(String mainBusiness) {
		this.mainBusiness = mainBusiness;
	}

	public String getServiceRange() {
		return serviceRange;
	}

	public void setServiceRange(String serviceRange) {
		this.serviceRange = serviceRange;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	// public Long getContactsInfoId() {
	// return contactsInfoId;
	// }
	//
	// public void setContactsInfoId(Long contactsInfoId) {
	// this.contactsInfoId = contactsInfoId;
	// }

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getMemberRealName() {
		return memberRealName;
	}

	public void setMemberRealName(String memberRealName) {
		this.memberRealName = memberRealName;
	}

	public Long getLevelId() {
		return levelId;
	}

	public void setLevelId(Long levelId) {
		this.levelId = levelId;
	}

	public Long getActivityId() {
		return activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getAuthIds() {
		return authIds;
	}

	public short getRoleType() {
		return roleType;
	}

	public void setRoleType(short roleType) {
		this.roleType = roleType;
	}

	public void setAuthIds(String authIds) {
		this.authIds = authIds;
	}

	public String getAuthNames() {
		return authNames;
	}

	public void setAuthNames(String authNames) {
		this.authNames = authNames;
	}

	public String getAuthUrls() {
		return authUrls;
	}

	public void setAuthUrls(String authUrls) {
		this.authUrls = authUrls;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	public Timestamp getAuthApplyTime() {
		return authApplyTime;
	}

	public void setAuthApplyTime(Timestamp authApplyTime) {
		this.authApplyTime = authApplyTime;
	}

	public Timestamp getAuthPassTime() {
		return authPassTime;
	}

	public void setAuthPassTime(Timestamp authPassTime) {
		this.authPassTime = authPassTime;
	}

	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getOrgTel() {
		return orgTel;
	}

	public void setOrgTel(String orgTel) {
		this.orgTel = orgTel;
	}

	public String getOrgFax() {
		return orgFax;
	}

	public void setOrgFax(String orgFax) {
		this.orgFax = orgFax;
	}

	public String getOrgEmail() {
		return orgEmail;
	}

	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}

	public String getOrgQQ() {
		return orgQQ;
	}

	public void setOrgQQ(String orgQQ) {
		this.orgQQ = orgQQ;
	}

	public String getOrgWangWang() {
		return orgWangWang;
	}

	public void setOrgWangWang(String orgWangWang) {
		this.orgWangWang = orgWangWang;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getOrgFacebook() {
		return orgFacebook;
	}

	public void setOrgFacebook(String orgFacebook) {
		this.orgFacebook = orgFacebook;
	}

	public String getOrgTweeter() {
		return orgTweeter;
	}

	public void setOrgTweeter(String orgTweeter) {
		this.orgTweeter = orgTweeter;
	}

	public String getOrgLinkedin() {
		return orgLinkedin;
	}

	public void setOrgLinkedin(String orgLinkedin) {
		this.orgLinkedin = orgLinkedin;
	}

	public String getAlipayAccount() {
		return alipayAccount;
	}

	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getAlipay() {
		return alipay;
	}

	public void setAlipay(String alipay) {
		this.alipay = alipay;
	}

	public Short getOrgAuthInfoStatus() {
		return orgAuthInfoStatus;
	}

	public void setOrgAuthInfoStatus(Short orgAuthInfoStatus) {
		this.orgAuthInfoStatus = orgAuthInfoStatus;
	}

	public String getBusinessTypeIds() {
		return businessTypeIds;
	}

	public void setBusinessTypeIds(String businessTypeIds) {
		this.businessTypeIds = businessTypeIds;
	}

	public String getServiceTypeIds() {
		return serviceTypeIds;
	}

	public void setServiceTypeIds(String serviceTypeIds) {
		this.serviceTypeIds = serviceTypeIds;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Short getDateType() {
		return dateType;
	}

	public void setDateType(Short dateType) {
		this.dateType = dateType;
	}

	public String getPwdToken() {
		return pwdToken;
	}

	public void setPwdToken(String pwdToken) {
		this.pwdToken = pwdToken;
	}

	public String getOrgMobile() {
		return orgMobile;
	}

	public void setOrgMobile(String orgMobile) {
		this.orgMobile = orgMobile;
	}

	public Long getDdId() {
		return ddId;
	}

	public void setDdId(Long ddId) {
		this.ddId = ddId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getOrgDescription() {
		return orgDescription;
	}

	public void setOrgDescription(String orgDescription) {
		this.orgDescription = orgDescription;
	}

	public String getQqOpenid() {
		return qqOpenid;
	}

	public void setQqOpenid(String qqOpenid) {
		this.qqOpenid = qqOpenid;
	}

	public String getQqAccessToken() {
		return qqAccessToken;
	}

	public void setQqAccessToken(String qqAccessToken) {
		this.qqAccessToken = qqAccessToken;
	}

}
