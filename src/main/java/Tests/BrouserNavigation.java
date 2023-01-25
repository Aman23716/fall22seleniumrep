package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrouserNavigation extends  BaseClass {

    @Test
    public void test1(){
        driver.navigate().to("https://www.imoving.com/");
        WebElement houseMenu = driver.findElement(By.id("houseTypeSelectList"));
        Select select = new Select(houseMenu);
        select.selectByVisibleText("My Apartment");
        PausMeth.pause(3000);

        WebElement moveSizeMenu = driver.findElement(By.id("hp-nav-select-house"));
        Select select2 = new Select(moveSizeMenu);
        select2.selectByVisibleText("Just a few Items");
      PausMeth.pause(3000);

        WebElement clickQuotes = driver.findElement(By.xpath("//button[@class='btn btn-white quickQuoteLink']"));
        clickQuotes.click();
        PausMeth.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.imoving.com/full-inventory/#!/");
        driver.navigate().back();
        PausMeth.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.imoving.com/");
        driver.navigate().refresh();
        PausMeth.pause(3000);
        driver.navigate().forward();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.imoving.com/full-inventory/#!/");



    }

}
