package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;



//Please correct the className
public class Automation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximize the window
        driver.manage().deleteAllCookies();
        driver.get("https://www.saucedemo.com/");
        WebElement usernameTxtb = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement passwordTxtb = driver.findElement(By.xpath("//input[@placeholder='Password']"));

        usernameTxtb.sendKeys("standard_user");
        passwordTxtb.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();


        WebElement logo = driver.findElement(By.xpath("//div[@class='app_logo']"));
        boolean isLogoDisplayed = logo.isDisplayed();
        Assert.assertTrue(isLogoDisplayed);

        List<WebElement> items = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        Assert.assertTrue(items.size() >= 1, "Atleast one item is not displayed");
        Assert.assertTrue(items.size() == 6, "Number of items should be 6");


        List<String> expItemsnamelist = new ArrayList<String>();
        expItemsnamelist.add("Sauce Labs Backpack");
        expItemsnamelist.add("Sauce Labs Bike Light");
        expItemsnamelist.add("Sauce Labs Bolt T-Shirt");
        expItemsnamelist.add("Sauce Labs Fleece Jacket");
        expItemsnamelist.add("Sauce Labs Onesie");
        expItemsnamelist.add("Test.allTheThings() T-Shirt (Red)");

        List<String> actItemsnamelist = new ArrayList<String>();
        for (int i = 1; i <= items.size(); i++) {
            WebElement inventory_item = driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[" + i + "]"));
            String actualItem = inventory_item.getText();
            actItemsnamelist.add(actualItem);

        }

        Assert.assertEquals(actItemsnamelist,expItemsnamelist);


    }

}


