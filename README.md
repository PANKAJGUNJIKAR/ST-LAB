package Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class pg10 {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver()
driver.manage().window().maximize();
// URL launch
driver.get("D:\\d.html");

// Identify list
Select items = new Select(driver.findElement(By.name("language")));
List<WebElement> mylist = items.getOptions();
System.out.println("Number of items = " + mylist.size());
driver.quit();
}
}