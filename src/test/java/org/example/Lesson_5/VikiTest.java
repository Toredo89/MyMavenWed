package org.example.Lesson_5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class VikiTest extends AbstractTest      {

    static WebDriver driver;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @BeforeEach
    void getPage() {
        driver.get("https://ru.wikipedia.org");
    }
    @Test
    void test() throws InterruptedException {
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
        webElement.sendKeys("Ту-204");
        Thread.sleep(1000l);
        WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"searchButton\"]"));
        webElement2.click();

    }
    @AfterAll
    static void close(){
        driver.quit();
    }
}

