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
@Table(name = "tables")
public class Tables {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@Column(name = "tableid", unique=true, nullable = false)
	private int tableid;
	
	@Size(min=3, max=50)
	@Column(name = "estname", nullable = false)
	private String estname;
	
	@Size(min=3, max=50)
	@Column(name = "floorname", nullable = false)
	private String floorname;
	
	@Size(min=3, max=50)
	@Column(name = "tablename", nullable = false)
	private String tablename;
	
	@Column(name = "capacity", nullable = false)
	private int capacity;

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

	public String getFloorname() {
		return floorname;
	}

	public void setFloorname(String floorname) {
		this.floorname = floorname;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getTableid() {
		return tableid;
	}

	public void setTableid(int tableid) {
		this.tableid = tableid;
	}

	@Override
	public String toString() {
		return "Tables [id=" + id + ", tableid=" + tableid + ", estname=" + estname + ", floorname=" + floorname
				+ ", tablename=" + tablename + ", capacity=" + capacity + "]";
	}

	
	
	
}
