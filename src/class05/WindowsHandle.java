package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AWnogHd4GHL1ZfT-FVOTgoMMbqSHxt0rF4QFA6Wry3YzUvqb9rKr_AHAKTn1aX4uR-KyI90cR09S0Q&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

                driver.findElement(By.xpath("//a[text()='Help']")).click();

        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        //get the window handle of parent window

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        Set<String>windowHandles=driver.getWindowHandles();
        for(String wh:windowHandles){
            driver.switchTo().window(wh);
           String title= driver.getTitle();
           if(title.equalsIgnoreCase("Google Account Help")){
               break;
           }
        }
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindowHandle);





    }
}