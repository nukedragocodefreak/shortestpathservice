package com.noel.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.noel.service.Service.PlanetService;
import com.noel.service.models.Planet;

@RestController    
public class PlanetController {
	
	@Autowired
	private PlanetService pService;
	
	@RequestMapping("/planets")    
	public List<Planet> getAllPlanets()  
	{    
	return pService.getAllPlanets();    
	}       
	@RequestMapping(value="/add-planet", method=RequestMethod.POST)    
	public void addPlanet(@RequestBody List<Planet> planet)  
	{    
	pService.addPlanet(planet);  
	}       
	}    