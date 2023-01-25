package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Etsy extends BaseClass{
    @Test
    public void test1 (){

        driver.navigate().to("https://www.etsy.com/");
        driver.findElement(By.xpath(".//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")).click();

      //  WebElement enableAfter = driver.findElement(By.id("join_neu_email_field"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("join-neu-overlay-title")));
    }

    @Test
    public void demo1(){

        brouserHelper.openURL("https://demoqa.com/text-box");
    }
}
