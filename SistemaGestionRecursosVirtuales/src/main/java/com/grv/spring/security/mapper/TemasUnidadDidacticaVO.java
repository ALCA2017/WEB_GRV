package com.grv.spring.security.mapper;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TemasUnidadDidacticaVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id_sesion;
	
	private Integer id_curso_academico;
	
	private String sesion;
	
	private String titulo_sesion;
	
	private String indicadores;
	
	private String campo_tematico;
	
	private Integer estado;
	
	private Date fecha_Actualizado;
	
	private Integer nroIMG;
	
	private Integer nroVIDEO;
	
	private Integer nroWEB;

	public TemasUnidadDidacticaVO() {
		//super();
	}

	public TemasUnidadDidacticaVO(Integer id_sesion, Integer id_curso_academico, String sesion, String titulo_sesion,
			String indicadores, String campo_tematico, Integer estado, Date fecha_Actualizado, Integer nroIMG,
			Integer nroVIDEO, Integer nroWEB) {
	//	super();
		this.id_sesion = id_sesion;
		this.id_curso_academico = id_curso_academico;
		this.sesion = sesion;
		this.titulo_sesion = titulo_sesion;
		this.indicadores = indicadores;
		this.campo_tematico = campo_tematico;
		this.estado = estado;
		this.fecha_Actualizado = fecha_Actualizado;
		this.nroIMG = nroIMG;
		this.nroVIDEO = nroVIDEO;
		this.nroWEB = nroWEB;
	}
	
	@JsonCreator
	public TemasUnidadDidacticaVO(@JsonProperty("id_sesion")Integer id_sesion,
								  @JsonProperty("sesion")String sesion, 
								  @JsonProperty("titulo_sesion")String titulo_sesion,
								  @JsonProperty("indicadores")String indicadores,
								  @JsonProperty("campo_tematico")String campo_tematico, 
								  @JsonProperty("nroIMG")Integer nroIMG, 
								  @JsonProperty("nroVIDEO")Integer nroVIDEO, 
								  @JsonProperty("nroWEB")Integer nroWEB) {
		this.id_sesion = id_sesion;
		this.sesion = sesion;
		this.titulo_sesion = titulo_sesion;
		this.indicadores = indicadores;
		this.campo_tematico = campo_tematico;
		this.nroIMG = nroIMG;
		this.nroVIDEO = nroVIDEO;
		this.nroWEB = nroWEB;
	}	

	public Integer getId_sesion() {
		return id_sesion;
	}

	public void setId_sesion(Integer id_sesion) {
		this.id_sesion = id_sesion;
	}

	public Integer getId_curso_academico() {
		return id_curso_academico;
	}

	public void setId_curso_academico(Integer id_curso_academico) {
		this.id_curso_academico = id_curso_academico;
	}

	public String getSesion() {
		return sesion;
	}

	public void setSesion(String sesion) {
		this.sesion = sesion;
	}

	public String getTitulo_sesion() {
		return titulo_sesion;
	}

	public void setTitulo_sesion(String titulo_sesion) {
		this.titulo_sesion = titulo_sesion;
	}

	public String getIndicadores() {
		return indicadores;
	}

	public void setIndicadores(String indicadores) {
		this.indicadores = indicadores;
	}

	public String getCampo_tematico() {
		return campo_tematico;
	}

	public void setCampo_tematico(String campo_tematico) {
		this.campo_tematico = campo_tematico;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Date getFecha_Actualizado() {
		return fecha_Actualizado;
	}

	public void setFecha_Actualizado(Date fecha_Actualizado) {
		this.fecha_Actualizado = fecha_Actualizado;
	}

	public Integer getNroIMG() {
		return nroIMG;
	}

	public void setNroIMG(Integer nroIMG) {
		this.nroIMG = nroIMG;
	}

	public Integer getNroVIDEO() {
		return nroVIDEO;
	}

	public void setNroVIDEO(Integer nroVIDEO) {
		this.nroVIDEO = nroVIDEO;
	}

	public Integer getNroWEB() {
		return nroWEB;
	}

	public void setNroWEB(Integer nroWEB) {
		this.nroWEB = nroWEB;
	}

	 @Override
	 public String toString() {
	  StringBuilder str = new StringBuilder();
	  str.append("id_sesion:- " + getId_sesion());
	  str.append(" sesion:- " + getSesion());
	  str.append(" titulo_sesion:- " + getTitulo_sesion());
	  str.append(" indicadores:- " + getIndicadores());
	  str.append(" campo_tematico:- " + getCampo_tematico());
	  str.append(" nroIMG:- " + getNroIMG());
	  str.append(" nroVIDEO:- " + getNroVIDEO());
	  str.append(" nroWEB:- " + getNroWEB());
	  return str.toString();
	 }
	 /*
	public String toString() {
		
		 return "TemasUnidadDidacticaVO["
				 + "id_sesion=" + id_sesion 
				 + ", sesion=" + sesion 
				 + ", titulo_sesion=" + titulo_sesion
				 + ", indicadores=" + indicadores 
				 + ", campo_tematico=" + campo_tematico 
				 + ", nroIMG=" + nroIMG 
				 + ", nroVIDEO=" + nroVIDEO 
				 + ", nroWEB=" + nroWEB + "]";
	
		  * 

		  * 
		  * 
			 return "TemasUnidadDidacticaVO{"
					 + "id_sesion=" + id_sesion 
					 + ", sesion=" + sesion 
					 + ", titulo_sesion=" + titulo_sesion
					 + ", indicadores=" + indicadores 
					 + ", campo_tematico=" + campo_tematico 
					 + ", nroIMG=" + nroIMG 
					 + ", nroVIDEO=" + nroVIDEO 
					 + ", nroWEB=" + nroWEB + '\'' +
		                '}';	 
		 
	}*/

}
