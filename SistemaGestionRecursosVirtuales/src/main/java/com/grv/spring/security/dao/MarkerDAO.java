package com.grv.spring.security.dao;

import java.util.List;

import com.grv.spring.security.mapper.MarkerVO;

public interface MarkerDAO {

	public List<MarkerVO> getMarkerByTemaId(int idTema);
	
	public void insertMarker(MarkerVO marker);	
}
