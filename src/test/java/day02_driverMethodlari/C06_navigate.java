package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
/*
    Eger testimiz sirasinda birden fazla sayfa arasinda ileri geri hareket edeceksek
    driver.get() yerine driver.navigate.to(); method'unu kullaniriz
    ve sonrasindan forward(), back() veya refresh() method'larini kullanabiliriz
 */
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        driver.navigate().back(); //onceki sayafaya gitmemizi sagliyor
        Thread.sleep(2000);

        driver.navigate().forward(); //onceki sayfaya geldikten sonra tekrar ileri sayafaya
        Thread.sleep(2000);     //gitmemizi sagliyor

        driver.navigate().refresh(); //sayfayi yeniliyor
        Thread.sleep(2000);

        driver.close();
    }
}
