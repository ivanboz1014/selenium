package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesDemo {
    public static void main(String[] args) {
// **
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
// **
                WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath(" //input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        WebElement PimBtn =  driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
        PimBtn.click();

        List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (int i = 0; i < ids.size(); i++) {
            String id = ids.get(i).getText();

            if (id.equalsIgnoreCase("52396A")) {
                System.out.println("ID is on the row "+i);
                // Next lines are our logic to click on the particular checkBox.
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]"));
                checkBox.click();
            }
        }
    }
}