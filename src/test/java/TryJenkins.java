import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TryJenkins {

    public static String chromeDriverPath = "/usr/bin/chromedriver";

        @Test
        public void launchTest() {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            driver.quit();
        }
}
