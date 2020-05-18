package com.zerobank.stepdefinitions;

import com.zerobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp() {
        Driver.get ().manage ().timeouts ().implicitlyWait ( 5, TimeUnit.SECONDS );
        Driver.get ().manage ().window ().maximize ();
    }

    @After

    public void tearDown() {
        Driver.closeDriver();
    }
}


//    public void tearDown(Scenario scenario){
//        //if the scenario fails take the screenshot
//        if(scenario.isFailed()){
//            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
//            scenario.embed(screenshot,"image/png");
//        }
//        Driver.closeDriver();
//    }
//
//}