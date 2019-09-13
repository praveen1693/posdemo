package com.pos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "establishment")
public class Establishment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@Column(name = "estid", unique=true, nullable = false)
	private int estid;
	
	@Size(min=3, max=50)
	@Column(name = "estname", nullable = false)
	private String estname;
	
	@Size(min=3, max=50)
	@Column(name = "menumaster", nullable = false)
	private String menumaster;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstname() {
		return estname;
	}

	public void setEstname(String estname) {
		this.estname = estname;
	}

	public String getMenumaster() {
		return menumaster;
	}

	public void setMenumaster(String menumaster) {
		this.menumaster = menumaster;
	}

	public int getEstid() {
		return estid;
	}

	public void setEstid(int estid) {
		this.estid = estid;
	}

	@Override
	public String toString() {
		return "Establishment [id=" + id + ", estid=" + estid + ", estname=" + estname + ", menumaster=" + menumaster
				+ "]";
	}

	
	
	
}
