import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class luma {

    WebDriver driver;
    @Parameters("browser")
    @Test
    public void addTop(String browser){
        if(browser.equals("chrome")){
            driver = new ChromeDriver();
        } else if (browser.equals("edge")) {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://lumafashion.co.nz/");
        WebElement shop =driver.findElement(By.xpath("//ul[@id='main-nav']//a[normalize-space(text())='SHOP']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(shop).perform();
        WebElement tops = driver.findElement(By.xpath("//ul[@role='menu']//a[@href='/collections/tops']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        actions.scrollToElement(tops).moveToElement(tops).build().perform();
        driver.findElement(By.xpath("//ul[@role='menu']//a[text()='T-Shirts']")).click();
        WebElement t_shirt = driver.findElement(By.xpath("//div[@class='product-info']"));
        wait.until(ExpectedConditions.visibilityOf(t_shirt));
        t_shirt.click();

        int Size =10;
        WebElement size = driver.findElement(By.xpath("//input[@name='size' and @value='"+ Size +"']"));
        js.executeScript("window.scrollBy(0,700)");
        js.executeScript("arguments[0].click()", size);
//        actions.scrollToElement(size).click().build().perform();

        driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();

    }
}
