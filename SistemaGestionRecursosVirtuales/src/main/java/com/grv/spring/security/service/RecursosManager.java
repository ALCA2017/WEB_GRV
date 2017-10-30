package com.grv.spring.security.service;

import java.util.List;

import com.grv.spring.security.mapper.RecursoImagenVO;
import com.grv.spring.security.mapper.RecursoVideoVO;
import com.grv.spring.security.mapper.RecursoWebVO;

public interface RecursosManager {
	
	public List<RecursoVideoVO> getRecursosVideosList(int idTema);
	
	public List<RecursoImagenVO> getRecursosImagenList(int idTema);
	
	public List<RecursoWebVO> getRecursosWebList(int idTema);	
	
	public void addVideo(RecursoVideoVO video);
	
	public void addImagen(RecursoImagenVO video);
	
	public void addWeb(RecursoWebVO video);
	
	

}
