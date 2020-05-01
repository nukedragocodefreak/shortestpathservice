package com.noel.service.models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Planet {
@Id
	private int id;
	private String name;
	private String node;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNode() {
		return node;
	}
	public void setNode(String node) {
		this.node = node;
	}
	
	
}
