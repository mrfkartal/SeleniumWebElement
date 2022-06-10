package day01_seleniumProje;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {

        //en ilke haliyle bir otomasyon yapmak icin
        //classimiza otomasyon icin gerekli olan web driver in yerini gostermemiz
        //gerekir. Bunun icin java kutuphanesinden System.setProperty() methoodu
        //kullaniiriz.
        //method 2 parametre istemektedir.
        // ilki kulllanacagimiz driver: webdriver.chrome.driver
        //ikincisi ise bu driverin fiziki yolu :



        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        driver.get("https://www.techproeducation.com");


    }
}
