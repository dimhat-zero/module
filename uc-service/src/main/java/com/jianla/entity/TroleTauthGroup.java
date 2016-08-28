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
 * TroleTauthGroup entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trole_tauth_group")
public class TroleTauthGroup implements java.io.Serializable {

	// Fields

	private Integer id;
	private Trole trole;
	private TauthGroup tauthGroup;

	// Constructors

	/** default constructor */
	public TroleTauthGroup() {
	}

	/** full constructor */
	public TroleTauthGroup(Trole trole, TauthGroup tauthGroup) {
		this.trole = trole;
		this.tauthGroup = tauthGroup;
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
	@JoinColumn(name = "role_id")
	public Trole getTrole() {
		return this.trole;
	}

	public void setTrole(Trole trole) {
		this.trole = trole;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "auth_group_id")
	public TauthGroup getTauthGroup() {
		return this.tauthGroup;
	}

	public void setTauthGroup(TauthGroup tauthGroup) {
		this.tauthGroup = tauthGroup;
	}

}