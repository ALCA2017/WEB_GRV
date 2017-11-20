package com.grv.spring.security.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grv.spring.security.dao.MarkerDAO;
import com.grv.spring.security.dao.RecursosDAO;
import com.grv.spring.security.mapper.MarkerVO;
import com.grv.spring.security.mapper.RecursoImagenVO;
import com.grv.spring.security.mapper.RecursoVideoVO;
import com.grv.spring.security.mapper.RecursoWebVO;
import com.grv.util.Utilitarios;

@Service
@Transactional
public class MarkerDAOImp extends JdbcDaoSupport implements MarkerDAO{

    @Autowired
    public MarkerDAOImp(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
  	
	Utilitarios util = new Utilitarios();
	
	
	@Override
	public List<MarkerVO> getMarkerByTemaId(int idTema) {
        String sql = "SELECT id_marker, id_sesion, nombre, img_patternmat, descripcion, estado, fecha_creado, fecha_actualizado "
     		       + " FROM bd_wsgrv.marker WHERE estado = 1 AND id_sesion = ? ";
        
	     Object[] params = new Object[] { idTema };  
	     
	     List<MarkerVO> marker = this.getJdbcTemplate().query(sql, params, new RowMapper<MarkerVO>() {  
			@Override
			public MarkerVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				MarkerVO t = new MarkerVO(rs.getInt("id_sesion"),														
										  rs.getString("nombre"),
										  rs.getBytes("img_patternmat"),
										  rs.getString("descripcion"),
										  rs.getInt("estado"),
									      rs.getDate("fecha_creado"),
										  rs.getDate("fecha_actualizado"));		
				return t;
			}	
	     }); 
     return marker;
	}

	
	@Override
	public void insertMarker(MarkerVO marker) {
		
		System.out.println("::::::::::: INGRESANDO AL METODO DAO insertMarker ::::::: " +marker.getNombre());
		
		  String sql = "INSERT INTO bd_wsgrv.marker(id_sesion, nombre, img_patternmat, descripcion, estado, fecha_creado, fecha_actualizado) "
		  			 + " VALUES (?, ?, ?, ?, ?, ?, ?) " ;
		  
	  System.out.println("marker ::::::::::: "+marker);
	  
		  this.getJdbcTemplate().update(sql, new Object[] {
				  marker.getId_sesion(), 
				  marker.getNombre(), 
				  marker.getImg_patternMat(), 
				  marker.getDescripcion(), 
				  1, util.getFechaActual(),null
			});	 		
	}
	
}
