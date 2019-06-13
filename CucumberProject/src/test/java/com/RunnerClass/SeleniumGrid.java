package com.RunnerClass;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {
	public static void main(String[] args) {
		DesiredCapabilities chrome=DesiredCapabilities.chrome();
		chrome.setPlatform(Platform.WIN10);
		chrome.setBrowserName("chrome");
		WebDriver driver= new RemoteWebDriver(new URL("http://192.168.43.153:4444/wd/hub"), chrome)
	}

}
