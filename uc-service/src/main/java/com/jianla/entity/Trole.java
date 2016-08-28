package com.jianla.entity;

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
 * Trole entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trole")
public class Trole implements java.io.Serializable {

	// Fields

	private Integer id;
	private Torgnization torgnization;
	private String name;
	private String description;
	private Short type;
	private Integer ctrlRoleId;
	private Timestamp createTime;
	private Set<TroleTauthGroup> troleTauthGroups = new HashSet<TroleTauthGroup>(0);
	private Set<Tmembertrole> tmembertroles = new HashSet<Tmembertrole>(0);

	// Constructors

	/** default constructor */
	public Trole() {
	}

	/** full constructor */
	public Trole(Torgnization torgnization, String name, String description, Short type, Timestamp createTime, Set<TroleTauthGroup> troleTauthGroups, Set<Tmembertrole> tmembertroles) {
		this.torgnization = torgnization;
		this.name = name;
		this.description = description;
		this.type = type;
		this.createTime = createTime;
		this.troleTauthGroups = troleTauthGroups;
		this.tmembertroles = tmembertroles;
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
	@JoinColumn(name = "org_id")
	public Torgnization getTorgnization() {
		return this.torgnization;
	}

	public void setTorgnization(Torgnization torgnization) {
		this.torgnization = torgnization;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "type")
	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	@Column(name = "create_time", length = 19)
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "trole")
	public Set<TroleTauthGroup> getTroleTauthGroups() {
		return this.troleTauthGroups;
	}

	public void setTroleTauthGroups(Set<TroleTauthGroup> troleTauthGroups) {
		this.troleTauthGroups = troleTauthGroups;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "trole")
	public Set<Tmembertrole> getTmembertroles() {
		return this.tmembertroles;
	}

	public void setTmembertroles(Set<Tmembertrole> tmembertroles) {
		this.tmembertroles = tmembertroles;
	}
	@Column(name = "ctrl_role_id")
	public Integer getCtrlRoleId() {
		return ctrlRoleId;
	}

	public void setCtrlRoleId(Integer ctrlRoleId) {
		this.ctrlRoleId = ctrlRoleId;
	}

}