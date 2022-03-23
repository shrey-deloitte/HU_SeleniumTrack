import static java.lang.Thread.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

    public static void main(String[] args) throws InterruptedException {
        String title="PHPTRAVELS";
        String title2;

        String url;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shredeshpande\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(" https://phptravels.com/demo");

        String parentwindow=driver.getWindowHandle();
        String a=driver.getTitle();
        if(a.contains(title)){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }

        driver.findElement(By.xpath("//a[text()='Login']")).click();
        title2= driver.getTitle();

        if(title2.contains(title)){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }

        sleep(9000);

        driver.switchTo().window(parentwindow);
        sleep(2000);

        url= driver.getCurrentUrl();
        System.out.println(url);

        driver.findElement(By.xpath("//a[text()='Pricing']")).click();
        sleep(3000);

        driver.navigate().back();
        sleep(3000);
        driver.navigate().refresh();

        driver.quit();

    }

}
