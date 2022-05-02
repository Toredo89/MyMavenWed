package org.example.Lesson_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrialSport extends AbstractPage {
    public TrialSport(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id=\"asc\"]/div[1]/div/div[2]/div/span/span")
    private WebElement reg;
    @FindBy(xpath = "//*[@id=\"idLogForm\"]/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/div/input")
    private WebElement mail;
    @FindBy(xpath = "//*[@id=\"idLogForm\"]/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/div/input")
    private WebElement passwd;
    @FindBy(xpath = "//*[@id=\"idLogForm\"]/table/tbody/tr/td[1]/table/tbody/tr[5]/td[2]/div/div/input")
    private WebElement input;

    public TrialSport reg1() {
        reg.click();
        return this;
    }
    private TrialSport mail() {
        mail.click();
        return this;
    }
    private TrialSport passwd() {
        passwd.click();
        return this;
    }
    private TrialSport input() {
        input.click();
        return this;
    }
}