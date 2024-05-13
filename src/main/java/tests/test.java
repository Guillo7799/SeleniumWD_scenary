package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    public static void main(String[] args){
        //System.setProperty("webdriver.chrome.driver","D:\\PERSONAL\\AUTOMATIZACIÓN\\SELENIUM WD COURSE\\Selenium-scenary\\src\\main\\resources\\drivers\\chromedriver.exe");

        //Initialize browser
        WebDriver driver = new ChromeDriver(); //Instancio

        //Open facebook
        driver.get("https://www.facebook.com");

        //Maximize browser

        driver.manage().window().maximize();
        //driver.close();

    }

}
