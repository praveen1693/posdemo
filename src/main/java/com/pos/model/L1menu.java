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
@Table(name = "l1menu")
public class L1menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@Column(name = "l1id", unique=true, nullable = false)
	private int l1id;
	
	@Size(min=3, max=50)
	@Column(name = "menumaster", nullable = false)
	private String menumaster;
	
	@Size(min=2, max=50)
	@Column(name = "l1name", nullable = false)
	private String l1name;
	
	@Column(name = "taxrate", nullable = false)
	private float taxrate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getL1id() {
		return l1id;
	}

	public void setL1id(int l1id) {
		this.l1id = l1id;
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

	public float getTaxrate() {
		return taxrate;
	}

	public void setTaxrate(float taxrate) {
		this.taxrate = taxrate;
	}

	@Override
	public String toString() {
		return "L1menu [id=" + id + ", l1id=" + l1id + ", menumaster=" + menumaster + ", l1name=" + l1name
				+ ", taxrate=" + taxrate + "]";
	}
	
	
}
