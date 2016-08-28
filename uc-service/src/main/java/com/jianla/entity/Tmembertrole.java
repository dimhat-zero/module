package com.jianla.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Tmembertrole entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tmembertrole")
public class Tmembertrole implements java.io.Serializable {

	// Fields

	private Integer id;
	private Trole trole;
	private Tmember tmember;

	// Constructors

	/** default constructor */
	public Tmembertrole() {
	}

	/** full constructor */
	public Tmembertrole(Trole trole, Tmember tmember) {
		this.trole = trole;
		this.tmember = tmember;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")
	public Trole getTrole() {
		return this.trole;
	}

	public void setTrole(Trole trole) {
		this.trole = trole;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	public Tmember getTmember() {
		return this.tmember;
	}

	public void setTmember(Tmember tmember) {
		this.tmember = tmember;
	}

}