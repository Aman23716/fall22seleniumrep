package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Exceptions11 extends BaseClass {
    //NoSuchElementException:

    @Test
    public void NoSuchElementExceptionTest() {
        brouserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.xpath("userName")).sendKeys("Hello World");

        //

    }

    @Test
    public void noSuchWindowException() {

        brouserHelper.openURL("https://demoqa.com/text-box");
        driver.switchTo().window("Hello");

    }

    @Test
    public void noSuchFrameException() {

        brouserHelper.openURL("https://demoqa.com/text-box");
        driver.switchTo().frame(123);
    }

    @Test
    public void noSuchAlertException() {

        brouserHelper.openURL("https://demoqa.com/text-box");
        alertHelper.acceptAlert();
    }

    @Test
    public void invalidSelectorException() {

        brouserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.xpath("//*[@type='button'[100]"));


    }
    @Test
    public void noSuchSessionException(){
        driver.quit();
        brouserHelper.openURL("https://demoqa.com/text-box");


    }
    @Test
    public void staleElementReferenceExeptionTest(){
        brouserHelper.openURL("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);
        List<WebElement> allBrands = driver.findElements(By.xpath("//div[@id='brandsRefinements']//ul/li/span/a"));
        int count = 0;
        for (WebElement e : allBrands) {
            count++;
            if (e.getText().contains("SAMSUNG")) {
                driver.findElement(By.xpath("(//div[@id='brandsRefinements']//ul/li/span/a/div/label/i)" + "[" + count + "]")).click();
//                break;
            }
        }}

    @Test
    public void timeOutExceptionTest (){

        brouserHelper.openURL("https://demoqa.com/dynamic-properties");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter"))).click();
    }
    @Test
    public void test234(){
        brouserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.id("submit")).sendKeys("hello");
    }

    @Test
    public void ElementNotInteractableException (){
        brouserHelper.openURL("https://demoqa.com/radio-button");
        driver.findElement(By.id("noRadio")).sendKeys("sggg");
    }
    @Test
    public void ElementClickInterceptedException(){
        brouserHelper.openURL("https://demoqa.com/radio-button");
        driver.findElement(By.id("noRadio")).click();
    }
}
