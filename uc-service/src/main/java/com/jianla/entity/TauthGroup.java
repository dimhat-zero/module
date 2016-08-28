package com.jianla.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TauthGroup entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tauth_group")
public class TauthGroup implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String description;
	private Short status;
	private Set<TauthGroupList> tauthGroupLists = new HashSet<TauthGroupList>(0);
	private Set<TroleTauthGroup> troleTauthGroups = new HashSet<TroleTauthGroup>(0);

	// Constructors

	/** default constructor */
	public TauthGroup() {
	}

	/** minimal constructor */
	public TauthGroup(String name, Short status) {
		this.name = name;
		this.status = status;
	}

	/** full constructor */
	public TauthGroup(String name, String description, Short status, Set<TauthGroupList> tauthGroupLists, Set<TroleTauthGroup> troleTauthGroups) {
		this.name = name;
		this.description = description;
		this.status = status;
		this.tauthGroupLists = tauthGroupLists;
		this.troleTauthGroups = troleTauthGroups;
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

	@Column(name = "name", nullable = false, length = 100)
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

	@Column(name = "status", nullable = false)
	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tauthGroup")
	public Set<TauthGroupList> getTauthGroupLists() {
		return this.tauthGroupLists;
	}

	public void setTauthGroupLists(Set<TauthGroupList> tauthGroupLists) {
		this.tauthGroupLists = tauthGroupLists;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tauthGroup")
	public Set<TroleTauthGroup> getTroleTauthGroups() {
		return this.troleTauthGroups;
	}

	public void setTroleTauthGroups(Set<TroleTauthGroup> troleTauthGroups) {
		this.troleTauthGroups = troleTauthGroups;
	}

}