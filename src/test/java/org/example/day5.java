package org.example;

import com.beust.jcommander.Parameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day5 {
    @Parameters({"URL", "Username"})
    @Test
    public void parametersExample(String URLName, String Username)
    {
        System.out.println("Value of the parameter is : "+URLName);
        System.out.println("Value of the second parameter is : "+Username);
    }

}
