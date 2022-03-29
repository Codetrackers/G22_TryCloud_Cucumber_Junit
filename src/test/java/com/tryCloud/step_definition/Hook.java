package com.tryCloud.step_definition;

import com.tryCloud.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

public class Hook {


    @Before
    public void setupDriver(){
      //  System.out.println("THIS IS FROM @Before inside hooks class");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){
     //   System.out.println("THIS IS FROM @After inside hooks class");
        if(scenario.isFailed()){
            System.out.println(scenario.getName() + " isFailed() = " + scenario.isFailed());
        }
        Driver.closeDriver();
    }
}

