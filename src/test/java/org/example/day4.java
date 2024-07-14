package org.example;

import org.testng.annotations.Test;
public class day4 {
    @Test(groups = {"Smoke"})
    public void webLoginHomeLoan()
    {
        System.out.println("Weblogin method HomeLoan 🧪");
    }
    @Test(groups = {"Smoke"})
    public void webHomePageHomeLoan()
    {
        System.out.println("Weblogin home page method HomeLoan");
    }
    @Test(timeOut = 40000)
    public void webLogoutHomeLoan()
    {
        System.out.println("Weblogin logout method HomeLoan");
    }
    @Test
    public void mobileLoginHomeLoan()
    {
        System.out.println("Mobile login method HomeLoan");
    }
    @Test
    public void mobileHomepageHomeLoan()
    {
        System.out.println("Mobile Home page method HomeLoan");
    }
    @Test
    public void mobileLogoutHomeLoan()
    {
        System.out.println("Mobile method Logout HomeLoan");
    }
    @Test
    public void apiLoginHomeLoan()
    {
        System.out.println("API method HomeLoan");
    }
    @Test(dependsOnMethods = {"webLoginHomeLoan"})
    public void apiHomePageHomeLoan()
    {
        System.out.println("API home page method HomeLoan 🧪");
    }
    @Test(enabled = false)
    public void apiLogoutHomeLoan()
    {
        System.out.println("API logout method HomeLoan");
    }
}
