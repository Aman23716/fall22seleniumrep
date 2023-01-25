package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestImoving extends BaseClass{


    @Test
    public void testChooseing(){

        driver.get("https://www.imoving.com/");


        WebElement choose = driver.findElement(By.xpath("(.//button[@class='btn dropdown-toggle btn-default'])[1]"));
        choose.click();
        WebElement myAppart = driver.findElement(By.xpath(".//a[@class='1079']"));
        myAppart.click();
        WebElement choose2 = driver.findElement(By.xpath("(.//button[@class='btn dropdown-toggle btn-default'])[2]"));
        choose2.click();
        WebElement justAFew = driver.findElement(By.xpath("(.//a[@tabindex='0'])[4]"));
        justAFew.click();
        PausMeth.pause(3000);
        WebElement Compare = driver.findElement(By.xpath("(.//button[@type='submit'])[11]"));
        Compare.click();
        PausMeth.pause(3000);
        WebElement cont = driver.findElement(By.xpath(".//span[@class='col-sm-9 col-xs-12']"));
        cont.click();
        PausMeth.pause(2000);
        WebElement closeSpam =driver.findElement(By.xpath("(.//button[@class='icn-remove icn-close'])[1]"));
        closeSpam.click();
//        WebElement gotIt = driver.findElement(By.xpath("(.//a[@class='btn btn-blue'])[1]"));
//        gotIt.click();
        WebElement closeSpam2 = driver.findElement(By.xpath(".//a[@id='closeTutorial']"));
        closeSpam2.click();


        WebElement figure1 = driver.findElement(By.xpath("(.//figure)[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(figure1).perform();
        PausMeth.pause(2000);
        WebElement addInven = driver.findElement(By.xpath("(.//a[@class='btn btn-blue'])[1]"));
        addInven.click();
        WebElement figure2 = driver.findElement(By.xpath("(.//figure)[2]"));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(figure2).perform();
        PausMeth.pause(2000);
        WebElement addInven2 = driver.findElement(By.xpath("(.//a[@class='btn btn-blue'])[1]"));
        addInven2.click();
        WebElement figure3 = driver.findElement(By.xpath("(.//figure)[3]"));
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(figure3).perform();
        PausMeth.pause(2000);
        WebElement addInven3 = driver.findElement(By.xpath("(.//a[@class='btn btn-blue'])[1]"));
        addInven3.click();


        driver.findElement(By.xpath("(.//button[@class='quantity-plus'])[1]")).click();

        WebElement plusAdd2 = driver.findElement(By.xpath("(.//button[@class='quantity-plus'])[3]"));
        Actions actions2 = new Actions(driver);
        actions2.doubleClick(plusAdd2).perform();
        PausMeth.pause(2000);

        driver.findElement(By.xpath("(.//button[@class='quantity-plus'])[5]")).click();
        driver.findElement(By.xpath("(.//button[@class='quantity-plus'])[5]")).click();
        driver.findElement(By.xpath("(.//button[@class='quantity-plus'])[5]")).click();


        Assert.assertEquals(driver.findElement(By.xpath("(.//span[@class='col-sm-9 textBlock'])[1]")).getText(),"9 items");

         driver.findElement(By.xpath("(.//div[@class='arrowOpenRightNavigation leftArrowNavi'])[2]")).click();


         Assert.assertEquals(driver.findElement(By.xpath("(.//div[@class='showItemTypes blue-btn-select'])[1]")).getText(),driver.findElement(By.xpath("(.//h3[@class='itemType'])[1]")).getText());
         Assert.assertEquals(driver.findElement(By.xpath("(.//div[@class='showItemTypes blue-btn-select'])[2]")).getText(),driver.findElement(By.xpath("(.//h3[@class='itemType'])[3]")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("(.//div[@class='showItemTypes blue-btn-select'])[3]")).getText(),driver.findElement(By.xpath("(.//h3[@class='itemType'])[5]")).getText());

    }
}
