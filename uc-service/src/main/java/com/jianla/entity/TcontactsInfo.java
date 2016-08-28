package com.jianla.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TcontactsInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tcontacts_info")
public class TcontactsInfo implements java.io.Serializable {

	// Fields

	private Long id;
	private String tel;
	private String fax;
	private String mobile;
	private String email;
	private String qq;
	private String wangwang;
	private String facebook;
	private String tweeter;
	private String linkedin;
	private String contact1;
	private String contact2;
	private String contact3;
	private Set<Tmember> tmembers = new HashSet<Tmember>(0);
	private Set<Torgnization> torgnizations = new HashSet<Torgnization>(0);

	// Constructors

	/** default constructor */
	public TcontactsInfo() {
	}

	/** full constructor */
	public TcontactsInfo(String tel, String fax, String mobile, String email,
			String qq, String wangwang, String facebook, String tweeter,
			String linkedin, String contact1, String contact2, String contact3,
			Set<Tmember> tmembers, Set<Torgnization> torgnizations) {
		this.tel = tel;
		this.fax = fax;
		this.mobile = mobile;
		this.email = email;
		this.qq = qq;
		this.wangwang = wangwang;
		this.facebook = facebook;
		this.tweeter = tweeter;
		this.linkedin = linkedin;
		this.contact1 = contact1;
		this.contact2 = contact2;
		this.contact3 = contact3;
		this.tmembers = tmembers;
		this.torgnizations = torgnizations;
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

	@Column(name = "tel", length = 50)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "fax", length = 50)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "mobile", length = 50)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "qq", length = 50)
	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name = "wangwang", length = 100)
	public String getWangwang() {
		return this.wangwang;
	}

	public void setWangwang(String wangwang) {
		this.wangwang = wangwang;
	}

	@Column(name = "facebook", length = 100)
	public String getFacebook() {
		return this.facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	@Column(name = "tweeter", length = 100)
	public String getTweeter() {
		return this.tweeter;
	}

	public void setTweeter(String tweeter) {
		this.tweeter = tweeter;
	}

	@Column(name = "linkedin", length = 100)
	public String getLinkedin() {
		return this.linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	@Column(name = "contact1", length = 100)
	public String getContact1() {
		return this.contact1;
	}

	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}

	@Column(name = "contact2", length = 100)
	public String getContact2() {
		return this.contact2;
	}

	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}

	@Column(name = "contact3", length = 100)
	public String getContact3() {
		return this.contact3;
	}

	public void setContact3(String contact3) {
		this.contact3 = contact3;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tcontactsInfo")
	public Set<Tmember> getTmembers() {
		return this.tmembers;
	}

	public void setTmembers(Set<Tmember> tmembers) {
		this.tmembers = tmembers;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tcontactsInfo")
	public Set<Torgnization> getTorgnizations() {
		return this.torgnizations;
	}

	public void setTorgnizations(Set<Torgnization> torgnizations) {
		this.torgnizations = torgnizations;
	}

}