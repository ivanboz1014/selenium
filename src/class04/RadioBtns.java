package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        WebElement maleBtn=driver.findElement(By.cssSelector("input[value='Male']"));

        boolean isEnabledMale=maleBtn.isEnabled();
        System.out.println("the radio btn male is enabled "+isEnabledMale);

        boolean isDisplayedMale=maleBtn.isDisplayed();
        System.out.println(isDisplayedMale);

       boolean isSelectedmale=maleBtn.isSelected();
        System.out.println(isSelectedmale);

        if(!isSelectedmale){
            maleBtn.click();

        }
         isSelectedmale=maleBtn.isSelected();
        System.out.println(isSelectedmale);







    }
}
