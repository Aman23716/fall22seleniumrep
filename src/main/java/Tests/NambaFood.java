package Tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NambaFood extends BaseClass{


   static Faker faker = new Faker();

    @Test
    public void testFirst(){
        driver.navigate().to("https://nambafood.kg/?language=ru");

        driver.findElement(By.id("registration--btn")).click();
        driver.findElement(By.xpath("(.//input[@id='sda_user_registration_form_email'])[1]")).sendKeys(mailru);
        driver.findElement(By.id("sda_user_registration_form_firstname")).sendKeys(name1);
        driver.findElement(By.id("sda_user_registration_form_lastname")).sendKeys(lastName);
        driver.findElement(By.xpath("(.//label)[6]")).click();
    }
    static String name1 = faker.name().fullName();
    static String mailru = faker.internet().emailAddress();
    static String password = faker.internet().password(10,15);
    static String lastName = faker.name().lastName();
}
