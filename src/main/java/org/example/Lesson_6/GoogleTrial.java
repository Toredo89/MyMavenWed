package org.example.Lesson_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GoogleTrial extends AbstractPage {
    public GoogleTrial(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input.gLFyf.gsfi")
    private WebElement search;
    @FindBy(xpath = ".//input[@name='q']")
    private WebElement click;

    public GoogleTrial clicksearch(){
        search.click();
        return this;
    }

    public GoogleTrial click(){
        click.click();
        return this;
    }

    //public void clickWelcome(){
        //Actions actions = new Actions(getDriver());
        //actions.moveToElement(abit).click(subAbitList.get(0)).build().perform();
    //}
}
