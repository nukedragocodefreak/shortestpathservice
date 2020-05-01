package com.noel.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.noel.service.Service.TrafficService;
import com.noel.service.models.Traffic;


@RestController 
public class TrafficController
{
	@Autowired
	private TrafficService tService;
	
	@RequestMapping("/traffics")    
	public List<Traffic> getAllTraffics()  
	{    
	return tService.getAllTraffics();    
	}       
	@RequestMapping(value="/add-traffic", method=RequestMethod.POST)    
	public void addPlanet(@RequestBody List<Traffic> traffic)  
	{     
	tService.addTraffic(traffic);
	}       
	}   