package day_04xpath_csslocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CssSelector {

    public static void main(String[] args) {

        /*
        1. Bir class oluşturun : Locators_css
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
b. Locate email textbox
c. Locate password textbox ve
d. Locate signin button
e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
i. Username : testtechproed@gmail.com
ii. Password : Test1234!
NOT: cssSelector kullanarak elementleri locate ediniz
         */
        System.setProperty("webdriver.chrom.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/");
        //b. Locate email textbox
        WebElement emailTextbox = driver.findElement(By.cssSelector("#session_email"));

        //c. Locate password textbox ve
        WebElement passwordTextbox = driver.findElement(By.cssSelector("#session_password"));
        //d. Locate signin button
        WebElement signTextbox = driver.findElement(By.cssSelector("input[value='sign in"));

        //e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın

        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        emailTextbox.sendKeys("testtechproed@gmail.com");
        passwordTextbox.sendKeys(" Test1234!");
        signTextbox.click();
    }
}
