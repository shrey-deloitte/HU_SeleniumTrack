package src;

import org.openqa.selenium.*;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Goibibo {


       /* public static void takeScreenshot(String fileName) throws IOException, AWTException {
            BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

            ImageIO.write(image, "png", new File("C:\\Users\\shredeshpande\\Pictures\\Screenshorts\\"+fileName+".png"));

        }*/

    public static void main(String[] args) throws InterruptedException ,ElementClickInterceptedException{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\shredeshpande\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        WebElement element;

        driver.manage().window().maximize();

            driver.get("https://www.goibibo.com");
            System.out.println("website opened");
            Thread.sleep(2000);

            driver.findElement(By.xpath("//span[text() = 'Round-trip']")).click();
            System.out.println("Round trip clicked");
            Thread.sleep(2000);

            driver.findElement(By.xpath("//span[text() = 'From']")).click();
            driver.findElement(By.cssSelector("input[type*='text']")).sendKeys("New York");
            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.findElement(By.xpath("(//div[contains(@class,'sc-iAKWXU iyyKqe')]) ["+1+"]")).click();
            Thread.sleep(2000);
            System.out.println("From selected");

            driver.findElement(By.cssSelector("input[type*='text']")).sendKeys("Seattle");
            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.findElement(By.xpath("(//div[contains(@class,'sc-iAKWXU iyyKqe')]) ["+1+"]")).click();
            Thread.sleep(2000);

            System.out.println("To selected");


            Thread.sleep(2000);
            driver.findElement(By.cssSelector("span[class*='DayPicker-NavButton DayPicker-NavButton--next']")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("span[class*='DayPicker-NavButton DayPicker-NavButton--next']")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("span[class*='DayPicker-NavButton DayPicker-NavButton--next']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//p[text() = '24']")).click();
            System.out.println("Departure date  selected");
          //  driver.findElement(By.className("fswTrvl__done")).click();
        Thread.sleep(2000);
            driver.findElement(By.xpath("//span[contains(.,'Done')]")).click();
            Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(.,'Done')]")).click();
        Thread.sleep(2000);
            driver.findElement(By.xpath("//span[text() = 'Return']")).click();
            Thread.sleep(1000);

           // driver.findElement(By.cssSelector("span[class*='DayPicker-NavButton DayPicker-NavButton--next']")).click();
            //Thread.sleep(1000);
            driver.findElement(By.xpath("//p[text() = '8']")).click();
            System.out.println("Return date  selected");

            Thread.sleep(2000);

           // takeScreenshot("flight booking");

            System.out.println("Take Screenshot ");

            driver.findElement(By.xpath("//span[text() = 'Travellers & Class']")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//span[text() = 'SEARCH FLIGHTS']")).click();
            System.out.println("Search for flight");

            driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

            System.out.println("Cheapest flight :- "+ driver.findElement(By.xpath("(//div[contains(@class,'srp-card-uistyles__Price-sc-3flq99-17 gqEhhU alignItemsCenter dF fb lh1 padT5')]) ["+1+"]")).getText() );

            driver.findElement(By.xpath("(//button[contains(@class,'srp-card-uistyles__BookButton-sc-3flq99-21 bgObmb dF justifyCenter alignItemsCenter txtUpper')]) ["+1+"]")).click();
            System.out.println("Cheapest flight selected");
            Thread.sleep(2000);

            System.out.println("Booked");


        }




    }

