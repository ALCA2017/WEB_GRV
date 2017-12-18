package com.grv.spring.security.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.grv.spring.security.model.AnioAcademico;


@Controller
public class MallaCurrilarController {
	

	final String URL = "http://localhost:8455/"; 


	RestTemplate restTemplate = new RestTemplate();
	
	@RequestMapping(value = "/Recursos", method = RequestMethod.GET)
	public ModelAndView gestionRecursosVirtuales(Model model) {	

		AnioAcademico[] aniosacademicoslist = restTemplate.getForObject(URL + "malla/anios_academicos", AnioAcademico[].class);		
		return new ModelAndView("Recursos", "aniosacademicoslist", aniosacademicoslist);	

	}
	
}
