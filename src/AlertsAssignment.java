package src;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsAssignment {
    public static void alertAction(WebDriver driver) throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com");
        System.out.println("website opened");
        driver.findElement(By.xpath("//a[text() = 'JavaScript Alerts']")).click();
        System.out.println("JavaScript Alerts clicked");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text() = 'Click for JS Prompt']")).click();
        System.out.println("Click for JS Prompt clicked");
        Alert javascriptAlert = driver.switchTo().alert();
        javascriptAlert.sendKeys("Test");
        String alertText = javascriptAlert.getText();
        System.out.println("input data :- " + alertText);
        javascriptAlert.accept();
        WebElement result = driver.findElement(By.xpath("//p[@id = 'result']"));
        String resultText = result.getText();
        if(resultText.contains(alertText)){
            System.out.println("Result is equal to input data");
        }else{
            System.out.println("Result is not equal to input data");
        }

    }

    public static void dragDropJS(WebDriver driver) throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com");
        System.out.println("website opened");
        driver.findElement(By.xpath("//a[text() = 'Drag and Drop']")).click();
        System.out.println("Drag and Drop clicked");
        Thread.sleep(2000);
        WebElement from =driver.findElement(By.xpath("//div[@id='column-a']"));
//
        WebElement to =driver.findElement(By.xpath("//div[@id='column-b']"));
//
        Actions actions = new Actions(driver);
        actions.clickAndHold(from).moveToElement(to).release(from).perform();
        System.out.println("Drag & Drop performed by using JavascriptExecutor");
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shredeshpande\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        alertAction(driver);
        dragDropJS(driver);

    }
}
