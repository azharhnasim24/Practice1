package com.generic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn {
	
	@SuppressWarnings("deprecation")
	public void getSignIn() throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		
		//Headless Browser/ Ghost Browser
		ChromeOptions headlessChrome = new ChromeOptions();
		headlessChrome.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(headlessChrome);
		
		//Implicit Exception
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		//Explicit Wait/ Webdriver Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getLoginBtn1()));
		mpf.getLoginBtn1().click();
		mpf.getEmailField().sendKeys("mahnhiyan@gmail.com");
		mpf.getPasswordField().sendKeys("mahnHiyan!123");
		mpf.getLoginBtn2().click();
		Thread.sleep(1500);
		mpf.getLogoutBtn().click();
	}

}
