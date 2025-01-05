package org.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestNG2 extends TestNG1 {
    WebDriver driver = new ChromeDriver();
    @Test
    public void Testcase1() {
        //WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximize the window
        driver.manage().deleteAllCookies();
        driver.get("https://www.saucedemo.com/");
        WebElement usernameTxtb = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement passwordTxtb = driver.findElement(By.xpath("//input[@placeholder='Password']"));

        usernameTxtb.sendKeys("standard_user");
        passwordTxtb.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();
    }

      @Test
    public void Testcase2(){
          //WebDriver driver = new ChromeDriver();
            WebElement logo = driver.findElement(By.xpath("//div[@class='app_logo']"));
            boolean isLogoDisplayed = logo.isDisplayed();
            Assert.assertTrue(isLogoDisplayed);
            System.out.println("Logo Displayed");
        }
        @Test
    public void Testcase3() {
        //WebDriver driver = new ChromeDriver();
        List<WebElement> items = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        Assert.assertTrue(items.size() >= 1, "Atleast one item is not displayed");
        Assert.assertTrue(items.size() == 6, "Number of items should be 6");
    }
@Test
    public void Testcase4() {
       // WebDriver driver = new ChromeDriver();
        List<String> expItemsnamelist = new ArrayList<String>();
        expItemsnamelist.add("Sauce Labs Backpack");
        expItemsnamelist.add("Sauce Labs Bike Light");
        expItemsnamelist.add("Sauce Labs Bolt T-Shirt");
        expItemsnamelist.add("Sauce Labs Fleece Jacket");
        expItemsnamelist.add("Sauce Labs Onesie");
        expItemsnamelist.add("Test.allTheThings() T-Shirt (Red)");

        List<String> actItemsnamelist = new ArrayList<String>();
        for (int i = 1; i <= 6 ; i++) {
            WebElement inventory_item = driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[" + i + "]"));
            String actualItem = inventory_item.getText();
            actItemsnamelist.add(actualItem);

        }

        Assert.assertEquals(actItemsnamelist,expItemsnamelist);
    }




}
