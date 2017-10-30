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

import com.grv.spring.security.mapper.RecursoImagenVO;
import com.grv.spring.security.mapper.RecursoVideoVO;
import com.grv.spring.security.mapper.RecursoWebVO;
import com.grv.spring.security.service.RecursosManager;


@Controller
@EnableWebMvc
public class RecursosController {

    @Autowired
    RecursosManager manager;

    //http://localhost:8890/SistemaGestionRecursosVirtuales/weblist?idTema=1
	 @RequestMapping(value = "/videolist", method = RequestMethod.GET)
	 public @ResponseBody List<RecursoVideoVO> getVideoList(@RequestParam int idTema) {
		 
		 List<RecursoVideoVO> videoList =manager.getRecursosVideosList(idTema); 
	  
	  return videoList;  
	 } 

	 //http://localhost:8890/SistemaGestionRecursosVirtuales/imagenlist?idTema=1
	 @RequestMapping(value = "/imagenlist", method = RequestMethod.GET)
	 public @ResponseBody List<RecursoImagenVO> getImagenList(@RequestParam int idTema) {
		 
		 List<RecursoImagenVO> imagenList =manager.getRecursosImagenList(idTema); 
	  
	  return imagenList;  
	 }  
	 
	 //http://localhost:8890/SistemaGestionRecursosVirtuales/weblist?idTema=1
	 @RequestMapping(value = "/weblist", method = RequestMethod.GET)
	 public @ResponseBody List<RecursoWebVO> getWebList(@RequestParam int idTema) {
		 
		 List<RecursoWebVO> webList =manager.getRecursosWebList(idTema); 
	  
	  return webList;  
	 }  	

	 @RequestMapping(value = "/video/create", method = RequestMethod.POST)
	 public String videoCreate(@ModelAttribute("video") RecursoVideoVO video) {
		 manager.addVideo(video);
	     return "";
	 }
	 
	 @RequestMapping(value = "/imagen/create", method = RequestMethod.POST)
	 public String imagenCreate(@ModelAttribute("imagen") RecursoImagenVO imagen) {
		 manager.addImagen(imagen);
	     return "";
	 }
	 
	 @RequestMapping(value = "/web/create", method = RequestMethod.POST)
	 public String webCreate(@ModelAttribute("web") RecursoWebVO web) {
		 manager.addWeb(web);
	     return "";
	 }	 
	 
	 
	 

}
