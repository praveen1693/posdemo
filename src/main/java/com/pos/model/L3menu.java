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
@Table(name = "l3menu")
public class L3menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@Column(name = "l3id", unique=true, nullable = false)
	private int l3id;
	
	@Size(min=3, max=50)
	@Column(name = "menumaster", nullable = false)
	private String menumaster;
	
	@Size(min=2, max=50)
	@Column(name = "l1name", nullable = false)
	private String l1name;
	
	@Size(min=2, max=50)
	@Column(name = "l2name", nullable = false)
	private String l2name;
	
	@Size(min=2, max=50)
	@Column(name = "l3name", nullable = false)
	private String l3name;
	
	@Column(name = "price", nullable = false)
	private int price;
	
	@Column(name = "taxrate", nullable = false)
	private float taxrate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getL3id() {
		return l3id;
	}

	public void setL3id(int l3id) {
		this.l3id = l3id;
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

	public String getL3name() {
		return l3name;
	}

	public void setL3name(String l3name) {
		this.l3name = l3name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getTaxrate() {
		return taxrate;
	}

	public void setTaxrate(float taxrate) {
		this.taxrate = taxrate;
	}

	@Override
	public String toString() {
		return "L3menu [id=" + id + ", l3id=" + l3id + ", menumaster=" + menumaster + ", l1name=" + l1name + ", l2name="
				+ l2name + ", l3name=" + l3name + ", price=" + price + ", taxrate=" + taxrate + "]";
	}

	
}
