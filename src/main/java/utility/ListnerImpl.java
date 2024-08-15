package utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ListnerImpl implements ITestListener {

    WebDriver driver;
    @Override
    public void onTestFailure(ITestResult result) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile  = new File(".src/test/resources/Screanshot/screanshot1.png");

        try {
            FileUtils.copyFile(srcFile, destFile);

        } catch (IOException e) {
            System.out.println("Exception occured");
        }

    }
}
