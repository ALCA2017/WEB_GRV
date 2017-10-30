package com.grv.spring.security.model;

import java.util.Date;

public class TemasUnidadDidactica {

	private Integer id_sesion;
	
	private Integer id_curso_academico;
	
	private String sesion;
	
	private String titulo_sesion;
	
	private String indicadores;
	
	private String campo_tematico;
	
	private Integer estado;
	
	private Date fecha_Actualizado;

	public TemasUnidadDidactica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TemasUnidadDidactica(Integer id_sesion, Integer id_curso_academico, String sesion, String titulo_sesion,
			String indicadores, String campo_tematico, Integer estado, Date fecha_Actualizado) {
		super();
		this.id_sesion = id_sesion;
		this.id_curso_academico = id_curso_academico;
		this.sesion = sesion;
		this.titulo_sesion = titulo_sesion;
		this.indicadores = indicadores;
		this.campo_tematico = campo_tematico;
		this.estado = estado;
		this.fecha_Actualizado = fecha_Actualizado;
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

}
