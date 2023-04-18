package com.tests.Git_Project_For_Facebook_Login_Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
public static WebDriver driver;
	
	@BeforeTest
	public void InitialStep(){
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\LatestChromeDriverExe\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Launching Browser");
		
		}
	
	@Test
	public void doLogin(){
		System.out.println("Executing Login Test");
		driver.get("https://en-gb.facebook.com/");
		
		//driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		System.out.println("Entering Username");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("avadhutchougule26@gmail.com");
		
		System.out.println("Entering password");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("abcddef");
		
		System.out.println("Clicking on LogIn Button");
		driver.findElement(By.name("login")).click();
		
		System.out.println("Loginning into facebook account");
		System.out.println("Succesfully login");
		
		}
	
	@AfterTest
	public void CloseBrowser(){
	if (driver!=null)
		driver.close();
	}
	


}
