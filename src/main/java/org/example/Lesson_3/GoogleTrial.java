package org.example.Lesson_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class GoogleTrial {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver"
        );

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://google.com");

        WebElement webElement1 = driver.findElement(By.name("q"));
        WebElement webElement2 = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
        WebElement webElement3 = driver.findElement(By.xpath(".//input[@name='q']"));


        List<WebElement> webElements = driver.findElements(By.name("триал-спорт"));
        if (webElements.size() > 1) {
        }

        webElement1.click();
        webElement2.sendKeys("триал-спорт");

        driver.navigate().to("https://trial-sport.ru/");

        try {
            webElement3.sendKeys("триал-спорт");
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getSupportUrl());
        }

        Thread.sleep(1000l);
        driver.quit();
        driver.quit();

    }
}

