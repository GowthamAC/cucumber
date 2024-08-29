package RestAssured;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class staleElement {

    @Test
    public void exception(){
//        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//textarea[@title='Search']")).click();
        List<WebElement> Options = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span"));

        for(WebElement option : Options){
            String textess = option.getText();
            System.out.println(textess);
            if(textess.equals("reddit status")){
                option.click();
            }
        }
    }
}
