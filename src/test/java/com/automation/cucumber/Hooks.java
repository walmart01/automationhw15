package com.automation.cucumber;

import com.automation.propertyreader.PropertyReader;
import com.automation.utility.Utility;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.junit.Before;

import java.io.IOException;

public class Hooks extends Utility{

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Hemal");
    }

    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            String screenshotPath= Utility.getScreenshot(driver, scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenshotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
