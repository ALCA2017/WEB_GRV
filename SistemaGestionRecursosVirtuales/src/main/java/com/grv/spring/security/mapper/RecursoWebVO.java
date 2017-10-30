package com.grv.spring.security.mapper;

import java.io.Serializable;
import java.util.Date;

public class RecursoWebVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	 
	private Integer id_recurso_img;
	
	private Integer id_sesion;
	
	private String Result;
	
	private String Text;
	
	private String URL;
	
	private String REFERENCIA1;
	
	private String REFERENCIA2;	
	
	private Integer estado;
	
	private Date fecha_actualizado;

    public RecursoWebVO(Integer id_recurso_img, Integer id_sesion, String result, String text, String uRL,
			String rEFERENCIA1, String rEFERENCIA2, Integer estado, Date fecha_actualizado) {
		super();
		this.id_recurso_img 	= id_recurso_img;
		this.id_sesion 			= id_sesion;
		this.Result 			= result;
		this.Text 				= text;
		this.URL 				= uRL;
		this.REFERENCIA1 		= rEFERENCIA1;
		this.REFERENCIA2 		= rEFERENCIA2;
		this.estado 			= estado;
		this.fecha_actualizado	= fecha_actualizado;
	}	
	
    public Integer getId_recurso_img() {
		return id_recurso_img;
	}



	public void setId_recurso_img(Integer id_recurso_img) {
		this.id_recurso_img = id_recurso_img;
	}



	public Integer getId_sesion() {
		return id_sesion;
	}



	public void setId_sesion(Integer id_sesion) {
		this.id_sesion = id_sesion;
	}



	public String getResult() {
		return Result;
	}



	public void setResult(String result) {
		Result = result;
	}



	public String getText() {
		return Text;
	}



	public void setText(String text) {
		Text = text;
	}



	public String getURL() {
		return URL;
	}



	public void setURL(String uRL) {
		URL = uRL;
	}



	public String getREFERENCIA1() {
		return REFERENCIA1;
	}



	public void setREFERENCIA1(String rEFERENCIA1) {
		REFERENCIA1 = rEFERENCIA1;
	}



	public String getREFERENCIA2() {
		return REFERENCIA2;
	}



	public void setREFERENCIA2(String rEFERENCIA2) {
		REFERENCIA2 = rEFERENCIA2;
	}



	public Integer getEstado() {
		return estado;
	}



	public void setEstado(Integer estado) {
		this.estado = estado;
	}



	public Date getFecha_actualizado() {
		return fecha_actualizado;
	}



	public void setFecha_actualizado(Date fecha_actualizado) {
		this.fecha_actualizado = fecha_actualizado;
	}



	@Override
    public String toString() {
        return "RecursoWebVO [id_recurso_img=" + id_recurso_img + ", id_sesion=" 
        		+ id_sesion + ", Result=" + Result + ", Text=" + Text
                + ", URL=" + URL + ", REFERENCIA1=" + REFERENCIA1 
                + ", REFERENCIA2=" + REFERENCIA2 + ", estado=" 
                + estado +  ", fecha_actualizado=" + fecha_actualizado + "]";
    }	
}