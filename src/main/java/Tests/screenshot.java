package Tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;

public class screenshot extends BaseClass{


    @Test
    public void screenshoTest() throws Exception  {
        brouserHelper.openURL("https://www.amazon.com/");
        this.takeSnapShot(driver,"C:\\Users\\Asus\\IdeaProjects\\untitled2\\src\\main\\resources\\test.png");


        // копируем ссылку  resources

    }
    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception{
//Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
        File DestFile=new File(fileWithPath);
//Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }
}
