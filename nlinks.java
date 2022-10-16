import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class nlinks
{ 
static String driverPath = "D:\\selenium pracs\\geckodriverv0.21.0win32\\GeckoDriver.exe";
 public static WebDriver driver;
public static void main(String args[])
{
 System.setProperty("webdriver.gecko.driver",driverPath);
DesiredCapabilities capabilities = DesiredCapabilities.firefox();
capabilities.setCapability("marionette",true);
driver= new FirefoxDriver(capabilities);
driver.get("http://toolsqa.wpengine.com/");
java.util.List<WebElement> items = driver.findElements(By.tagName("option"));
 System.out.println("Total items are"+items.size());
 for (int i = 0; i<items.size(); i=i+1)
{
System.out.println("Item "+ i + " Item name "+ items.get(i).getText());
}
}
}
