import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
public class GmailExample {
    static WebDriver driver;
    public static void main(String[] arr) throws MalformedURLException
    {

        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName", "3100b1da8fc733a1");
        capabilities.setCapability("platformVersion", "8.1.0");
        capabilities.setCapability("platformName", "Android");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.findElement(By.id("com.google.android.gm:id/compose_button")).click();

        driver.quit();
    }
}