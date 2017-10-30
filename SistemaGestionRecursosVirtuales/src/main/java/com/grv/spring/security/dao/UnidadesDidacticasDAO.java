package com.grv.spring.security.dao;

import java.util.List;

import com.grv.spring.security.mapper.TemasUnidadDidacticaVO;

public interface UnidadesDidacticasDAO {
	
	public List<TemasUnidadDidacticaVO> getAllTemasUnidadesDidacticas(int idUnidadDidactica);
	
	public List<TemasUnidadDidacticaVO> getTemas_Recursos_UD(int idUnidadDidactica);
	

}
