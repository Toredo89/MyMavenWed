package org.example.Lesson_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ivi extends AbstractPage {
    public Ivi(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/section[2]")
    private WebElement section;
    @FindBy(xpath = "//*[@id=\"root\"]/section[4]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div[2]/ul/li[25]/label/div[1]")
    private WebElement label;
    @FindBy(xpath = "//*[@id=\"root\"]/section[5]/div/div/div/div/ul/li[12]/a/div[1]/div/div[1]")
    private WebElement div;
    @FindBy(xpath = "//*[@id=\"headerTop\"]/div/div/div/div/div[3]/div[2]/button/div")
    private WebElement header;
    @FindBy(xpath = "//*[@id=\"search-root\"]/div/div[2]/div/div/section[1]/div/div/form/div")
    private WebElement search;
    @FindBy(xpath = "//*[@id=\"search-root\"]/div/div[2]/div/div/section[2]/div/div/div/div/div[2]/a/span[2]/span[1]/span")
    private WebElement root;


    public Ivi section(){
        section.click();
        return this;
    }

    public Ivi label(){
        label.click();
        return this;
    }
    public Ivi div() {
        div.click();
        return this;
    }
    public Ivi header() {
        header.click();
        return this;
    }
    public Ivi search() {
        search.click();
        return this;
    }
    public Ivi root() {
        root.click();
        return this;
    }
}
