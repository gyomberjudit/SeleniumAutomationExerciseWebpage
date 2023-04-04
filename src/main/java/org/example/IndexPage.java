package org.example;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IndexPage extends BasePage{

    private final By SEARCH_BOX = By.id("search_product");
    private final By SERACH_BUTTON = By.id("submit_search");
    private final By ITEM = By.xpath("//*[@class=\"features_items\"]/div[@class=\"col-sm-4\"]/div/div/div/p");

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    @Step("give search item")
    public void searchItem(String item) {
        driver.findElement(SEARCH_BOX).sendKeys(item);
    }

    @Step("search")
    public void clickSearchButton() {
        driver.findElement(SERACH_BUTTON).click();
    }

    @Step("return elements")
    public String[] listItems() {
        List<WebElement> items = driver.findElements(ITEM);

        String[] resultArray = new String[items.size()];

        int i=0;
        for (WebElement item : items) {
            //resultArray[i++] = item.getText();
            resultArray[i] = item.getText();
            i++;
        }
        return resultArray;
    }
}