package br.com.fluxocompra.utils;

import org.openqa.selenium.WebDriver;

import br.com.fluxocompra.utils.DriverContext;

public class DriverContext {

	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
		
	}
	
	public static void  setDriver(WebDriver driver) {
		DriverContext.driver = driver;
	}
	
	
} 

