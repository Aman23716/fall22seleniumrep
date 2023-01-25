package Tests;

import org.openqa.selenium.WebDriver;

import java.util.LinkedList;
import java.util.Set;

public class BrouserHelper {
    private WebDriver driver;

    public BrouserHelper(WebDriver driver){
        this.driver = driver;

    }

    public void openURL(String URL){
        driver.navigate().to(URL);
    }

    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
        driver.navigate().forward();
    }
    public void refreshThePage(){
        driver.navigate().refresh();
    }
    public Set<String> getWindowHandles(){
        return driver.getWindowHandles();
    }

    public void switchWindow(int index){
        LinkedList <String>windowsId = new LinkedList<String>(getWindowHandles());
        if (index <0 || index > windowsId.size() ){
            throw new IllegalArgumentException("Invalid index: " + index);
        }
        driver.switchTo().window(windowsId.get(index));
    }

    public void switchToParents(){
        LinkedList<String> windowsID = new LinkedList<>(getWindowHandles());
        driver.switchTo().window(windowsID.get(0));
    }




}
