package org.example;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
    @Test
    public void personalLoan()
    {
        System.out.println("Personal loan");

    }

    @BeforeTest
    public void prerequisites()
    {
        System.out.println("This will be executed first");
    }
}
