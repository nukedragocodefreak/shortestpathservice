package com.noel.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.noel.service.models.Traffic;

public interface TrafficRepository extends CrudRepository<Traffic, String>  {

}
