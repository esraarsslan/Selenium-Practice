package day_03locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) {

/***
 * Class Work: Login Test
 * 1. Bir class oluşturun: LocatorsIntro
 * 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
 * a. http://a.testaddressbook.com adresine gidiniz.
 * b. Sign in butonuna basin
 * c. email textbox,password textbox, and signin button elementlerini locate ediniz..
 * d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
 * i. Username : testtechproed@gmail.com
 * ii. Password : Test1234!
 * e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
 * f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)
 * doğrulayin(verify).
 * 3. Sayfada kac tane link oldugunu bulun.
 */

        System.setProperty("webdriver.chrom.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // * a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");


        // * b. Sign in butonuna basin
        WebElement singInLinki = driver.findElement(By.linkText("Sing in"));
        singInLinki.click();



        // * c. email textbox,password textbox, and signin button elementlerini locate ediniz..

        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement  passwordextBox  = driver.findElement(By.name("session Password"));
        WebElement singInButonu =  driver.findElement(By.name("commit"));

        // * d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // * i. Username : testtechproed@gmail.com
        // * ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordextBox.sendKeys("Test1234!");
        singInButonu.click();


        // * e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualKullaniciAdi = driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullaniciAdi);// referansini yazdi. herkesinki farklidir..
        // Webelement web elementtir. Bir web elementin uzerinde ne yazdigini gormek istiyorsak;
      //  actualKullaniciAdi.getText(); kullaniriz.

        String expectedUserMail = "testtechproed@gmail.com ";
        if (expectedUserMail.equals(actualKullaniciAdi.getText())) {
            System.out.println("Expected kullanici testi PASSED");
        }else{
            System.out.println("Expected kullanici testi Failed");

        }

        // * f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)  doğrulayin(verify).

        WebElement adressElementi = driver.findElement(By.linkText("Addressses"));
        WebElement singOutElementi = driver.findElement(By.linkText("Sign out"));

        if (adressElementi.isDisplayed()){
            System.out.println("addresses testi PASSED");
        }else {
            System.out.println("addresses testi Failed");
        }
        if (singOutElementi.isDisplayed()){
            System.out.println("addresses testi PASSED");
        }else {
            System.out.println("addresses testi Failed");
        }

        // * 3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));

        System.out.println("Sayfadaki Link Sayisi" + linklerListesi);

        // LINKLERI YAZDIRALIM

        /****
         * Listemiz WEbElemntleerinden olustugu icin direkt yazdirirsak  referanslari yazdirir.
         * onun yerine; for-each loop yapip her bir link webelementinin uzerindeki yaziyi yazdirmaliyiz
         */

        for (WebElement each : linklerListesi){
            System.out.println(each.getText());
        }

        driver.close();
    }
}
