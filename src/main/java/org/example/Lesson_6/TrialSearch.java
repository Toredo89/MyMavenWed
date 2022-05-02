package org.example.Lesson_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrialSearch extends AbstractPage {
    public TrialSearch(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"asc\"]/div[2]/div/div/input")
    private WebElement input;
    @FindBy(xpath = "//*[@id=\"srchFrm\"]/div[2]/table[2]/tbody/tr/td[1]/div/div/input")
    private WebElement find;

    public TrialSearch input() {
        input.click();
        return this;
    }
    private TrialSearch find() {
        input.click();
        return this;
    }
}
