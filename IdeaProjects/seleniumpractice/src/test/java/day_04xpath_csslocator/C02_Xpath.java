package day_04xpath_csslocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrom.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        <a class="a-link-normal" title="Philips HD9252/90 Airfryer Fritöz,
         Rapid Air Teknolojisi,%90&amp;#39;a Kadar Daha Az Yağlı Pişirme, Kızartma, Fırınlama, Izgara, Fırında Kızartma, Isıtma, 1400W, Siyah"
          href="/Philips-HD9252-90-AirFry-Frit%C3%B6z/dp/B08KGDS4CZ?ref_=Oct_DLandingS_D_5a20d464_60">
        <div class="a-section octopus-dlp-image-shield"></div>

     <img alt="Philips HD9252/90 Airfryer Fritöz, Rapid Air Teknolojisi,%90&amp;#39;a Kadar Daha Az Yağlı Pişirme, Kızartma, Fırınlama, Izgara, Fırında Kızartma, Isıtma, 1400W, Siyah"
     src="https://m.media-amazon.com/images/I/318bvGApmrL._AC_SR400,600_.jpg" class="octopus-dlp-asin-image" width="100%">


    </a>
         */
    }
}
