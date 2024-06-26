package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElements {

   public static void main(String[] args){

       String url = "https://www.saucedemo.com";

       WebDriver driver = new ChromeDriver();

       driver.get(url);

       driver.manage().window().maximize();

       //Credentials

       String username = "standard_user";
       String password = "secret_sauce";

       //
       List<WebElement> inputs = driver.findElements(By.tagName("input"));
       System.out.println("Cuántos elementos hemos encontrado? "+ inputs.size());

       for(int i = 0; i< inputs.size(); i++){
           if(i==0){
               inputs.get(i).sendKeys(username);
           } else if (i==1) {
               inputs.get(i).sendKeys(password);
           }
           else{
               inputs.get(i).click();
           }
       }


   }


}
