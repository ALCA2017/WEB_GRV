package com.grv.util;

import java.io.File;

public class util {

	public void openPdf(String fileAddress) {
		
		try {
			if ((new File(fileAddress)).exists()) {
				Process process = Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + fileAddress);
				process.waitFor();
			} else {
				System.out.println("File not found");
			}
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println(":: -----Exception---- ::\n" + e);
		}
	}

}
