package org.example;

import org.testng.annotations.Test;

public class day1 {

    @Test
    //This is a TestNG annotation which considers below code as test. So even when you don't write public static void main, below method can be run via TestNG instead of Java.
    public void Demo()
    {
        //TestNG needs all test to be in a method.
        System.out.println("Hello world");
    }
    @Test
    public void Demo2()
    {
        System.out.println("Bye");
    }
}