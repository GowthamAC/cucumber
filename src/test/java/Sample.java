import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utility.Main;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

//@Listeners(utility.ListnerImpl.class)
public class Sample
{

    public WebDriver driver;
    @Test(retryAnalyzer = Main.class)
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://www.makemytrip.com/");
        WebElement crossIcon = null;

        try {
            crossIcon = driver.findElement(By.xpath("//span[@class='commonModalclose']"));
        }catch (Exception e){
            TakesScreenshot ts = (TakesScreenshot) driver;
            File srcFile = ts.getScreenshotAs(OutputType.FILE);
            File destFile  = new File("src/test/resources/Screanshot/screanshot1.png");

            try {
                FileUtils.copyFile(srcFile, destFile);

            } catch (IOException a) {
                System.out.println("Exception occured");
            }
        }

        wait.until(ExpectedConditions.visibilityOf(crossIcon));
        crossIcon.click();
        WebElement from = driver.findElement(By.xpath("//li[@data-cy='menu_Forex']"));
        from.click();
        String curr = "USD";
        WebElement currencyElement = driver.findElement(By.xpath("//p[text()='"+ curr +"']/span/following-sibling::span"));
        wait.until(ExpectedConditions.visibilityOf(currencyElement));
        String currency =currencyElement.getText();
        System.out.println(currency);
        driver.quit();

        new Scanner(System.in);
    }
}
