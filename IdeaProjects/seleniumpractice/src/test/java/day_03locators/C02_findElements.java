package day_03locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElements {
    public static void main(String[] args) {




        System.setProperty("webdriver.chrom.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //****SORU**** Amazon sayfasinda kac link bulubdugunu yazdir.
        driver.get("http://www.amazom.com");
        List<WebElement> linkListesi = driver.findElements(By.tagName("a"));
        System.out.println(linkListesi.size());//316
        driver.close();


    }
}