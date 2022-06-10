package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandle());

        //getWindowHandle()   yazidirinca benzersiz olarak acilan window a ait hashcode'unu
        //verir.
        // CDwindow-0ED77C5B780BB4A9D8737E1333DC037E hash kodu cikiyor

    }
}
