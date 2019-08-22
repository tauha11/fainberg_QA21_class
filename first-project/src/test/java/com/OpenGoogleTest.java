package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogleTest {
    WebDriver driver;
    @Test

    public void setUp()
    {
        driver = new ChromeDriver();
        driver.get("www.google.com");
        //driver.navigate().to;
    }
    driver.findElement(By.name("q")).sendKeys("java");
    Thread.sleep(7000);
    driver.quit();
}
