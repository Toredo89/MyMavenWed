package org.example.Lesson_7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class EventListenerTest extends AbstractTest{

    //тест для создания скрина
    @Test
    void test(){
        try {
            getWebDriver().findElement(By.xpath("//*[@id=\"root\"]/section[2]"));
        } catch (NoSuchElementException e){
            MyUtils.makeScreenshot(getWebDriver(),
                    "failure- org.example.Lesson_7.MyShowTest.test" + System.currentTimeMillis() + ".png");
        }

    }


    @Test
    void GoogleTest(){
        WebElement webElement = getWebDriver().findElement(By.cssSelector("input.gLFyf.gsfi"));
        webElement.click();
    }
    @Test
    void GoogleTest1(){
        WebElement webElement = getWebDriver().findElement(By.xpath("//input[@name='q']"));
        webElement.click();
    }
    //тест провальный
    @Test
    void GoogleTest2(){
        WebElement webElement = getWebDriver().findElement(By.xpath("//*[@id=\"root\"]/section[2]"));
        webElement.click();
    }

}