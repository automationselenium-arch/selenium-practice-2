package org.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestNG2 extends TestNG1 {
    @Test
    public void Testcase1() {
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
        //driver.quit();
    }
    @Test
    public void Testcase2() {
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
        assertTrue(isLogoDisplayed);
        System.out.println("Logo Displayed properly");
        //driver.quit();
    }
    @Test
    public void Testcase3() {
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
        List<WebElement> items = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        assertTrue(items.size() >= 1, "Atleast one item is not displayed");
        assertTrue(items.size() == 6, "Number of items should be 6");
        //driver.quit();
    }
    @Test
    public void Testcase4() {
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
        List<String> expItemsnamelist = new ArrayList<String>();
        expItemsnamelist.add("Sauce Labs Backpack");
        expItemsnamelist.add("Sauce Labs Bike Light");
        expItemsnamelist.add("Sauce Labs Bolt T-Shirt");
        expItemsnamelist.add("Sauce Labs Fleece Jacket");
        expItemsnamelist.add("Sauce Labs Onesie");
        expItemsnamelist.add("Test.allTheThings() T-Shirt (Red)");
        List<String> actItemsnamelist = new ArrayList<String>();
        for (int i = 1; i <= 6; i++) {
            WebElement inventory_item = driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[" + i + "]"));
            String actualItem = inventory_item.getText();
            actItemsnamelist.add(actualItem);
        }
        Assert.assertEquals(actItemsnamelist, expItemsnamelist);
        //driver.quit();
    }
    @Test
    public void Testcase5() {
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
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
        String badge = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText();
        System.out.println("badge: " + badge);
        assertEquals(Integer.parseInt(badge), 1, "Shopping cart count is wrong");
        //driver.quit();
        //driver.findElement(By.xpath("//div[@id='cart_contents_container']"));
        // String name = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
        // System.out.println("name: "+name);
        // driver.findElement(By.xpath("//div[@class='inventory_item_desc']"));
        //driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
        //driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();
    }
    @Test
    public void TestcaseSuki() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.saucedemo.com/");
        WebElement usernameTxtb = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement passwordTxtb = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        usernameTxtb.sendKeys("standard_user");
        passwordTxtb.sendKeys("secret_sauce");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();
        /*String prodname = driver.findElement(By.xpath("//div[@class='inventory_item_name '][1]")).getText();
        System.out.println("prodname: " +prodname);
        String proddesc = driver.findElement(By.xpath("//div[@class='inventory_item_desc'][1]")).getText();
        System.out.println("proddesc: " +proddesc);
        String prodprice = driver.findElement(By.xpath("//div[@class='inventory_item_price'][1]")).getText();
        System.out.println("prodprice: " +prodprice);
        driver.findElement(By.xpath("//div[@class='inventory_item'][1]//button")).click();
        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
        String cartpname = driver.findElement(By.xpath("//div[@class='inventory_item_name'][1]")).getText();
        System.out.println("cartpname: " +cartpname);
        String cartpdesc = driver.findElement(By.xpath("//div[@class='inventory_item_desc'][1]")).getText();
        System.out.println("cartpdesc: " +cartpdesc);
        String cartpprice = driver.findElement(By.xpath("//div[@class='inventory_item_price'][1]")).getText();
        System.out.println("cartpprice: " +cartpprice);
        assertEquals(prodname , cartpname);*/
        HashMap<String, String> product = new HashMap<String, String>();
        String prodname = driver.findElement(By.xpath("//div[@class='inventory_item_name '][1]")).getText();
        System.out.println("prodname: " + prodname);
        product.put("prodname1", prodname);
        String proddesc = driver.findElement(By.xpath("//div[@class='inventory_item_desc'][1]")).getText();
        product.put("proddesc1", proddesc);
        String prodprice = driver.findElement(By.xpath("//div[@class='inventory_item_price'][1]")).getText();
        product.put("prodprice1", prodprice);
        driver.findElement(By.xpath("//div[@class='inventory_item'][1]//button")).click();
        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
        HashMap<String, String> cartproduct = new HashMap<String, String>();
        String cartpname = driver.findElement(By.xpath("//div[@class='inventory_item_name'][1]")).getText();
        cartproduct.put("cartpname1", cartpname);
        String cartpdesc = driver.findElement(By.xpath("//div[@class='inventory_item_desc'][1]")).getText();
        cartproduct.put("cartpdesc1", cartpdesc);
        String cartpprice = driver.findElement(By.xpath("//div[@class='inventory_item_price'][1]")).getText();
        cartproduct.put("cartpprice1", cartpprice);
        assertEquals(prodname, cartpname);
        assertEquals(proddesc, cartpdesc);
        assertEquals(prodprice, cartpprice);
        driver.quit();
    }
    @Test
    public void Testcasetwoprod() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.saucedemo.com/");
        WebElement usernameTxtb = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement passwordTxtb = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        usernameTxtb.sendKeys("standard_user");
        passwordTxtb.sendKeys("secret_sauce");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();
        HashMap<String, List<String>> menupage = new HashMap<String, List<String>>();
        List<String> name = new ArrayList<>();
        List<String> desc = new ArrayList<>();
        List<String> price = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            String pninmenupage = driver.findElement(By.xpath("//div[@class='inventory_item'][" + i + "]//div[@class='inventory_item_name ']")).getText();
            System.out.println("pninmenupage: " + pninmenupage);
            name.add(pninmenupage);
            menupage.put("pninmenupage", name);
            String pdinmenupage = driver.findElement(By.xpath("//div[@class='inventory_item'][" + i + "]//div[@class='inventory_item_desc']")).getText();
            System.out.println("pdinmenupage: " + pdinmenupage);
            desc.add(pdinmenupage);
            menupage.put("pdinmenupage", desc);
            String ppinmenupage = driver.findElement(By.xpath("//div[@class='inventory_item'][" + i + "]//div[@class='inventory_item_price']")).getText();
            System.out.println("ppinmenupage: " + ppinmenupage);
            price.add(ppinmenupage);
            menupage.put("ppinmenupage", price);
            driver.findElement(By.xpath("//div[@class='inventory_item'][" + i + "]//button")).click();
        }
        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
        List<String> namesc = new ArrayList<>();
        List<String> descsc = new ArrayList<>();
        List<String> pricesc = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            String pninsp = driver.findElement(By.xpath("//div[@class='cart_item'][" + i + "]//div[@class='inventory_item_name']")).getText();
            System.out.println("pninsp: " + pninsp);
            namesc.add(pninsp);
            menupage.put("pninsp", namesc);
            String pdinsp = driver.findElement(By.xpath("//div[@class='cart_item']["+ i +"]//div[@class='inventory_item_desc']")).getText();
            System.out.println("pdinsp: " + pdinsp);
            descsc.add(pdinsp);
            menupage.put("pdinsp", descsc);
            String ppinsp = driver.findElement(By.xpath("//div[@class='cart_item']["+ i +"]//div[@class='inventory_item_price']")).getText();
            System.out.println("ppinsp: " + ppinsp);
            pricesc.add(ppinsp);
            menupage.put("ppinsp", pricesc);
        }
            System.out.println("menupage: " + menupage);
            Assert.assertEquals(menupage.get("pninmenupage"), menupage.get("pninsp"));
            Assert.assertEquals(menupage.get("pdinmenupage"), menupage.get("pdinsp"));
            Assert.assertEquals(menupage.get("ppinmenupage"), menupage.get("ppinsp"));
            driver.quit();
    }
