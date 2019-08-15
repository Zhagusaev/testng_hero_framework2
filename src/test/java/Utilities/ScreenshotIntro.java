package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotIntro {
                                        //declare Exception
    public static void takeScreenshot()throws IOException {


                     //takes Screen shot from this driver                             //format as a file
        File src = ((TakesScreenshot)Driver.getDriver("chrome")).getScreenshotAs(OutputType.FILE);
        //copy File        from,  to
        FileUtils.copyFile(src,new File("src/test/java/Kayak/Kayak.com"+System.currentTimeMillis()+".png"));
    }

    @Test(timeOut = 3000)
    public void testToFall()throws InterruptedException{
        Driver.getDriver("chrome").get("https://www.facebook.com");
        Thread.sleep(5000);
    }

    @Test
    public void testToPass(){
        Driver.getDriver("chrome").get("https://www.expedia.com");

    }
    @AfterMethod
    public void tearDown(ITestResult result) throws IOException{
        if(result.getStatus()==ITestResult.FAILURE){
            takeScreenshot();
        }
    }

}
