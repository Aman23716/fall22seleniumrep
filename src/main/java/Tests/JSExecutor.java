package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutor extends BaseClass{

    @Test
    public void test1(){
        brouserHelper.openURL("https://www.etsy.com/");
        WebElement careers =driver.findElement(By.xpath("//a[@href='https://www.etsy.com/careers?ref=ftr']"));
        PausMeth.jsClick(driver, careers);
        PausMeth.pause(10000);
        PausMeth.jsScrollDownThePage(driver, "350");
        PausMeth.pause(5000);
        PausMeth.jsScrollDownThePage(driver, "500");
        PausMeth.pause(5000);
    }
}
