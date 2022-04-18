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

public class IviTest extends AbstractTest{

        static WebDriver driver;

        @BeforeAll
        static void init() {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
        @BeforeEach
        void getPage() {
            driver.get("https://www.ivi.ru");
        }
        @Test
        void test() throws InterruptedException {
            WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"root\"]/section[2]"));
            webElement1.click();
            WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"root\"]/section[4]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div[2]/ul/li[25]/label/div[1]"));
            webElement2.click();
            WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"root\"]/section[5]/div/div/div/div/ul/li[12]/a/div[1]/div/div[1]"));
            webElement3.click();
            WebElement webElement5 = driver.findElement(By.xpath("//*[@id=\"headerTop\"]/div/div/div/div/div[3]/div[2]/button/div"));
            webElement5.click();
            WebElement webElement6 = driver.findElement(By.xpath("//*[@id=\"search-root\"]/div/div[2]/div/div/section[1]/div/div/form/div"));
            webElement6.sendKeys("venom");
            WebElement webElement7 = driver.findElement(By.xpath("//*[@id=\"search-root\"]/div/div[2]/div/div/section[2]/div/div/div/div/div[2]/a/span[2]/span[1]/span"));
            webElement7.click();
            Thread.sleep(1000l);
        }
        @AfterAll
        static void close(){
            driver.quit();
        }
    }

