package com.blazedemo.webdrivermethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;
import com.blazedemo.blazedemo.applicationconstants.ApplicationConstants;
import com.blazedemo.browserconstants.BrowserFactory;


public class WebdriverMethods {
	
	public static By by;
	public WebElement webelement;
	public List<WebElement> listofWebelements;
	private static final String SCREENSHOT_FOLDER = "target/ScreenShots/";
	private static final String SCREENSHOT_FORMAT = ".png";
	HashMap<String, WebDriver> driverlist = new HashMap<String, WebDriver>();

	private String getCurrentThreadName() {
		try {
			return Thread.currentThread().getName().isEmpty() ? "default" : Thread.currentThread().getName();
		} catch (Exception e) {
			return "default";
		}
	}

	public void get(String ULR) {
		getcurrentDriver().get(ULR);

	}
	public WebDriver getcurrentDriver() {
		if (driverlist.get(getCurrentThreadName()) == null) {
			try {
				driverlist.put(getCurrentThreadName(),
						BrowserFactory.getbrowser(com.blazedemo.FileOperations.LoadProperties.DerivergetProperty(ApplicationConstants.BROWSER)));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return driverlist.get(getCurrentThreadName());
	}

	

	public static By getbyarrgument(String propertry) throws FileNotFoundException, IOException {
		String bylocator = com.blazedemo.FileOperations.LoadProperties.getbyproperty(propertry, "bytype");
		String byvalue = com.blazedemo.FileOperations.LoadProperties.getbyproperty(propertry, "byvalue");
		switch (bylocator.toUpperCase()) {
		case "ID":
			by = By.id(byvalue);
			break;
		case "NAME":
			by = By.name(byvalue);
			break;
		case "XPATH":
			by = By.xpath(byvalue);
			break;
		case "LINKTEXT":
			by = By.linkText(byvalue);
			break;
		case "PARTIALLINKTEXT":
			by = By.partialLinkText(byvalue);
			break;
		case "CLASSNAME":
			by = By.className(byvalue);
			break;
		case "CSS":
			by = By.cssSelector(byvalue);
			break;

		}
		return by;
	}

	

	public WebElement findElement(String property) {

		try {
			webelement = getcurrentDriver().findElement(getbyarrgument(property));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return webelement;
	}

	public WebElement findElement(By by) {

		try {
			webelement = getcurrentDriver().findElement(by);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return webelement;
	}

	public List<WebElement> findElements(String property) {
		try {
			listofWebelements = getcurrentDriver().findElements(getbyarrgument(property));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listofWebelements;

	}

	public void click(String property) {
		try {
			getcurrentDriver().findElement(getbyarrgument(property)).click();
		} catch (Exception e) {

		}
	}

	public void click(WebElement elm) {
		try {
			elm.click();
		} catch (Exception e) {

		}
	}

	

	public void sendkeys(String property, String inputvalue) {
		try {
			getcurrentDriver().findElement(getbyarrgument(property)).sendKeys(inputvalue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendkeys(String property, Keys inputvalue) {
		try {
			getcurrentDriver().findElement(getbyarrgument(property)).sendKeys(inputvalue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public String getSelectedValue(String property) throws FileNotFoundException, IOException {
		Select ddl = new Select(getcurrentDriver().findElement(getbyarrgument(property)));
		List<WebElement> lstELM = ddl.getAllSelectedOptions();
		// System.out.println(lstELM.get(0).getText());
		return lstELM.get(0).getText();
	}

	public String getwindowhandle() {
		String windowid = null;
		try {
			windowid = getcurrentDriver().getWindowHandle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return windowid;
	}

	public Set<String> getwindowhandles() {
		Set<String> windowids = null;
		try {
			windowids = getcurrentDriver().getWindowHandles();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return windowids;
	}

	public void quit() {
		try {
			getcurrentDriver().quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			getcurrentDriver().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	public String getText(String property) {
		try {
			return getcurrentDriver().findElement(getbyarrgument(property)).getAttribute("value");
		} catch (Exception e) {
			return null;
		}
	}

	

	public void implecitwait() {
		try {
			Thread.sleep(3000);
			getcurrentDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (InterruptedException e) {

		}
	}

	

	public void selectbyvisibletext(String property, String visibileText) {
		try {
			Select sel = new Select(getcurrentDriver().findElement(getbyarrgument(property)));
			sel.selectByVisibleText(visibileText);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	public void setScreenshot() {

		try {
			SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyy_hh_mm_ss");

			WebDriver returned = new Augmenter().augment(getcurrentDriver());
			if (returned != null) {
				File f = ((TakesScreenshot) returned).getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(f, new File(System.getProperty("user.dir") + "\\reports" + SCREENSHOT_FOLDER
							+ "_" + formater.format(Calendar.getInstance().getTime()) + SCREENSHOT_FORMAT));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (ScreenshotException se) {
			se.printStackTrace();
		}
	}

	

	
		
	
		
	   	
	   	
		
	   	
	   
	   	
	   	

}
