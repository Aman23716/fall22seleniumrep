package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Frames1 extends BaseClass{
    @Test
    public void test1(){
        driver.navigate().to("https://demoqa.com/frames");
        driver.switchTo().frame(2);




        WebElement simplText = driver.findElement(By.id("sampleHeading"));
        System.out.println(simplText.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(3);
        WebElement simplText1 = driver.findElement(By.id("sampleHeading"));
        System.out.println(simplText1.getText());
        driver.switchTo().defaultContent();
        WebElement Frametext = driver.findElement(By.xpath(".//div[@class='main-header']"));
        System.out.println(Frametext.getText());



    }
}
