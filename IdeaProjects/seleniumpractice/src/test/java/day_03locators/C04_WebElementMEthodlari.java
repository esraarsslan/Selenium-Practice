package day_03locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMEthodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrom.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        /***
         * 1- amazon.com'a gidip arama kutusunu locate edin.
         * 2- Arama kutusunun tagname'ini input oldugunu test edin.
         * 3- Arama Kutusunun name attirubute degerinin field-keywords oldugunu test edin.
         */

        //1- amazon.com'a gidip arama kutusunu locate edin.

        driver.get("http://www.amazom.com");
       WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


       //* 2- Arama kutusunun tagname'ini input oldugunu test edin.

        String expectedTagNAme= "input";
        String actualTagName= aramaKutusu.getTagName();

        if (expectedTagNAme.equals(actualTagName)) {
            System.out.println(" Tagname testi Passed");
        }else {
            System.out.println(" Tagname testi Failed");
        }
        //  * 3- Arama Kutusunun "name" attirubute degerinin field-keywords oldugunu test edin.
        String expectedName= "`field-keywords";

        String actualNAme = aramaKutusu.getAttribute("name");
        if (expectedName.equals(actualNAme)){
            System.out.println(" name testi Passed");
        }else{
            System.out.println(" name testi Failed");
        }
        driver.close();
    }
}

