package org.example;

import org.testng.annotations.*;

public class day3 {
   @BeforeSuite
   public void bfSuite()
   {
       System.out.println("This runs before suite");
   }

    @Test(groups = {"Smoke"})
    public void webLoginCarLoan()
    {
        System.out.println("Weblogin method CarLoan");
    }
    @Test
    public void mobileLoginCarLoan()
    {
        System.out.println("Mobile method CarLoan");
    }
    @Test
    public void APILoginCarLoan()
    {
        System.out.println("API method CarLoan");
    }
    @AfterSuite
    public void afSuite()
    {
        System.out.println("This runs after suite");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("This will run before each method in day3 class");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("This will run after each method in day3 class");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("↪️==This will run before day3 class==↪️");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("🏛️==This will run after day3 class==🏛️");
    }
}
