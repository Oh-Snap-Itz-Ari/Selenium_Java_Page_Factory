package TestMBS;

import PageMBS.Page_Factory_DemoQA_Text_Box;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextExecution1 {

    public static void main(String[] args) throws InterruptedException {

        Page_Factory_DemoQA_Text_Box PagHome =  new Page_Factory_DemoQA_Text_Box();

        // Inicialización del Driver
        WebDriver driver;

        // System.setProperty("webdriver.chrome.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/Volumes/Disco local 1/Mr. Blue Sky/Automatización/Drivers/chromedriver");

        driver = new ChromeDriver();

        driver.get("https://iqssdss2020.pythonanywhere.com/tutorial/form/search");
        driver.manage().window().maximize();

        // Uso de Objetos POM

        PagHome.StartDriver(driver);

        PagHome.WriteName("Alex Fabián Melo Gómez");
        Thread.sleep(2000);
        PagHome.SelectComboGrade("5");
        Thread.sleep(2000);
        PagHome.ClickPageSize(15);
        Thread.sleep(2000);
        PagHome.AcceptPrivacy();
        Thread.sleep(2000);
        PagHome.AcceptTerms();
        Thread.sleep(2000);
        PagHome.BtnSearch();
        Thread.sleep(2000);

        PagHome.CloseDriver();

    }
}
