package com.grv.spring.security.model;

public class UnidadDidactica {

	private Integer IdUnidadDidactica;
	
	private Integer NroUnidad;
	
	private String TituloUnidad;
	
	private Integer Estado;
	
	private String FechaActualizado;

	public UnidadDidactica() {
		super();
	}

	public UnidadDidactica(Integer idUnidadDidactica, Integer nroUnidad, String tituloUnidad, Integer estado,
			String fechaActualizado) {
		super();
		IdUnidadDidactica = idUnidadDidactica;
		NroUnidad = nroUnidad;
		TituloUnidad = tituloUnidad;
		Estado = estado;
		FechaActualizado = fechaActualizado;
	}

	public Integer getIdUnidadDidactica() {
		return IdUnidadDidactica;
	}

	public void setIdUnidadDidactica(Integer idUnidadDidactica) {
		IdUnidadDidactica = idUnidadDidactica;
	}

	public Integer getNroUnidad() {
		return NroUnidad;
	}

	public void setNroUnidad(Integer nroUnidad) {
		NroUnidad = nroUnidad;
	}

	public String getTituloUnidad() {
		return TituloUnidad;
	}

	public void setTituloUnidad(String tituloUnidad) {
		TituloUnidad = tituloUnidad;
	}

	public Integer getEstado() {
		return Estado;
	}

	public void setEstado(Integer estado) {
		Estado = estado;
	}

	public String getFechaActualizado() {
		return FechaActualizado;
	}

	public void setFechaActualizado(String fechaActualizado) {
		FechaActualizado = fechaActualizado;
	}
	
	
}
