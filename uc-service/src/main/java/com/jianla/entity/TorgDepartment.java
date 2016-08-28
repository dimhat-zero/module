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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TorgDepartment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "torg_department")
public class TorgDepartment implements java.io.Serializable {

	// Fields

	private Long id;
	private Tmember tmember;
	private Torgnization torgnization;
	private String name;
	private String address;
	private String workContent;
	private Short status;
	private Set<Tmember> tmembers = new HashSet<Tmember>(0);

	// Constructors

	/** default constructor */
	public TorgDepartment() {
	}

	/** minimal constructor */
	public TorgDepartment(Torgnization torgnization) {
		this.torgnization = torgnization;
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
	@JoinColumn(name = "boss_id")
	public Tmember getTmember() {
		return this.tmember;
	}

	public void setTmember(Tmember tmember) {
		this.tmember = tmember;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "org_id", nullable = false)
	public Torgnization getTorgnization() {
		return this.torgnization;
	}

	public void setTorgnization(Torgnization torgnization) {
		this.torgnization = torgnization;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "address", length = 65535)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "work_content", length = 65535)
	public String getWorkContent() {
		return this.workContent;
	}

	public void setWorkContent(String workContent) {
		this.workContent = workContent;
	}

	@Column(name = "status")
	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "torgDepartment")
	public Set<Tmember> getTmembers() {
		return this.tmembers;
	}

	public void setTmembers(Set<Tmember> tmembers) {
		this.tmembers = tmembers;
	}


}