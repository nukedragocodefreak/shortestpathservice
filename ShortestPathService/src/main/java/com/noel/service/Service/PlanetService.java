package com.noel.service.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noel.service.models.Planet;
import com.noel.service.repository.PlanetRepository;

@Service    
public class PlanetService   
{    
@Autowired    
private PlanetRepository planetRepository; 

public List<Planet> getAllPlanets()  
{    
List<Planet> planets = new ArrayList<>();    
planetRepository.findAll().forEach(planets::add);    
return planets;    
}    
public String addPlanet(List<Planet> planet)  
{    
planetRepository.saveAll(planet);
return planet.size() + " records saved";
}    
}  