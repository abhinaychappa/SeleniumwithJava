package com.bms.BookMyShow;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestListener.class) 
public class BMSTest {
	private WebDriver driver;
	private HomePage homepage;
	private MovieHomePage moviehomepage;
	private ExtentTest test;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homepage=new HomePage(driver);
		moviehomepage=new MovieHomePage(driver);
		test = ExtentReportManager.createTest("BookMyShow Test");
	}
	
	@Test
	public void testBookTickets() {
		
		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//img[@alt='HYD']")).click();//selected hyderabad city(Lightbox)
	    homepage.selectMovie();
	    moviehomepage.clickBookTickets();
	    test.pass("Tickets booking flow completed successfully");
	}
	

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(7000);
		driver.close();
		ExtentReportManager.flushReports(); 
	}

}
