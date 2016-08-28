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
 * TorgDdWithCodetype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "torg_dd_with_codetype")
public class TorgDdWithCodetype implements java.io.Serializable {

	// Fields

	private Integer id;
	private Torgnization torgnization;
	private Long ddId;
	private String codeType;

	// Constructors

	/** default constructor */
	public TorgDdWithCodetype() {
	}

	/** full constructor */
	public TorgDdWithCodetype(Torgnization torgnization, Long ddId, String codeType) {
		this.torgnization = torgnization;
		this.ddId = ddId;
		this.codeType = codeType;
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

	@Column(name = "dd_id")
	public Long getDdId() {
		return this.ddId;
	}

	public void setDdId(Long ddId) {
		this.ddId = ddId;
	}

	@Column(name = "code_type", length = 200)
	public String getCodeType() {
		return this.codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

}