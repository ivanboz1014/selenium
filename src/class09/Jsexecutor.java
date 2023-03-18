package class09;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexecutor {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
        //goto amazon.com
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//        find the webEelment username
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

//        to highlight the username box

//        1. declare isntance
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        2.execute script
//        arguments[0].style.border='10px dotted pink'"    draw a box
        js.executeScript("arguments[0].style.border='5px dotted blue'", username);

        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));

        js.executeScript("arguments[0].click();",loginBtn);


    }}
