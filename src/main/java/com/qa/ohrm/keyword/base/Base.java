package com.qa.ohrm.keyword.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	public WebDriver driver;
	public Properties prop;

	public WebDriver init_driver(String browserName) {

		if (browserName.equals("chrome")) {
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath + "drivers/chromedriver/chromedriver.exe");

			if (prop.getProperty("headless").equals("yes")) {
				// headless mode:
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headlesss");
				driver = new ChromeDriver(options);
			} else {
				driver = new ChromeDriver();
			}
		}
		return driver;
	}

	public Properties init_properties() {
		prop = new Properties();

		try {
			FileInputStream ip = new FileInputStream("C:/Users/rahul/eclipse-workspace/KeywordDriverOrange/src/main/java/com/qa/ohrm/keywork/config/config.properties");
			prop.load(ip);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
