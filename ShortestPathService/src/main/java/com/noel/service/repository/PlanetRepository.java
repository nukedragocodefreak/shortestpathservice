package com.noel.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.noel.service.models.Planet;

public interface PlanetRepository extends CrudRepository<Planet, String>   
{    
	
}    