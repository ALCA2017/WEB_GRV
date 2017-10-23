package com.grv.spring.security.model;

public class AnioAcademico {

	private Integer idAnioAcademico;
	
	private Integer anio;
	
	private String descripcion;
	
	private Integer estado;
	
	public AnioAcademico() {		
	}
	
	public AnioAcademico(Integer idAnioAcademico, Integer anio, String descripcion, Integer estado) {		
		this.idAnioAcademico = idAnioAcademico;
		this.anio = anio;
		this.descripcion = descripcion;
		this.estado = estado;
	}
    
	public Integer getIdAnioAcademico() {
		return idAnioAcademico;
	}
	
	public void setIdAnioAcademico(Integer idAnioAcademico) {
		this.idAnioAcademico = idAnioAcademico;
	}
	
	public Integer getAnio() {
		return anio;
	}
	
	public void setAnio(Integer anio) {
		this.anio = anio;
	}	
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Integer getEstado() {
		return estado;
	}
	
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
}
