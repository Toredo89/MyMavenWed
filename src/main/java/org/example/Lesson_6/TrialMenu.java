package org.example.Lesson_6;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrialMenu extends AbstractPage {
    public TrialMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id=\"asc\"]/div[1]/div/div[2]/div/span/span")
    private WebElement reg;

    @FindBy(xpath = "//*[@id=\"idLogForm\"]/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/div/input")
    private WebElement mail;

    @FindBy(xpath = "//*[@id=\"idLogForm\"]/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/div/input")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"idLogForm\"]/table/tbody/tr/td[1]/table/tbody/tr[5]/td[2]/div/div/input")
    private WebElement Войти;

    @FindBy(xpath = "//*[@id=\"asc\"]/div[1]/div/div[2]/a[2]/span")
    private WebElement корзина;


    public TrialMenu reg(){
        reg.click();
        return this;
    }

    public TrialMenu mail(){
        mail.click();
        return this;
    }

    public TrialMenu password(){
        password.click();
        return this;
    }

    public TrialMenu Войти(){
        Войти.click();
        return this;
    }

    public TrialMenu корзина(){
        корзина.click();
        return this;
    }
}
