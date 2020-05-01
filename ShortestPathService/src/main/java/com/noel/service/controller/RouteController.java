package com.noel.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.noel.service.Service.RouteService;
import com.noel.service.models.Route;

@RestController 
public class RouteController 
{
	@Autowired
	private RouteService rService;
	
	@RequestMapping("/routes")    
	public List<Route> getAllRoutes()  
	{    
	return rService.getAllRoutes();    
	}       
	@RequestMapping(value="/add-route", method=RequestMethod.POST)    
	public void addRoute(@RequestBody List<Route> route)  
	{    
	rService.addRoute(route);  
	}       
	}   