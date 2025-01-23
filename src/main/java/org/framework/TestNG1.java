package org.framework;

import org.testng.annotations.*;

public class TestNG1 {
@BeforeSuite
    public void StartReporting(){
        System.out.println("Started Reporting........");
        System.out.println();
    }
    @AfterSuite
    public void StopReporting(){
        System.out.println("Stopped Reporting and generating report........");
    }


    @BeforeMethod
    public void launchBrowserApplication(){
        System.out.println( " is launched.....");
        System.out.println( " is launched.....");
    }
    @BeforeMethod(dependsOnMethods = {"launchBrowserApplication"})
    public void loginIntoApplication(){
        System.out.println("Application login Successful....");
    }
    @AfterMethod()
    public void logoutFromApplication(){
        System.out.println("Application logged out Successfully....");
    }
    @AfterMethod
    public void CloseBrowser(){
        System.out.println("Browser closed successfully....");
        System.out.println();
    }


}
