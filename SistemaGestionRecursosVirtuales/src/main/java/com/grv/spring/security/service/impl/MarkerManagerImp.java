package com.grv.spring.security.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grv.spring.security.dao.MarkerDAO;
import com.grv.spring.security.mapper.MarkerVO;
import com.grv.spring.security.service.MarkerManager;

@Service
public class MarkerManagerImp implements MarkerManager{

	
    @Autowired
    MarkerDAO dao;

	@Override
	public List<MarkerVO> getMarkerList(int idTema) {
		return dao.getMarkerByTemaId(idTema);
	}

	
	@Override
	public void addMarker(MarkerVO marker) {
		dao.insertMarker(marker);
	}


}