@Test
    public void Testcasecheckout() {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://www.saucedemo.com/");
    WebElement usernameTxtb = driver.findElement(By.xpath("//input[@placeholder='Username']"));
    WebElement passwordTxtb = driver.findElement(By.xpath("//input[@placeholder='Password']"));
    usernameTxtb.sendKeys("standard_user");
    passwordTxtb.sendKeys("secret_sauce");
    WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
    loginBtn.click();
    HashMap<String, List<String>> menupage = new HashMap<String, List<String>>();
    List<String> name = new ArrayList<>();
    List<String> desc = new ArrayList<>();
    List<String> price = new ArrayList<>();
    for (int i = 1; i <= 6; i++) {
        String pninmenupage = driver.findElement(By.xpath("//div[@class='inventory_item'][" + i + "]//div[@class='inventory_item_name ']")).getText();
        System.out.println("pninmenupage: " + pninmenupage);
        name.add(pninmenupage);
        menupage.put("pninmenupage", name);
        String pdinmenupage = driver.findElement(By.xpath("//div[@class='inventory_item'][" + i + "]//div[@class='inventory_item_desc']")).getText();
        System.out.println("pdinmenupage: " + pdinmenupage);
        desc.add(pdinmenupage);
        menupage.put("pdinmenupage", desc);
        String ppinmenupage = driver.findElement(By.xpath("//div[@class='inventory_item'][" + i + "]//div[@class='inventory_item_price']")).getText();
        System.out.println("ppinmenupage: " + ppinmenupage);
        price.add(ppinmenupage);
        menupage.put("ppinmenupage", price);
        driver.findElement(By.xpath("//div[@class='inventory_item'][" + i + "]//button")).click();
    }
    driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
    List<String> namesc = new ArrayList<>();
    List<String> descsc = new ArrayList<>();
    List<String> pricesc = new ArrayList<>();
    for (int i = 1; i <= 6; i++) {
        String pninsp = driver.findElement(By.xpath("//div[@class='cart_item'][" + i + "]//div[@class='inventory_item_name']")).getText();
        System.out.println("pninsp: " + pninsp);
        namesc.add(pninsp);
        menupage.put("pninsp", namesc);
        String pdinsp = driver.findElement(By.xpath("//div[@class='cart_item']["+ i +"]//div[@class='inventory_item_desc']")).getText();
        System.out.println("pdinsp: " + pdinsp);
        descsc.add(pdinsp);
        menupage.put("pdinsp", descsc);
        String ppinsp = driver.findElement(By.xpath("//div[@class='cart_item']["+ i +"]//div[@class='inventory_item_price']")).getText();
        System.out.println("ppinsp: " + ppinsp);
        pricesc.add(ppinsp);
        menupage.put("ppinsp", pricesc);
    }
    driver.findElement(By.xpath("//button[@id='checkout']")).click();
    WebElement firstnameTxtb = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
    WebElement lastnameTxtb = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
    WebElement postalTxtb = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
    firstnameTxtb.sendKeys("sukanya");
    lastnameTxtb.sendKeys("mittapalli");
    postalTxtb.sendKeys("SM2 5BE");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    String paylabel = driver.findElement(By.xpath("//div[@data-test='payment-info-label']")).getText();
    System.out.println("paylabel : " +paylabel);
    assertEquals("Payment Information:",paylabel);
    String infovalue = driver.findElement(By.xpath("//div[@data-test='payment-info-value']")).getText();
    System.out.println("infovalue:" +infovalue);
    assertEquals("SauceCard #31337" , infovalue);
    String infolabel = driver.findElement(By.xpath("//div[@data-test='shipping-info-label']")).getText();
    System.out.println("infolabel:" +infolabel);
    assertEquals("Shipping Information:" ,infolabel );
    String shipinfovalue = driver.findElement(By.xpath("//div[@data-test='shipping-info-value']")).getText();
    System.out.println("shipinfovalue:" +shipinfovalue);
    assertEquals("Free Pony Express Delivery!",shipinfovalue);
    String totalinfo = driver.findElement(By.xpath("//div[@data-test='total-info-label']")).getText();
    System.out.println("totalinfo:" +totalinfo);
    assertEquals("Price Total",totalinfo);
    String subtotal = driver.findElement(By.xpath("//div[@data-test='subtotal-label']")).getText();
    System.out.println("subtotal:" +subtotal);
    assertEquals("Item total: $129.94",subtotal);
    String tax = driver.findElement(By.xpath("//div[@data-test='tax-label']")).getText();
    System.out.println("tax:" +tax);
    assertEquals("Tax: $10.40",tax);
    String totallabel= driver.findElement(By.xpath("//div[@data-test='total-label']")).getText();
    System.out.println("totallabel : " +totallabel);
    assertEquals("Total: $140.34",totallabel);
    driver.findElement(By.xpath("//button[@id='finish']")).click();
    String header = driver.findElement(By.xpath("//h2[@data-test='complete-header']")).getText();
    System.out.println("header : " +header);
    assertEquals("Thank you for your order!", header);
    String text = driver.findElement(By.xpath("//div[@data-test='complete-text']")).getText();
    System.out.println("text:"+text);
    assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!",text);
    driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
    driver.quit();
}
    }




