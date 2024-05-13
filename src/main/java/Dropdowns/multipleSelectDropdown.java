package Dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleSelectDropdown {

    public static void main(String[] args){

        String url = "https://demoqa.com/select-menu";

        WebDriver driver = new ChromeDriver();

        driver.get(url);

        driver.manage().window().maximize();

        //Declare the object of UI Select

        Select cars = new Select(driver.findElement(By.id("cars")));

        cars.selectByIndex(1);
        cars.selectByValue("opel");
        cars.selectByVisibleText("Audi");

        //Para quitar selecciones en un menú
        cars.deselectByVisibleText("Audi");

    }
}
