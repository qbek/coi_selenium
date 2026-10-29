import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserPuppeter {

    @Test
    public void browserHelloWorld() throws InterruptedException {
        var browser = new FirefoxDriver();
        browser.get("https://google.com");
        Thread.sleep(3000);
        browser.close();
    }
}
