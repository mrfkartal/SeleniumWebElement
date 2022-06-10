package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_manageMethotlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
         System.out.println("pencere olculeri = " + driver.manage().window().getSize()); //pencere olculeri = (1050, 708)

         System.out.println("pencere konumu = " + driver.manage().window().getPosition());//pencere konumu = (10, 10)

        Thread.sleep(2000);

        //pencerenin konumunu ve buyukliguunu deistirelim
        driver.manage().window().setPosition(new Point(15,15));
        driver.manage().window().setSize(new Dimension(900,600));
        System.out.println(" yeni pencere olculeri = " + driver.manage().window().getSize());
        System.out.println(" yeni pencere konumu = " + driver.manage().window().getPosition());
        driver.close();
    }
}
