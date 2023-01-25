package Tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SelectDemo extends BaseClass{



    static Faker faker = new Faker();

    @Test
    public void test1(){

        driver.navigate().to("https://demoqa.com/webtables");
        driver.findElement(By.id("addNewRecordButton")).click();

        WebElement addName=driver.findElement(By.id("firstName"));
        addName.sendKeys(name);
        WebElement addLast =driver.findElement(By.id("lastName"));
        addLast.sendKeys(lastname);
        WebElement addUser =driver.findElement(By.id("userEmail"));
        addUser.sendKeys(email);
       WebElement addAge= driver.findElement(By.id("age"));
       addAge.sendKeys("20");
        WebElement aadSalary =driver.findElement(By.id("salary"));
        aadSalary.sendKeys("132123");
        WebElement addDepart=driver.findElement(By.id("department"));
        addDepart.sendKeys(department);
        PausMeth.pause(3000);

        driver.findElement(By.id("submit")).click();
        PausMeth.pause(2000);






//        int t1 = 4;
//        int t2 = 7;
//        String [][] table = new String[t1][t2];
//        int count = 0 ;
//        for ( int i = 0; i < t1; i++){
//            for ( int j = 0; j < t2; j++){
//                count++;
//                table[i][j] = driver.findElement(By.xpath("(//div[@class='rt-td'])["+ count +"]")).getText();
//
//            }
//        }
//        System.out.println(Arrays.deepToString(table));
//
//
//        int r1 = 4;
//        int r2 = 7;
//        String [][] table1 = new String[r1][r2];
//        int count1 = 10 ;

//        int count1 = 21;
//        for (int i= 0; i<t2; i++){
//            count1++;
//            Assert.assertEquals();
//







    }
    static String name = faker.name().fullName();
    static String lastname = faker.name().lastName();
    static String email = faker.internet().emailAddress();
    static int age = faker.number().numberBetween(28,70);
    static int salary=faker.number().numberBetween(40,400000);
    static String department=faker.superhero().name();

}
