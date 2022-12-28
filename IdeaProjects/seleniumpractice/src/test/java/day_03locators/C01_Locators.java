package day_03locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrom.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazona gidip nutella arat
        driver.get("http://www.amazom.com");

        // findlement ====Istedigimiz web elementini bie dondurur.
        // Biz de o web elementini kullanmak icin bir objeye assing(ATAMA) ederiz.
       // WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        WebElement aramaKutusu = driver.findElement(By.className("nav-search-field"));
        /***+   Bu locator calismadi
         * Locator alirken gozumuzden kacan detaylar olabilir.
         * Aldigimiz bir locator calismazsa alternatif locator'lar denemeliyiz.
         *
          */



        // HERHANGI BIR WEB ELEMENTINE ISTEDIGIMIZ YAZIYI YOLLAMAK ISTERSEK;
         //aramaKutusu.sendKeys("Nutella");

         // enter a baskam iicn de
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
}
