package com.grv.spring.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.grv.spring.security.mapper.MarkerVO;
import com.grv.spring.security.mapper.RecursoImagenVO;
import com.grv.spring.security.mapper.RecursoVideoVO;
import com.grv.spring.security.mapper.RecursoWebVO;
import com.grv.spring.security.service.MarkerManager;
import com.grv.spring.security.service.RecursosManager;
import com.itextpdf.text.log.SysoCounter;


@Controller
@EnableWebMvc
public class MarkerController {

    @Autowired
    MarkerManager manager;

    //http://localhost:8890/SistemaGestionRecursosVirtuales/markerlist?idTema=1
	 @RequestMapping(value = "/markerlist", method = RequestMethod.GET)
	 public @ResponseBody List<MarkerVO> getMarkerList(@RequestParam int idTema) {
		 
		 List<MarkerVO> videoList =manager.getMarkerList(idTema); 
	  
	  return videoList;  
	 } 

	 
	//http://localhost:8890/SistemaGestionRecursosVirtuales/marker/create?id_sesion=id_sesion&nombre=nombre&img_patternMat=img_patternMat&descripcion=descripcion
	 @RequestMapping(value = "/marker/create", method = RequestMethod.GET)
	 public @ResponseBody void createMarker(@RequestParam(value = "id_sesion", 	  required = true) int id_sesion,
			 								  @RequestParam(value = "nombre", 		  required = true) String nombre,
			 								  @RequestParam(value = "img_patternMat", required = true) byte[] img_patternMat,
			 								  @RequestParam(value = "descripcion", 	  required = true) String descripcion) {
		 
		 System.out.println("img_patternMat........."+img_patternMat.length);
		 System.out.println("img_patternMat........."+img_patternMat.length);
		 String miString = new String(img_patternMat);
		 
		 System.out.println("::::::::::::: miString de Bytes Pattern ........."+miString);
		 System.out.println("Controller Guardar Imagen.........");
		 MarkerVO marker = new MarkerVO(id_sesion, nombre, img_patternMat, descripcion);
		 manager.addMarker(marker);
	 }	 

}
