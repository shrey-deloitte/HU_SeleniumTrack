package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragNDrop {

    public static void dragDrop(WebDriver driver){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\shredeshpande\\Downloads\\chromedriver.exe");

        driver.manage().window().maximize();;
        driver.get("https://jqueryui.com/droppable/");
        WebElement iframe  = driver.findElement(new By.ByClassName("demo-frame"));
        driver.switchTo().frame(iframe);
        WebElement From =driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement To =driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions act=new Actions(driver);
        act.dragAndDrop(From, To).build().perform();

        driver.quit();

    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shredeshpande\\Downloads\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();

        dragDrop(driver);
    }
}


