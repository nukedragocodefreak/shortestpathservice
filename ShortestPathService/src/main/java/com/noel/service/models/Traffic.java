package com.noel.service.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Traffic {
	@Id
	private int id;
	private String planetOrigin;
	private String planetDestination;
	private double  trafficDelayInLightYears;
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
	public String getPlanetDestination(String planetDestination) {
		return planetDestination;
	}
	public void setPlanetDestination(String planetDestination) {
		this.planetDestination = planetDestination;
	}
	public double getTrafficDelayInLightYears() {
		return trafficDelayInLightYears;
	}
	public void setTrafficDelayInLightYears(double d) {
		this.trafficDelayInLightYears = d;
	}
	
	
}
