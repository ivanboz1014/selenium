package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioButtons2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

       List <WebElement> radioBtns=driver.findElements(By.xpath("//input[@name='ageGroup']"));
       for(WebElement radioBtn:radioBtns){
          String age=radioBtn.getAttribute("value");

           if(age.equalsIgnoreCase("5 - 15")){
               radioBtn.click();
           }
       }

    }
}
