package com.grv.spring.security.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grv.spring.security.dao.RecursosDAO;
import com.grv.spring.security.mapper.RecursoImagenVO;
import com.grv.spring.security.mapper.RecursoVideoVO;
import com.grv.spring.security.mapper.RecursoWebVO;
import com.grv.spring.security.service.RecursosManager;

@Service
public class RecursosManagerImpl implements RecursosManager{

	
    @Autowired
    RecursosDAO dao;
    
	@Override
	public List<RecursoVideoVO> getRecursosVideosList(int idTema) {
		return dao.getRecursoVideoByTemaId(idTema);
	}

	@Override
	public List<RecursoImagenVO> getRecursosImagenList(int idTema) {
		return dao.getRecursoImagenByTemaId(idTema);
	}

	@Override
	public List<RecursoWebVO> getRecursosWebList(int idTema) {
		return dao.getRecursoWebByTemaId(idTema);
	}

	@Override
	public void addVideo(RecursoVideoVO video) {
		// TODO Auto-generated method stub
		dao.insertVideo(video);
	}

	@Override
	public void addImagen(RecursoImagenVO imagen) {
		// TODO Auto-generated method stub
		dao.insertImagen(imagen);
	}

	@Override
	public void addWeb(RecursoWebVO web) {
		// TODO Auto-generated method stub
		dao.insertWeb(web);
	}



}
