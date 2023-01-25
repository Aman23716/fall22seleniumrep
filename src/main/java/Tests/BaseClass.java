package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class  BaseClass {


    BrouserHelper brouserHelper ;
    WebDriver driver = new ChromeDriver();

    AlertHelper alertHelper;

    @BeforeClass
    public void abstrcl(){ WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        brouserHelper= new BrouserHelper(driver);
        alertHelper = new AlertHelper(driver);

    }


//    @AfterClass
//    public void abstr(){
//        driver.close();
//        driver.quit();
//    }


}
