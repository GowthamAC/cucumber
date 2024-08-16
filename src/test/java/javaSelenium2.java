import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class javaSelenium2 {

    @Test
    public void Date_Selection1() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://www.makemytrip.com/");
        WebElement crossIcon = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
        wait.until(ExpectedConditions.visibilityOf(crossIcon));
        crossIcon.click();

        WebElement departure = driver.findElement(By.xpath("//label[@for='departure']"));
        wait.until(ExpectedConditions.visibilityOf(departure));
        departure.click();
        String Date="Mar 06 2025";
        for(;;){
            try{
                System.out.println("Trying for date");
                driver.findElement(By.xpath("//div[contains(@aria-label,'"+ Date +"')]")).click();
                break;
            }catch(Exception e){
                driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//                Thread.sleep(5000);
            }
        }


    }
}
