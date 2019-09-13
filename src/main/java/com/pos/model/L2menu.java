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
@Table(name = "l2menu")
public class L2menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@Column(name = "l2id", unique=true, nullable = false)
	private int l2id;
	
	@Size(min=3, max=50)
	@Column(name = "menumaster", nullable = false)
	private String menumaster;
	
	@Size(min=2, max=50)
	@Column(name = "l1name", nullable = false)
	private String l1name;
	
	@Size(min=2, max=50)
	@Column(name = "l2name", nullable = false)
	private String l2name;
	
	@Column(name = "taxrate", nullable = false)
	private float taxrate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getL2id() {
		return l2id;
	}

	public void setL2id(int l2id) {
		this.l2id = l2id;
	}

	public String getMenumaster() {
		return menumaster;
	}

	public void setMenumaster(String menumaster) {
		this.menumaster = menumaster;
	}

	public String getL1name() {
		return l1name;
	}

	public void setL1name(String l1name) {
		this.l1name = l1name;
	}

	public String getL2name() {
		return l2name;
	}

	public void setL2name(String l2name) {
		this.l2name = l2name;
	}

	public float getTaxrate() {
		return taxrate;
	}

	public void setTaxrate(float taxrate) {
		this.taxrate = taxrate;
	}

	@Override
	public String toString() {
		return "L2menu [id=" + id + ", l2id=" + l2id + ", menumaster=" + menumaster + ", l1name=" + l1name + ", l2name="
				+ l2name + ", taxrate=" + taxrate + "]";
	}
	
	
}
