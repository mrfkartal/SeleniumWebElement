package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethdolar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.Driver", "resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        ilerde wait konusu daha genis olarak ele alacagiz
        bir sayfa acilirken ilk basta sayfanin icerine bulunan elemnentelere gore bir
        yuklenme suresine ihtiyac vardir


         */
    }
}
