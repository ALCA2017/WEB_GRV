package com.grv.spring.security.controller;


import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.grv.spring.security.model.AnioAcademico;
import com.grv.spring.security.model.AreasAcademicas;
import com.grv.spring.security.model.UnidadDidactica;

@Controller
public class MallaCurrilarController {
	final Integer _idAnio = 2;
	final Integer _idAreaAcademica = 1;
	
	final String URL = "http://localhost:8455/"; 
	final String REST_AREAS = "malla/areas/academicas?anioAcademico=";	
	final String REST_ANIOS = "malla/anios/academicos";
	final String REST_UNIDADES = "malla/unidades/didacticas?idAreaAcademica=";
	
	RestTemplate restTemplate = new RestTemplate();   
	@RequestMapping(value = "/verGRV", method = RequestMethod.GET)
	public ModelAndView gestionRecursosVirtuales(Model model, Principal principal) {	
		AreasAcademicas[] areasAcademicasList = restTemplate.getForObject(URL + REST_AREAS + _idAnio, AreasAcademicas[].class);
		System.out.println("Ver lista areas : " + areasAcademicasList[0].getNombreArea());
	return new ModelAndView("gestionRecursosVirtualesPage", "areasAcademicasList", areasAcademicasList);	   
	}
   
	RestTemplate restTemplate_anios = new RestTemplate();
	@RequestMapping(value = "verGRV1", method = RequestMethod.GET)
	public ModelAndView gestionRecursosVirtuales_anios(Model model, Principal principal) {
		AnioAcademico[] anioAcademicosList = restTemplate_anios.getForObject(URL + REST_ANIOS, AnioAcademico[].class);
		System.out.println("Ver lista anios : " + anioAcademicosList[0].getDescripcion());
	return new ModelAndView("gestionRecursosVirtualesPage", "anioAcademicosList", anioAcademicosList);
	}
	
	RestTemplate restTemplate_unidades = new RestTemplate();
	@RequestMapping(value = "verGRV2", method = RequestMethod.GET)
	public ModelAndView gestionRecursosVirtuales_unidades(Model model, Principal principal) {
		UnidadDidactica[] unidadDidacticasList = restTemplate_unidades.getForObject(URL + REST_UNIDADES + _idAreaAcademica, UnidadDidactica[].class);
		System.out.println("Ver lista Unidades: " + unidadDidacticasList[0].getTituloUnidad());
	return new ModelAndView("gestionRecursosVirtualesPage", "unidadDidacticasList", unidadDidacticasList);
	}
}
