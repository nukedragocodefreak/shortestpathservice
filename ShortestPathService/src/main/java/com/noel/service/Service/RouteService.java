package com.noel.service.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noel.service.models.Route;
import com.noel.service.repository.RouteRepository;

@Service
public class RouteService
{    
@Autowired    
private RouteRepository routeRepository; 

public List<Route> getAllRoutes()  
{    
List<Route> routes = new ArrayList<>();    
routeRepository.findAll().forEach(routes::add);    
return routes;    
}    
public String addRoute(List<Route> route)  
{    
routeRepository.saveAll(route);
return route.size() + " records saved";
}    
}  