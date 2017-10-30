package com.grv.spring.security.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.grv.spring.security.model.AreasAcademicas;

@Controller
public class AreasAcademicasController {
	//final Integer _idAnio = 2;
	final Integer _idAreaAcademica = 1;
	
	final String URL = "http://localhost:8455/"; 
	final String REST_AREAS = "malla/areas/academicas?anioAcademico=";	
	final String REST_ANIOS = "malla/anios/academicos";
	final String REST_UNIDADES = "malla/unidades/didacticas?idAreaAcademica=";
	
	RestTemplate restTemplate = new RestTemplate();  

    @RequestMapping("/ajax")
    public ModelAndView helloAjaxTest() {
        return new ModelAndView("ajax", "message", "Areas Academicas");
    }	
	
	@RequestMapping(value = "/AreasAcademicas" , method = RequestMethod.GET)	
	public @ResponseBody List<String> ListaDeAcademicas(@RequestParam int idAnio) {	
//public @ResponseBody List<AreasAcademicas> areasAcademicas(Model model, @RequestParam int idAnio) {		
		AreasAcademicas[] aAcademicas = restTemplate.getForObject(URL + REST_AREAS + idAnio, AreasAcademicas[].class);
	
		List<AreasAcademicas> listaAreasAcademicas = new ArrayList<AreasAcademicas>();
		for(AreasAcademicas elemento: aAcademicas) {
			listaAreasAcademicas.add(new AreasAcademicas(elemento.getIdAreaAcademica(), elemento.getNombreArea(), elemento.getNombreCortoArea()));
			System.out.println("Listando"+elemento.getNombreCortoArea());
		}

		
		 List<String> versions = new ArrayList<String>();
	        versions.add("Chuck");
	        versions.add("Norris");
	        versions.add("John");
	        versions.add("Doe");
		//model.addAttribute("listaAreasAcademicas", listaAreasAcademicas);
		return versions;
	//return new ModelAndView("Recursos", "areasAcademicasList", areasAcademicasList);	   
	}
	
}
