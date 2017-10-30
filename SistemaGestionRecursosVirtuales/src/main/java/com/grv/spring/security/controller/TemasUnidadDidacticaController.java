package com.grv.spring.security.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.grv.spring.security.mapper.TemasUnidadDidacticaVO;
import com.grv.spring.security.service.TemasUnidadDidacticaManager;

@Controller
@EnableWebMvc
public class TemasUnidadDidacticaController {
	
    @Autowired
    TemasUnidadDidacticaManager manager;
    
    @RequestMapping(value = "/unidadesAcademicas/temas", method = RequestMethod.GET)
    public @ResponseBody String getAllTemasUnidadesAcademicas(Model model, @RequestParam int idUnidadDidactica)
    {
        model.addAttribute("TemasUnidadesAcademicas", manager.getAllTemasUnidadesDidacticas(idUnidadDidactica));        
        return "temasListDisplay";
    }
    
    /* Extrae todos los temas realcionados a una Unidad Didactica
     * Input: idUnidadDidactica
     * URL local
     * http://localhost:8890/SistemaGestionRecursosVirtuales/unidadesAcademicas/temas_recursos?idUnidadDidactica=1
     * */
    @RequestMapping(value = "/unidadesAcademicas/temas_recursos", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<TemasUnidadDidacticaVO>> getAllTemasConRecursos(@RequestParam int idUnidadDidactica)
    {
    	System.out.println("Log WS temas_recursos :: ");
    	
    	HttpHeaders headers = new HttpHeaders();
    	List<TemasUnidadDidacticaVO>  temas = manager.getTemas_Recursos_UD(idUnidadDidactica);
    	
    	  if (temas == null) {
    		   return new ResponseEntity<List<TemasUnidadDidacticaVO>>(HttpStatus.NOT_FOUND);
    		  }    	
    	/*
    	for(TemasUnidadDidacticaVO el: temas) {
    		temasList.add(new TemasUnidadDidacticaVO(el.getId_sesion(), el.getSesion(), el.getTitulo_sesion(), el.getIndicadores(), el.getCampo_tematico(),
    				el.getNroIMG(), el.getNroVIDEO(), el.getNroWEB()));
			System.out.println("Listando"+el.getCampo_tematico());
    	}
*/      
        return new ResponseEntity<List<TemasUnidadDidacticaVO>>(temas, headers, HttpStatus.OK);// temasList;
    }


  
    
}
