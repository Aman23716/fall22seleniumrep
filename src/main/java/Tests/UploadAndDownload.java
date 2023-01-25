package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UploadAndDownload extends BaseClass{

    @Test
    public void test1(){
        driver.navigate().to("https://demoqa.com/upload-download");
        driver.findElement(By.id("uploadFile")).sendKeys("C:/Users/Asus/Pictures/Безымянный1.png");
        PausMeth.pause(3000);
    }
}
