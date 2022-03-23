import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static java.lang.Thread.sleep;


public class HeadlessMode {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shredeshpande\\Downloads\\chromedriver.exe");

        WebDriver driver;
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");
        driver=new ChromeDriver(options);


        String title="PHPTRAVELS";
        String title2;
        String url;
        driver.manage().window().maximize();

        driver.get(" https://phptravels.com/demo");

        System.out.println("Page is opened");

        String parentwindow=driver.getWindowHandle();
        String a=driver.getTitle();
        if(a.equals(title)){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }

        driver.findElement(By.xpath("//a[text()='Login']")).click();
        System.out.println("Login clicked");

        title2= driver.getTitle();

        if(title2.equals(title)){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }

        sleep(9000);

        driver.switchTo().window(parentwindow);
        System.out.println("Window Switched");
        sleep(2000);


        url= driver.getCurrentUrl();
        System.out.println(url);

        driver.findElement(By.xpath("//a[text()='Pricing']")).click();
        System.out.println("Pricing Clicked");
        sleep(3000);

        driver.navigate().back();
        System.out.println("back");
        sleep(3000);
        driver.navigate().refresh();
        System.out.println("refresh");

        driver.quit();


    }

}
