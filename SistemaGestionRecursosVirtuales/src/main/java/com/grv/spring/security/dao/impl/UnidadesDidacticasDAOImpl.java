package com.grv.spring.security.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grv.spring.security.dao.UnidadesDidacticasDAO;
import com.grv.spring.security.mapper.TemasUnidadDidacticaVO;

@Service
@Transactional
public class UnidadesDidacticasDAOImpl extends JdbcDaoSupport implements UnidadesDidacticasDAO{

	
    @Autowired
    public UnidadesDidacticasDAOImpl(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
    
	@Override
	public List<TemasUnidadDidacticaVO> getAllTemasUnidadesDidacticas(int idUnidadDidactica) {
        String sql = "SELECT s.id_sesion, s.id_curso_academico, s.sesion, s.titulo_sesion, d.indicadores , d.campo_tematico,s.estado, s.fecha_Actualizado "
        		+ " FROM  bd_wsgrv.sesion_unidad_didactica s INNER JOIN bd_wsgrv.detalle_sesion d ON s.id_sesion = d.id_sesion "
        		+ " WHERE s.estado = 1 AND s.id_unidad_didactica = ? ";
     
     Object[] params = new Object[] { idUnidadDidactica };        
     List<TemasUnidadDidacticaVO> temasUnidadDidactica = this.getJdbcTemplate().queryForList(sql,params, TemasUnidadDidacticaVO.class);
   
     return temasUnidadDidactica;
	}

	@Override
	public List<TemasUnidadDidacticaVO> getTemas_Recursos_UD(int idUnidadDidactica) {

		String sql = "SELECT s.id_sesion, "
        		+ " s.sesion, s.titulo_sesion, d.indicadores , d.campo_tematico, "
        		+ " (SELECT count(*) FROM bd_wsgrv.recurso_img WHERE id_sesion = s.id_sesion) as nroIMG, "
        		+ " (SELECT count(*) FROM bd_wsgrv.recurso_video WHERE id_sesion = s.id_sesion) as nroVIDEO, "
        		+ " (SELECT count(*) FROM bd_wsgrv.recurso_www WHERE id_sesion = s.id_sesion) as nroWEB "
        		+ " FROM  bd_wsgrv.sesion_unidad_didactica s INNER JOIN bd_wsgrv.detalle_sesion d ON s.id_sesion = d.id_sesion "
        		+ " WHERE s.estado = 1 AND s.id_unidad_didactica = ?  ";
       
	     Object[] params = new Object[] { idUnidadDidactica };  
	     
	     List<TemasUnidadDidacticaVO> temas = this.getJdbcTemplate().query(sql, params, new RowMapper<TemasUnidadDidacticaVO>() {  
			@Override
			public TemasUnidadDidacticaVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				TemasUnidadDidacticaVO t = new TemasUnidadDidacticaVO();
				t.setId_sesion(rs.getInt("id_sesion"));
				t.setSesion(rs.getString("sesion"));
				t.setTitulo_sesion(rs.getString("titulo_sesion"));
				t.setIndicadores(rs.getString("indicadores"));
				t.setCampo_tematico(rs.getString("campo_tematico"));
				t.setNroIMG(rs.getInt("nroIMG"));
				t.setNroVIDEO(rs.getInt("nroVIDEO"));
				t.setNroWEB(rs.getInt("nroWEB"));			
				return t;
			}
	
	     }); 
	     
	     return temas;
	}
	
	/*
	 * 
	 * 
public void saveOrUpdate(Contact contact) {
    if (contact.getId() > 0) {
        // update
        String sql = "UPDATE contact SET name=?, email=?, address=?, "
                    + "telephone=? WHERE contact_id=?";
        jdbcTemplate.update(sql, contact.getName(), contact.getEmail(),
                contact.getAddress(), contact.getTelephone(), contact.getId());
    } else {
        // insert
        String sql = "INSERT INTO contact (name, email, address, telephone)"
                    + " VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, contact.getName(), contact.getEmail(),
                contact.getAddress(), contact.getTelephone());
    }
 
}
	 * 
	 * 
	 public void insertData(TemasUnidadDidacticaVO user) {  
		  
		  String sql = "INSERT INTO user "  
		    + "(first_name,last_name, gender, city) VALUES (?, ?, ?,?)";  
		  
		  //JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
		  
//		  jdbctemplate.update(  
//		    sql,  
//		    new object[] { user.getfirstname(), user.getlastname(),  
//		      user.getgender(), user.getcity() });  
		  
		 }  */
	
}
