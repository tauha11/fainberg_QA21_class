package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenGoogleTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }

    @Test
    public void searchJavaTest() throws InterruptedException {
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("java" + Keys.ENTER);
        Thread.sleep(7000);
    }
    @Test
    public void clickImFillingLuck()
    {
        new Actions(driver).moveToElement(driver.findElement(By.name("btnI"))).pause(2).click();
        driver.findElement(By.name("btnI")).click();

    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
