package org.example.Lesson_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Viki extends AbstractPage{
    public Viki(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"searchInput\"]")
    private WebElement search;
    @FindBy(xpath = "//*[@id=\"searchButton\"]")
    private WebElement button;


    public Viki search() {
        search.click();
        return this;
    }
    private Viki button() {
        button.click();
        return this;
    }
}

