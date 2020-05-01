package com.noel.service.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.noel.service.Service.PlanetService;
import com.noel.service.models.Planet;
import com.noel.service.models.Route;
import com.noel.service.models.Traffic;
import com.noel.service.repository.PlanetRepository;
import com.noel.service.repository.RouteRepository;
import com.noel.service.repository.TrafficRepository;

@RestController   
public class ImportExcelController {
	
	@Autowired    
	private PlanetRepository planetRepositoryy; 
	@Autowired    
	private RouteRepository routeRepositoryy;
	@Autowired    
	private TrafficRepository trafficRepositoryy; 
	
	 
	  @RequestMapping(value = "/import-planet", method = RequestMethod.POST)
	    public String importExcelFile(@RequestParam("file") MultipartFile files) throws IOException {
	        HttpStatus status = HttpStatus.OK;
	        List<Planet> lplanet = new ArrayList<>();

	        XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
	        XSSFSheet worksheet = workbook.getSheetAt(0);

	        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
	            if (index > 0) {
	            	Planet planet = new Planet();

	                XSSFRow row = worksheet.getRow(index);
	                Integer id = (int) row.getCell(0).getNumericCellValue();
	                planet.setId(id);
	                planet.setName(row.getCell(1).getStringCellValue());
	                planet.setNode(row.getCell(2).getStringCellValue());
	                //product.setCategory(row.getCell(3).getStringCellValue());

	                lplanet.add(planet);
	                planetRepositoryy.saveAll(lplanet);
	               
	            }
	        }

	        //return new ResponseEntity<>(productList, status);
	        return lplanet.size() + " records saved";
	    }
	  
	  @RequestMapping(value = "/import-route", method = RequestMethod.POST)
	    public String importExcelFile1(@RequestParam("file") MultipartFile files) throws IOException {
	        HttpStatus status = HttpStatus.OK;
	        List<Route> lroute = new ArrayList<>();

	        XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
	        XSSFSheet worksheet = workbook.getSheetAt(0);

	        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
	            if (index > 0) {
	            	Route route = new Route();

	                XSSFRow row = worksheet.getRow(index);
	                Integer id = (int) row.getCell(0).getNumericCellValue();
	                route.setId(id);
	                route.setPlanetOrigin(row.getCell(1).getStringCellValue());
	                route.setPlanetDestination(row.getCell(2).getStringCellValue());	                
	                route.getDistanceInLightYears(row.getCell(3).getNumericCellValue());
	                
	                lroute.add(route);
	                routeRepositoryy.saveAll(lroute);
	               
	            }
	        }

	        //return new ResponseEntity<>(productList, status);
	        return lroute.size() + " records saved";
	    }
	  
	  @RequestMapping(value = "/import-traffic", method = RequestMethod.POST)
	    public String importExcelFile2(@RequestParam("file") MultipartFile files) throws IOException {
	        HttpStatus status = HttpStatus.OK;
	        List<Traffic> ltraffic = new ArrayList<>();

	        XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
	        XSSFSheet worksheet = workbook.getSheetAt(0);

	        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
	            if (index > 0) {
	            	Traffic traffic = new Traffic();

	                XSSFRow row = worksheet.getRow(index);
	                Integer id = (int) row.getCell(0).getNumericCellValue();
	                traffic.setId(id);
	                traffic.setPlanetOrigin(row.getCell(1).getStringCellValue());
	                traffic.getPlanetDestination(row.getCell(2).getStringCellValue());
	                traffic.setTrafficDelayInLightYears(row.getCell(3).getNumericCellValue());
	                ltraffic.add(traffic);
	                trafficRepositoryy.saveAll(ltraffic);
	               
	            }
	        }

	        return ltraffic.size() + " records saved";
	    }
	}
