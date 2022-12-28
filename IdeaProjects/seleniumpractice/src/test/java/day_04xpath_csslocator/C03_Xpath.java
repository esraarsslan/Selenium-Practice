package day_04xpath_csslocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin

        WebElement addButonu = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
         driver.findElement(By.xpath("//button[text()='addElement()']"));
        driver.findElement(By.xpath("//*[text()='addElement()']"));
        addButonu.click();
        //driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();// bir daha kullanmayacaksak bu sekilde de yazabiliriz....

        //3- Delete butonu’nun gorunur oldugunu test edin

        WebElement deleteButonu = driver.findElement(By.xpath("//Button [@class='added-manually']"));
        if (deleteButonu.isDisplayed()) {
            System.out.println("deleteButonu testi PASSED");
        } else{
            System.out.println("deleteButonu testi Failed");

        }
        //4- Delete tusuna basin

        deleteButonu.click();


        //5- Add/ Remove elements yazisinin gorunur oldugunu  test edin

        WebElement addRemoveElements = driver.findElement(By.xpath("//h3"));

        if (addRemoveElements.isDisplayed()) {
            System.out.println("addRemoveElements testi PASSED");
        } else{
            System.out.println("addRemoveElements testi Failed");

        }
        Thread.sleep(3000);
        driver.close();
    }
}
