package com.blazedemo.FileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class LoadProperties {
	public static By by;
	static Properties pro=null;

	public static Properties loadproperties() {
		if (pro == null) {
			try {
				pro = new Properties();
				File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\ResourceLocators\\");
				File[] file = f.listFiles();
				for (int i = 0; i < file.length; i++) {
					pro.load(new FileInputStream(file[i]));
				}
			} catch (Exception e) {
				return null;
			}
		}
		return pro;
	}
	public static String DerivergetProperty(String prop)
	{		
		pro=loadproperties();
		return pro.getProperty(prop);
	}

	public static String getbyproperty(String prop,String bystring) {
		String property = null;
		pro = loadproperties();
		if (bystring.equalsIgnoreCase("bytype")) {
			property = pro.getProperty(prop).split(";")[0];
		} else {
			property = pro.getProperty(prop).split(";")[1];
		}
		return property;
	}

}
