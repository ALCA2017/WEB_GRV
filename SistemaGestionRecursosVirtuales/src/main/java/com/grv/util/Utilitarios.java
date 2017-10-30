package com.grv.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilitarios {
	
	
	 public String getFechaActual() {
		    Date ahora = new Date();
		    SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
		    return formateador.format(ahora);
		}		

}
