package Tests;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class demoHW extends BaseClass {


    static Faker faker = new Faker();

    @Test
    public void Glovo (){

        driver.get("https://glovoapp.com/kg/ru/?utm_source=google&utm_medium=cpc&utm_campaign=google_search_brandprotection_newusers_KG_Exact_digitalbudget_russian&utm_campaignid=12080853559&utm_adgroupid=114978107023&utm_term=glovo&utm_matchtype=e&utm_device=c&gclid=Cj0KCQiAn4SeBhCwARIsANeF9DKazT3w2HkxwRYnpMNXet-J7uH3nKKr0TjE000L5YkrV8ER8zPTNxUaAqztEALw_wcB");

        WebElement button = driver.findElement(By.xpath("(//button[@id='user-register'])[2]"));
        button.click();
        WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        firstName.sendKeys(name1);
        WebElement emailName = driver.findElement(By.xpath("//*[@id='signup-email']/div/input"));
        emailName.sendKeys(mailru);
        WebElement passwordName = driver.findElement(By.xpath("//input[@type='password']"));
        passwordName.sendKeys(password);
        WebElement clickButton = driver.findElement(By.xpath("//button[@id='signup-button']"));
        clickButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement button2 = driver.findElement(By.xpath("//*[@class='close-button']"));
        button2.click();
//
        WebElement button3 = driver.findElement(By.xpath("//*[@class='profile-icon header-action']"));
        button3.click();
//
//
        WebElement LastName = driver.findElement(By.xpath("(//*[@class='profile_text'])[1]"));
        LastName.getText();
//
        WebElement LastEmail = driver.findElement(By.xpath("(//*[@class='profile_text'])[2]"));
        LastEmail.getText();
//
        WebElement LastPassword = driver.findElement(By.xpath("(//*[@class='profile_text'])[3]"));
        LastPassword.getText();




        String actualName = LastName.getText();
        String actualEmail = LastEmail.getText();
//        String actualPassword = passwordName.getText();

//
//
//
        Assert.assertTrue(actualName.contains(name1));
        Assert.assertTrue(actualEmail.contains(mailru));
//        Assert.assertTrue(actualPassword.contains(password));
//


    }




    static String name1 = faker.name().fullName();
    static String mailru = faker.internet().emailAddress();
    static String password = faker.internet().password(10,15);



}
