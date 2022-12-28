package day_04xpath_csslocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearh {

    public static void main(String[] args) {

        /*
        1. Bir class oluşturun AmazoneSearchTest
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
a.google web sayfasına gidin. https://www.amazon.com/
b. Search(ara) “city bike”
c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
d. “Shopping” e tıklayın.
e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
         */


//        //a.google web sayfasına gidin. https://www.amazon.com/
//        driver.get("https://www.amazon.com" );
//
//        //b. Search(ara) “city bike”
//        WebElement aramakutusu = driver.findElement(By.tagName("twotabsearchtextbox"));
//        aramakutusu.sendKeys("city bike"+ Keys.ENTER);
//
//        //c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın...
//        List<WebElement>istenenElementListesi = driver.findElements(By.className("sg-col-inner"));
//        WebElement sonucYazisiElementi= istenenElementListesi.get(0);
//        System.out.println(sonucYazisiElementi.getText());
//
//        //d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
//        List<WebElement> urunResimlerilist = driver.findElements(By.className("s-image"));
//        WebElement ilkUrunResmi= urunResimlerilist.get(0);
//        ilkUrunResmi.click();
    }
}
