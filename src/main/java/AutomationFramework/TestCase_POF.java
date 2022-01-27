package AutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestCase_POF {
    static WebDriver driver;
    @FindBy(xpath = "//span[text()='Войти']")
    static WebElement lnk_MyAccount;

    @FindBy(id = "log")

    static WebElement log;
    static WebElement pwd;
    static WebElement submit;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://market.yandex.ru/");
        PageFactory.initElements(driver,TestCase_POF.class);
        log.sendKeys("skdjf@ya.ru");
        pwd.sendKeys("ksjld");
        submit.click();
        driver.quit();
    }
}
