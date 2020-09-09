package com.blazedemo.blazedemo.allclassobjects;


import com.blazedemo.browserconstants.BrowserFactory;

public class AllPageObjects {
	
	public com.blazedemo.webdrivermethods.WebdriverMethods WebdriverMethods;
	public BrowserFactory browserFactory;
	

	public AllPageObjects() {
		WebdriverMethods = new com.blazedemo.webdrivermethods.WebdriverMethods();		
		browserFactory=new BrowserFactory();
		
		
	}

}
