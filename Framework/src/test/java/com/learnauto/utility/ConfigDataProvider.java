package com.learnauto.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;

	public ConfigDataProvider() {
		
		// TODO Auto-generated constructor stub
		File src= new File("./Configuration/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
		} catch (IOException e) {
				// TODO Auto-generated catch block
			System.out.println("File Not FOund!");
				e.printStackTrace();
			}
		
		}
	
	public String getDataFromConfig(String keyToSearch) {
		return pro.getProperty(keyToSearch);
	}
	
	public String getBrowser() {
		return pro.getProperty("Browser");
	}
	
	public String getStagingUrl() {
		return pro.getProperty("qaURL");
	}

}
