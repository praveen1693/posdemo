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
@Table(name = "menumaster")
public class MenuMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@Column(name = "menumasterid", unique=true, nullable = false)
	private String menumasterid;
	
	@Size(min=3, max=50)
	@Column(name = "menumaster", nullable = false)
	private String menumaster;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMenumasterid() {
		return menumasterid;
	}

	public void setMenumasterid(String menumasterid) {
		this.menumasterid = menumasterid;
	}

	public String getMenumaster() {
		return menumaster;
	}

	public void setMenumaster(String menumaster) {
		this.menumaster = menumaster;
	}

	@Override
	public String toString() {
		return "MenuMaster [id=" + id + ", menumasterid=" + menumasterid + ", menumaster=" + menumaster + "]";
	}
	
	
}
