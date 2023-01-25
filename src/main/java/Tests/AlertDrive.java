package Tests;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertDrive extends BaseClass {


//    @Test
//    public void testAlert(){
//        driver.get("https://demoqa.com/alerts");
//
//        WebElement alertButt = driver.findElement(By.id("alertButton"));
//        alertButt.click();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        PausMeth.pause(3000);
//
//    }
//    @Test
//    public void testExplicitWaitAndAlert(){
//        driver.get("https://demoqa.com/alerts");
//        WebElement alertButton = driver.findElement(By.id("timerAlertButton"));
//        alertButton.click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//    }
//
//    @Test
//    public void testSelect(){
//        driver.get("https://demoqa.com/alerts");
//        WebElement alertButton = driver.findElement(By.id("confirmButton"));
//        alertButton.click();
//        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert = driver.switchTo().alert();
//        alert.dismiss();
//
//        Assert.assertEquals(driver.findElement(By.id("confirmResult")).getText(),"You selected Cancel");
//

//    }
    @Test
    public void testPromt (){
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("promtButton"));
        alertButton.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert =driver.switchTo().alert();

        alert.sendKeys("AmanPushka");
        alert.accept();

        Assert.assertEquals(driver.findElement(By.id("promptResult")).getText(),"You entered AmanPushka");
    }


}
