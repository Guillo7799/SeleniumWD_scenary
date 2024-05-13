package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
    public static void main(String[] args){
        //System.setProperty() mandar la ruta y el driver que necesito para usar google chrome.

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        driver.manage().window().maximize();

        //driver.close();

        //credentials
        String username = "standard_user";
        String password = "secret_sauce";

        //Locators
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        //WebElement loginBtn = driver.findElement(By.id("login-button"));

        //locator by CLASS
        //WebElement loginBtn = driver.findElement(By.className("submit-button"));

        //locator by name
        //WebElement loginBtn = driver.findElement(By.name("login-button"));

        //locator by xpath
        //WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));

        //locator by CSS Selector
        WebElement loginBtn = driver.findElement(By.cssSelector("input.submit-button"));

        //Login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }
}
