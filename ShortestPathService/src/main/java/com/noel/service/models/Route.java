package com.noel.service.models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Route {
	@Id
	private int id;
	private String planetOrigin;
	private String planetDestination;
	private String distanceInLightYears;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlanetOrigin() {
		return planetOrigin;
	}
	public void setPlanetOrigin(String planetOrigin) {
		this.planetOrigin = planetOrigin;
	}
	public String getPlanetDestination() {
		return planetDestination;
	}
	public void setPlanetDestination(String planetDestination) {
		this.planetDestination = planetDestination;
	}
	public double getDistanceInLightYears(double d) {
		return d;
	}
	public void setDistanceInLightYears(String distanceInLightYears) {
		this.distanceInLightYears = distanceInLightYears;
	}

	
}
