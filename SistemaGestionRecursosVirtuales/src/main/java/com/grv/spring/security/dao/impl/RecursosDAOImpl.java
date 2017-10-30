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

import com.grv.spring.security.dao.RecursosDAO;
import com.grv.spring.security.mapper.RecursoImagenVO;
import com.grv.spring.security.mapper.RecursoVideoVO;
import com.grv.spring.security.mapper.RecursoWebVO;
import com.grv.util.Utilitarios;

@Service
@Transactional
public class RecursosDAOImpl extends JdbcDaoSupport implements RecursosDAO{

    @Autowired
    public RecursosDAOImpl(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
  	
	Utilitarios util = new Utilitarios();
	
	@Override
	public List<RecursoImagenVO> getRecursoImagenByTemaId(int idTema) {
		
        String sql = "SELECT id_recurso_img, id_sesion, result, text, url, referencia1, referencia2, estado, fecha_actualizado "
        		   + " FROM bd_wsgrv.recurso_img WHERE estado = 1 AND id_sesion = ? ";
        
        //List<RecursoImagenVO> recursoIMG = this.getJdbcTemplate().queryForList(sql,params, RecursoImagenVO.class);

	     Object[] params = new Object[] { idTema };  
	     
	     List<RecursoImagenVO> recurso = this.getJdbcTemplate().query(sql, params, new RowMapper<RecursoImagenVO>() {  
			@Override
			public RecursoImagenVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				RecursoImagenVO t = new RecursoImagenVO(rs.getInt("id_recurso_img"),
														rs.getInt("id_sesion"),
														rs.getString("result"),
														rs.getString("text"),
														rs.getString("url"),
														rs.getString("referencia1"),
														rs.getString("referencia2"),
														rs.getInt("estado"),
														rs.getDate("estado") );
		
				return t;
			}
	
	     }); 
        return recurso;
	}

	@Override
	public List<RecursoVideoVO> getRecursoVideoByTemaId(int idTema) {
        String sql = "SELECT id_recurso_video, id_sesion, result, text, url, referencia1, referencia2, estado, fecha_actualizado "
     		   + " FROM bd_wsgrv.recurso_video WHERE estado = 1 AND id_sesion = ? ";
               
       // List<RecursoVideoVO> recursoVIDEO = this.getJdbcTemplate().queryForList(sql,params, RecursoVideoVO.class);
        
	     Object[] params = new Object[] { idTema };  
	     
	     List<RecursoVideoVO> recurso = this.getJdbcTemplate().query(sql, params, new RowMapper<RecursoVideoVO>() {  
			@Override
			public RecursoVideoVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				RecursoVideoVO t = new RecursoVideoVO(rs.getInt("id_recurso_img"),
													  rs.getInt("id_sesion"),
													  rs.getString("result"),
													  rs.getString("text"),
													  rs.getString("url"),
													  rs.getString("referencia1"),
													  rs.getString("referencia2"),
													  rs.getInt("estado"),
													  rs.getDate("estado") );
		
				return t;
			}
	
	     }); 
       return recurso;
	}

	@Override
	public List<RecursoWebVO> getRecursoWebByTemaId(int idTema) {
        String sql = "SELECT id_recurso_www, id_sesion, result, text, url, referencia1, referencia2, estado, fecha_actualizado "
     		   + " FROM bd_wsgrv.recurso_www WHERE estado = 1 AND id_sesion = ? ";  

       // List<RecursoWebVO> recursoWWW = this.getJdbcTemplate().queryForList(sql,params, RecursoWebVO.class);
        
	     Object[] params = new Object[] { idTema };  
	     
	     List<RecursoWebVO> recurso = this.getJdbcTemplate().query(sql, params, new RowMapper<RecursoWebVO>() {  
			@Override
			public RecursoWebVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				RecursoWebVO t = new RecursoWebVO(rs.getInt("id_recurso_www"),
													  rs.getInt("id_sesion"),
													  rs.getString("result"),
													  rs.getString("text"),
													  rs.getString("url"),
													  rs.getString("referencia1"),
													  rs.getString("referencia2"),
													  rs.getInt("estado"),
													  rs.getDate("estado") );
		
				return t;
			}
	
	     }); 
      return recurso;
	}
	
	@Override
	public void insertVideo(RecursoVideoVO video) {  
		  
		  String sql = "INSERT INTO bd_wsgrv.recurso_video(id_sesion, result, text, url, referencia1, referencia2, estado, fecha_actualizado) "
		  			 + " VALUES (?, ?, ?, ?, ?, ?, ?, ?) " ;  		  
		  
		  this.getJdbcTemplate().update(sql, new Object[] {sql, 
															  video.getId_sesion(), 
															  video.getResult(), 
															  video.getText(), 
															  video.getURL(), 
															  "", "", 1, util.getFechaActual()});		  
	 }
	
	@Override
	public void insertImagen(RecursoImagenVO video) {  
		  
		  String sql = "INSERT INTO bd_wsgrv.recurso_img(id_sesion, result, text, url, referencia1, referencia2, estado, fecha_actualizado) "
		  			 + " VALUES (?, ?, ?, ?, ?, ?, ?, ?) " ;  		  
		  
		  this.getJdbcTemplate().update(sql, new Object[] {sql, 
															  video.getId_sesion(), 
															  video.getResult(), 
															  video.getText(), 
															  video.getURL(), 
															  "", "", 1, util.getFechaActual()});		  
	 } 
	
	@Override
	public void insertWeb(RecursoWebVO video) {  
		  
		  String sql = "INSERT INTO bd_wsgrv.recurso_www(id_sesion, result, text, url, referencia1, referencia2, estado, fecha_actualizado) "
		  			 + " VALUES (?, ?, ?, ?, ?, ?, ?, ?) " ;  		  
		  
		  this.getJdbcTemplate().update(sql, new Object[] {sql, 
															  video.getId_sesion(), 
															  video.getResult(), 
															  video.getText(), 
															  video.getURL(), 
															  "", "", 1, util.getFechaActual()});		  
	 }  	 
	 
 

}
