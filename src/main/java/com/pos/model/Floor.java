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
@Table(name = "floor")
public class Floor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@Column(name = "floorid", unique=true, nullable = false)
	private int floorid;
	
	@Size(min=3, max=50)
	@Column(name = "estname", nullable = false)
	private String estname;
	
	@Size(min=3, max=50)
	@Column(name = "floorname", nullable = false)
	private String floorname;

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

	public int getFloorid() {
		return floorid;
	}

	public void setFloorid(int floorid) {
		this.floorid = floorid;
	}

	@Override
	public String toString() {
		return "Floor [id=" + id + ", floorid=" + floorid + ", estname=" + estname + ", floorname=" + floorname + "]";
	}

	
	
	
}
