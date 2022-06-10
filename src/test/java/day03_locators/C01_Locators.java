package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazona gdip nutella aratalim

        driver.get("https://www.amazon.com");

        //findelement(By ..... locator) ===> istedigimiz web elementini bize dondururur
        //bizde o webelementini kullanmak icin bir objeye assign ederiz

       WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
       // WebElement aramaKutusu=driver.findElement(By.tagName("nav-searchbar nav-progressive-attribute"));

       /*
        WebElement aramaKutusu=driver.findElement(By.className("nav-search-field "));
        bu locator calismadi
        Locator alirken gozumuzden kacan detaylar olabilir
        aldigimiz bir locator calismazsa alternatif locatorlar denemeliyiz
        */

        //herhangi bir webelementine istedigimiz yaziyi yollamak istersek

        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);



    }

}
