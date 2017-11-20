package com.grv.spring.security.mapper;

import java.io.Serializable;
import java.util.Date;

public class MarkerVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	 
	private Integer id_marker;	
	private Integer id_sesion;	
	private String nombre;	
	private byte[] img_patternMat;	
	private String descripcion;	
	private Integer estado;	
	private Date fecha_creado;
	private Date fecha_actualizado;

	public MarkerVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MarkerVO(Integer id_sesion, 
				  String nombre, byte[] img_patternMat, String descripcion,
			      Integer estado, Date fecha_creado, Date fecha_actualizado) {
		super();
		this.id_sesion 			= id_sesion;
		this.nombre 			= nombre;
		this.img_patternMat 	= img_patternMat;
		this.descripcion 		= descripcion;
		this.estado 			= estado;
		this.fecha_actualizado 	= fecha_actualizado;
	}

	public MarkerVO(Integer id_sesion, String nombre, 
			        byte[] img_patternMat, String descripcion) {
		this.id_sesion 			= id_sesion;
		this.nombre 			= nombre;
		this.img_patternMat 	= img_patternMat;
		this.descripcion 		= descripcion;
	}	

	public Integer getId_marker() {
		return id_marker;
	}

	public void setId_marker(Integer id_marker) {
		this.id_marker = id_marker;
	}

	public Integer getId_sesion() {
		return id_sesion;
	}

	public void setId_sesion(Integer id_sesion) {
		this.id_sesion = id_sesion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte[] getImg_patternMat() {
		return img_patternMat;
	}

	public void setImg_patternMat(byte[] img_patternMat) {
		this.img_patternMat = img_patternMat;
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

	public Date getFecha_creado() {
		return fecha_creado;
	}

	public void setFecha_creado(Date fecha_creado) {
		this.fecha_creado = fecha_creado;
	}

	public Date getFecha_actualizado() {
		return fecha_actualizado;
	}

	public void setFecha_actualizado(Date fecha_actualizado) {
		this.fecha_actualizado = fecha_actualizado;
	}

	@Override
	public String toString() {
		return "MarkerVO [id_marker=" + id_marker + ", id_sesion=" + id_sesion + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + ", estado="+ estado + ", fecha_actualizado=" + fecha_actualizado + "]";
	}
	
}
