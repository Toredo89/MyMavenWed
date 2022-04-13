package org.example.Lesson_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class TrialMenu {
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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://trial-sport.ru/");


        WebElement webElement1 = driver.findElement(By.xpath(".//*[@id=\"asc\"]/div[1]/div/div[2]/div/span/span"));
        WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"idLogForm\"]/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/div/input"));
        WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"idLogForm\"]/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/div/input"));
        //WebElement webElement4 = driver.findElement(By.xpath("//*[@id=\"idLogForm\"]/table/tbody/tr/td[1]/table/tbody/tr[5]/td[2]/div/div/input"));
        WebElement webElement5 = driver.findElement(By.xpath("//*[@id=\"asc\"]/div[1]/div/div[2]/a[2]/span"));
        WebElement webElement6 = driver.findElement(By.xpath("//*[@id=\"frm\"]/div/table/tbody/tr[2]/td[4]/div/span"));
        WebElement webElement7 = driver.findElement(By.xpath("//*[@id=\"frm\"]/div/table/tbody/tr[3]/td[4]/div/span"));

        List<WebElement> webElements = driver.findElements(By.xpath("//*[@id=\"asc\"]/div[1]/div/div[2]/a[2]/span"));
        if(webElements.size()>1){
        }

        webElement1.click();
        webElement2.sendKeys("toredo89@mail.ru");
        webElement3.sendKeys("ruslan311");
        //webElement4.click();
        webElement5.click();
        webElement6.click();
        webElement7.click();


        Thread.sleep(100000l);
        driver.quit();
        driver.quit();
    }
}
