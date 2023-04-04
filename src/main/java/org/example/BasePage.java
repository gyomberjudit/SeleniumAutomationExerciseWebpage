package org.example;

import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;
    String URL = "https://automationexercise.com/products";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.navigate().to(URL);
    }
}
