package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesSimple {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

       WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
        String table_data=table.getText();
       // System.out.println(table_data);


       List<WebElement> Rows= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
       for (WebElement row:Rows){


           String row_text=row.getText();

           if(row_text.contains("Google")){
          // System.out.println(row_text);
           }
       }

      List<WebElement>columns= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
       for (WebElement column:columns){
           //System.out.println(column.getText());
       }

       List<WebElement>first_columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
       for (WebElement first_col:first_columns){
            System.out.println(first_col.getText());
        }
    }
}
