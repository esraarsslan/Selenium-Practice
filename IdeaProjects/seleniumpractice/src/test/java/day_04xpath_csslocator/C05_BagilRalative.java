package day_04xpath_csslocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C05_BagilRalative {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrom.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //https://www.diemol.com/selenium-4-demo/relative-locators-demo.html

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        WebElement bostunEl = driver.findElement(By.id("pid6_thumb"));
        WebElement saliorEl = driver.findElement(By.id("pid11_thumb"));
        WebElement mountieEl = driver.findElement(RelativeLocator.with(By.tagName("img")).below(bostunEl).toLeftOf(saliorEl));

        System.out.println(mountieEl.getAttribute("id"));//pid10_thumb
    }
}
