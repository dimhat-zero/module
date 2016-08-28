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
 * Tlevel entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tlevel")
public class Tlevel implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set<Torgnization> torgnizations = new HashSet<Torgnization>(0);

	// Constructors

	/** default constructor */
	public Tlevel() {
	}

	/** full constructor */
	public Tlevel(String name, Set<Torgnization> torgnizations) {
		this.name = name;
		this.torgnizations = torgnizations;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tlevel")
	public Set<Torgnization> getTorgnizations() {
		return this.torgnizations;
	}

	public void setTorgnizations(Set<Torgnization> torgnizations) {
		this.torgnizations = torgnizations;
	}

}