package com.grv.spring.security.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grv.spring.security.dao.UnidadesDidacticasDAO;
import com.grv.spring.security.mapper.TemasUnidadDidacticaVO;
import com.grv.spring.security.service.TemasUnidadDidacticaManager;

@Service
public class TemasUnidadDidacticaManagerImpl implements TemasUnidadDidacticaManager{

    @Autowired
    UnidadesDidacticasDAO dao;	
	
	@Override
	public List<TemasUnidadDidacticaVO> getAllTemasUnidadesDidacticas(int idUnidadDidactica) {
		// TODO Auto-generated method stub
		return dao.getAllTemasUnidadesDidacticas(idUnidadDidactica);
	}

	@Override
	public List<TemasUnidadDidacticaVO> getTemas_Recursos_UD(int idUnidadDidactica) {
		// TODO Auto-generated method stub
		return dao.getTemas_Recursos_UD(idUnidadDidactica);
	}
	
	

}
