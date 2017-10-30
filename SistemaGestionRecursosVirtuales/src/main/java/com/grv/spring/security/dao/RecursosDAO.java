package com.grv.spring.security.dao;

import java.util.List;

import com.grv.spring.security.mapper.RecursoImagenVO;
import com.grv.spring.security.mapper.RecursoVideoVO;
import com.grv.spring.security.mapper.RecursoWebVO;

public interface RecursosDAO {

	public List<RecursoImagenVO> getRecursoImagenByTemaId(int idTema);
	
	public List<RecursoVideoVO> getRecursoVideoByTemaId(int idTema);
	
	public List<RecursoWebVO> getRecursoWebByTemaId(int idTema);

}
