package com.noel.service.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.noel.service.models.Traffic;
import com.noel.service.repository.TrafficRepository;

@Service
public class TrafficService
{    
@Autowired    
private TrafficRepository trafficRepository; 

public List<Traffic> getAllTraffics()  
{    
List<Traffic> traffics = new ArrayList<>();    
trafficRepository.findAll().forEach(traffics::add);    
return traffics;    
}    
public String addTraffic(List<Traffic> traffic)  
{    
trafficRepository.saveAll(traffic);
return traffic.size() + " records saved";
}    
}  
