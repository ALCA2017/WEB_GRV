package com.grv.util;

import org.springframework.web.client.RestTemplate;
import com.grv.spring.security.model.AreasAcademicas;


public class SpringRestTemplateExample {

	public static void main(String args[]) {

		RestTemplate restTemplate = new RestTemplate();
		//restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		try {
			
			 String url = "http://localhost:8455/alumnos/areas/academicas?idAnioAcademico=2";
				
			 AreasAcademicas[] listAreasAcademicas = restTemplate.getForObject(url, AreasAcademicas[].class);
			 
			 System.out.println("Ver lista : " + listAreasAcademicas[0].getNombreArea());
			// return Arrays.asList(employees);
			
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
	}

}