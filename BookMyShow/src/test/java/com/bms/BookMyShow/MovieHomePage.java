package com.bms.BookMyShow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MovieHomePage {
    
    private WebDriver driver;
    private WebElement bookButton;
    
    public MovieHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBookTickets() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        bookButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'bGKFux')]")));
        bookButton.click();
    }
}
