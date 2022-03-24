package src;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class Goibibo {

    public static void dropdown(WebDriver driver){
        driver.get("https://www.goibibo.com/");

        Select objselect= new Select(driver.findElement(By.xpath("//select[@id='gi_class']")));
        objselect.selectByVisibleText("Business");

    }

    public static void returnDropdown(WebDriver driver,WebElement element,String date) throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //js.executeScript("arguements[0].setAttribute('value','"+dateVal+"');",element);


    }
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shredeshpande\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.goibibo.com/");
        driver.findElement(By.xpath("//span[text()='Round-trip']")).click();
        sleep(3000);
       // driver.findElement(By.className("sc-bkkeKt gAqCbJ fswFld")).click();

        //dropdown(driver);
        //driver.findElement(By.className("sc-iJKOTD iipKRx fswWidgetPlaceholder")).cli
       // returnDropdown(driver);
        driver.quit();
    }
}
