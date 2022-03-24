package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shredeshpande\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        frameAction(driver);
    }
    public static void frameAction(WebDriver driver) throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");

        driver.findElement(By.xpath("//a[text() = 'Frames']")).click();

        driver.findElement(By.xpath("//a[text() = 'Nested Frames']")).click();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement l = driver.findElement(By.cssSelector("body"));
        System.out.println(l.getText());
        driver.quit();
    }
}
