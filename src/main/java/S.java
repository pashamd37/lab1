import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class S {
    public static void main(String[] args) {

        String baseUrl = "https://www.myntra.com/";
        String driverPath = "C:\\Users\\mohammadp\\Desktop\\Drivers\\chromedriver.exe";
        String Webdriver = "webdriver.chrome.driver";

        System.setProperty(Webdriver, driverPath);
        WebDriver driver  = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.manage().window().maximize();
 driver.close();
    }

}

