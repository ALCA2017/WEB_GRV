package com.grv.spring.security.service;

import java.util.List;

import com.grv.spring.security.mapper.TemasUnidadDidacticaVO;

public interface TemasUnidadDidacticaManager {
	
	public List<TemasUnidadDidacticaVO> getAllTemasUnidadesDidacticas(int idUnidadDidactica);
	
	public List<TemasUnidadDidacticaVO> getTemas_Recursos_UD(int idUnidadDidactica);
	
	

}
