import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class data_Provider {

    @org.testng.annotations.DataProvider
    public Object[][] data(){
        Object[][] obj = new Object[2][2];
        obj[0][0]="abc";
        obj[0][1]=123;
        obj[1][0]="def";
        obj[1][1]=234;
        return obj;
    }

    @Test(dataProvider = "data")
    public void data_provider(String name, int phnNo){
        System.out.println(name+":"+phnNo);
    }

    @Test(enabled = false)
    public void Frames(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.findElement(By.xpath("//li[@class='active']/following-sibling::li/a[@class='analystic']")).click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,400)");
        WebElement insideFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html' and not(@id='singleframe')]"));
        driver.switchTo().frame(insideFrame);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("give input....");
    }
}
