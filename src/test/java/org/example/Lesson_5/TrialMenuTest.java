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

public class TrialMenuTest extends AbstractTest {
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
        driver.get("https://trial-sport.ru/");
    }
    @Test
    void test() throws InterruptedException {
        WebElement webElement1 = driver.findElement(By.xpath(".//*[@id=\"asc\"]/div[1]/div/div[2]/div/span/span"));
        webElement1.click();
        Thread.sleep(1000l);
        WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"idLogForm\"]/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/div/input"));
        webElement2.sendKeys("toredo89@mail.ru");
        WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"idLogForm\"]/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/div/input"));
        webElement3.sendKeys("ruslan311");
        WebElement webElement5 = driver.findElement(By.xpath("//*[@id=\"asc\"]/div[1]/div/div[2]/a[2]/span"));
        webElement5.click();
        WebElement webElement6 = driver.findElement(By.xpath("//*[@id=\"frm\"]/div/table/tbody/tr[2]/td[4]/div/span"));
        webElement6.click();
        WebElement webElement7 = driver.findElement(By.xpath("//*[@id=\"frm\"]/div/table/tbody/tr[3]/td[4]/div/span"));
        webElement7.click();
    }
    @AfterAll
    static void close(){
        driver.quit();
    }
}
