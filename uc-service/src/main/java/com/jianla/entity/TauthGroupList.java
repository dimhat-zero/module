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
 * TauthGroupList entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tauth_group_list")
public class TauthGroupList implements java.io.Serializable {

	// Fields

	private Integer id;
	private TauthGroup tauthGroup;
	private Tauth tauth;

	// Constructors

	/** default constructor */
	public TauthGroupList() {
	}

	/** full constructor */
	public TauthGroupList(TauthGroup tauthGroup, Tauth tauth) {
		this.tauthGroup = tauthGroup;
		this.tauth = tauth;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "group_id", nullable = false)
	public TauthGroup getTauthGroup() {
		return this.tauthGroup;
	}

	public void setTauthGroup(TauthGroup tauthGroup) {
		this.tauthGroup = tauthGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "auth_id", nullable = false)
	public Tauth getTauth() {
		return this.tauth;
	}

	public void setTauth(Tauth tauth) {
		this.tauth = tauth;
	}

}