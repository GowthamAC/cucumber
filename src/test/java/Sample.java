import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Sample
{
    @Test
    public void openBrowser()
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://www.makemytrip.com/");
        WebElement crossIcon = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
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

    }
}
