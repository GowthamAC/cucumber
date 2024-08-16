package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.PageFormat;

public class BaseClass {

    public BaseClass(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "") WebElement UserName;

    public WebElement UserName(){
        return UserName;
    }

}
