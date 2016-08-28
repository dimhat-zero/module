package com.jianla.entity;

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
 * Tauth entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tauth")
public class Tauth implements java.io.Serializable {

	// Fields

	private Integer id;
	private Tauth tauth;
	private String name;
	private String description;
	private Integer seq;
	private String url;
	private Short isMenu;
	private Short type;
	private Set<TauthGroupList> tauthGroupLists = new HashSet<TauthGroupList>(0);
	private Set<Tauth> tauths = new HashSet<Tauth>(0);

	// Constructors

	/** default constructor */
	public Tauth() {
	}

	/** full constructor */
	public Tauth(Tauth tauth, String name, String description, Integer seq, String url, Short isMenu, Short type, Set<TauthGroupList> tauthGroupLists, Set<Tauth> tauths) {
		this.tauth = tauth;
		this.name = name;
		this.description = description;
		this.seq = seq;
		this.url = url;
		this.isMenu = isMenu;
		this.type = type;
		this.tauthGroupLists = tauthGroupLists;
		this.tauths = tauths;
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
	@JoinColumn(name = "pid")
	public Tauth getTauth() {
		return this.tauth;
	}

	public void setTauth(Tauth tauth) {
		this.tauth = tauth;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "seq")
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "url", length = 200)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "is_menu")
	public Short getIsMenu() {
		return this.isMenu;
	}

	public void setIsMenu(Short isMenu) {
		this.isMenu = isMenu;
	}

	@Column(name = "type")
	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tauth")
	public Set<TauthGroupList> getTauthGroupLists() {
		return this.tauthGroupLists;
	}

	public void setTauthGroupLists(Set<TauthGroupList> tauthGroupLists) {
		this.tauthGroupLists = tauthGroupLists;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tauth")
	public Set<Tauth> getTauths() {
		return this.tauths;
	}

	public void setTauths(Set<Tauth> tauths) {
		this.tauths = tauths;
	}

}