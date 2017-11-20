package com.grv.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.DatatypeConverter;

import com.grv.spring.security.mapper.MarkerVO;
import com.grv.spring.security.service.MarkerManager;

public class main {
	static MarkerManager manager;
	
	public static void main(String[] args) throws IOException {
		
		String nombreImg = "Nombre imagen";
		String desc		 = "Descripción de la imagen";
		  try {	
		File file = new File("C:/Users/ALI/AppData/LocalLow/Enox Software/MarkerLessARGRV/patternImg.jpg"); //asociamos el archivo fisico
		byte[] bFile = new byte[(int) file.length()];		
		
		URL url = new URL(
				"http://localhost:8890/SistemaGestionRecursosVirtuales/marker/"
				+ "create?id_sesion=1&nombre="+nombreImg+"&img_patternMat="+bFile+"&descripcion="+desc);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		/*if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}*/

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();

	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	  }
	}

}
