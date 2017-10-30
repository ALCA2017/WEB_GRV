package com.grv.spring.security.model;


public class AreasAcademicas {
	

	private Integer idAreaAcademica;
	
	private String nombreArea;
	
	private String nombreCortoArea;
	
	
    public AreasAcademicas(Integer idAreaAcademica, String nombreArea, String nombreCortoArea) {
		this.idAreaAcademica = idAreaAcademica;
		this.nombreArea 	 = nombreArea;
		this.nombreCortoArea = nombreCortoArea;
	}

	public AreasAcademicas() {
    }
	
	public Integer getIdAreaAcademica() {
		return idAreaAcademica;
	}

	public void setIdAreaAcademica(Integer idAreaAcademica) {
		this.idAreaAcademica = idAreaAcademica;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

	public String getNombreCortoArea() {
		return nombreCortoArea;
	}

	public void setNombreCortoArea(String nombreCortoArea) {
		this.nombreCortoArea = nombreCortoArea;
	}
    
    
}
