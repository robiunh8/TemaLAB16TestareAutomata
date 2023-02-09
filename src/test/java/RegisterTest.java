import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    public void RegisterAccount() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("LIONEL");
        driver.findElement(By.id("lastname")).sendKeys("MESSI");
        driver.findElement(By.id("email_address")).sendKeys("dani.ban112@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("1ParolaPtTest1");
        driver.findElement(By.id("confirmation")).sendKeys("1ParolaPtTest1");
        driver.findElement(By.id("is_subscribed")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        Thread.sleep(3000);
        driver.close();

    }
}

