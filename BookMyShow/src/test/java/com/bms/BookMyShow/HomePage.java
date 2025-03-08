package com.bms.BookMyShow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriver driver;
	private WebElement movieName;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void selectMovie() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		movieName=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Return of the Dragon']")));
		movieName.click();
	}

}
