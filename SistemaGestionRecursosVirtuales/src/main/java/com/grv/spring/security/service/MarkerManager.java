package com.grv.spring.security.service;

import java.util.List;
import com.grv.spring.security.mapper.MarkerVO;


public interface MarkerManager {
	
	public List<MarkerVO> getMarkerList(int idTema);
		
	public void addMarker(MarkerVO marker);	

}
