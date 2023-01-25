package Tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestImovingHW extends BaseClass{

   static Faker faker = new Faker();

    @Test
    public void firstTest(){

        driver.navigate().to("https://store.epicgames.com/ru/");
        driver.findElement(By.xpath("(.//a[@class='text-color-hover text-color-nonactive'])[16]")).click();
        PausMeth.pause(2000);
        driver.findElement(By.xpath(".//span[@class='MuiTypography-root sc-dmlqKv gKbqoA sc-jgHCSr lfvEBl MuiTypography-body2']")).click();
        PausMeth.pause(2000);
        driver.findElement(By.xpath("(.//span[@class='MuiTypography-root sc-eFuaqX hlqUFC MuiTypography-button MuiTypography-alignLeft'])[1]")).click();
        PausMeth.pause(2000);
        driver.findElement(By.xpath("(.//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu empty MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input'])[1]")).click();
        driver.findElement(By.xpath("(.//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button'])[12]")).click();
        driver.findElement(By.xpath("(.//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu empty MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input'])[2]")).click();

        driver.findElement(By.xpath(".//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button'][2]")).click();





        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert =driver.switchTo().alert();
        alert.sendKeys(mailru);
        alert.accept();



    }


    static String name1 = faker.name().fullName();
    static String mailru = faker.internet().emailAddress();
    static String password = faker.internet().password(10,15);
}
