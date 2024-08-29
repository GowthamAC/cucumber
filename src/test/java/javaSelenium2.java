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
        int n=5;
        int a=1;
    for(int i=1; i<n; i++){
    for(int j=i; j<=n; j++){
        if(a==4) {
            System.out.print(a);
            break;
        }else{
            System.out.print(a);
        }
    }
    a=a+1;
        System.out.println();
}

    }

    @Test
    public  void newCase(){

        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i==4){
                    System.out.print(i);
                    break;
                }else if(i==5){
                    break;
                }else if(i+j<=n-1){
                    System.out.print(i);
                }
            }
            System.out.println();
        }

    }
}
