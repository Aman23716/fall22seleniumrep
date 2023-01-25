package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrouserDemo extends BaseClass{


    BrouserHelper brouserHelper = new BrouserHelper(driver);


    @Test
    public void test1(){

        brouserHelper.openURL("https://demoqa.com/browser-windows");

        WebElement newTab = driver.findElement(By.id("tabButton"));
        newTab.click();
        PausMeth.pause(5000);
        brouserHelper.switchWindow(0);
        PausMeth.pause(5000);

        brouserHelper.switchToParents();
        PausMeth.pause(3000);

    }
}
