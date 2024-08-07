package org.example;

import junit.framework.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day6 {
    @DataProvider
    public Object[][] dataProviderExample()
    {
        System.out.println("This is a data provider example");
        //We will define Object which is a multi dimensional array with 3 columns and 2 rows
        //                    Object[rows][columns]
        Object[][] data = new Object[3][2];
        //First set of username and password: (first row)
        data[0][0]="firstUsername";
        data[0][1]="firstPassword";

        //Second set of username and password: (Second row)
        data[1][0]="secondUsername";
        data[1][1]="secondPassword";

        //Third set of username and password: (Third row)
        data[2][0]="thirdUsername";
        data[2][1]="thirdPassword";

        return data;
    }

    @Test(dataProvider = "dataProviderExample")
    public void getDataProviderValues(String username, String password)
    {
        System.out.println("The username is: "+username +"and password is: "+password);
    }
    @Test(dataProvider = "dataProviderExample")
    public void getDataProviderValuesFailed(String username, String password)
    {
        System.out.println("The username is: "+username +"and password is: "+password);
        Assert.assertTrue(false);
    }

}
