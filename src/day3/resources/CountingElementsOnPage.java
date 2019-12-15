package day3.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingElementsOnPage {
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/mohannaelhetawy/Desktop/Chromedriver/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get("file:/Users/mohannaelhetawy/Documents/selenium/working/src/day3/resources/form.html");
        WebElement text = driver.findElement( By.name( "text" ) );
    }
}
