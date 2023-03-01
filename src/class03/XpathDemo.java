package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");


       WebElement username=driver.findElement(By.xpath("//input[contains(@name,'username')]"));

       username.sendKeys("Tester");

       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");

       username.clear();

       WebElement usernameText=driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());

        WebElement passwordText= driver.findElement(By.xpath("//label[text()='Password:']"));
        String passText=passwordText.getText();
        System.out.println(passText);



    }
}
