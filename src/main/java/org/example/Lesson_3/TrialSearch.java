package org.example.Lesson_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class TrialSearch {
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://trial-sport.ru/");


        WebElement webElement1 = driver.findElement(By.xpath(".//*[@id=\"asc\"]/div[1]/div/div[2]/div/span/span"));
        WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"idLogForm\"]/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/div/input"));
        WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"idLogForm\"]/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/div/input"));
        WebElement webElement4 = driver.findElement(By.xpath("//*[@id=\"idLogForm\"]/table/tbody/tr/td[1]/table/tbody/tr[5]/td[2]/div/div/input"));
        WebElement webElement5 = driver.findElement(By.xpath("//*[@id=\"asc\"]/div[2]/div/div/input"));
        WebElement webElement6 = driver.findElement(By.xpath("//*[@id=\"srchFrm\"]/div[2]/table[2]/tbody/tr/td[1]/div/div/input"));



        webElement1.click();
        webElement2.sendKeys("toredo89@mail.ru");
        webElement3.sendKeys("ruslan311");
        webElement4.click();
        webElement5.sendKeys("коньки фигурные");
        webElement6.click();


        Thread.sleep(10000l);
        driver.quit();
        driver.quit();
    }
}
