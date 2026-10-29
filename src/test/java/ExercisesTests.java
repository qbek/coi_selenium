import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.openqa.selenium.By.cssSelector;

public class ExercisesTests {

    WebDriver browser;

    @BeforeEach
    public void setup() {
        browser = new FirefoxDriver();
    }

    @AfterEach
    public void cleanup() {
//        browser.close();

        browser.quit();
    }

    @Test
    public void exercise_1() throws InterruptedException {
        browser.get("https://qbek.github.io/selenium-exercises/pl/basic_form.html");

        var firstName = browser.findElement(cssSelector("#firstname"));
        firstName.sendKeys("Kuba");
        firstName.sendKeys(Keys.TAB);

        var lastname = browser.findElement(cssSelector(":focus"));
        lastname.sendKeys("Szewc");
        lastname.sendKeys(Keys.TAB);

        var email = browser.findElement(cssSelector(":focus"));
        email.sendKeys("2p@2p.pl");
        email.sendKeys(Keys.TAB);

        var saveBtn = browser.findElement(cssSelector(":focus"));
        saveBtn.click();



        //KLASYCZNE PODEJŚCIE
//        WebElement firstName = browser.findElement(cssSelector("#firstname"));
//        firstName.sendKeys("Kuba");
//
//        WebElement lastName = browser.findElement(cssSelector("#lastname"));
//        lastName.sendKeys("Szewc");
//
//        WebElement emailInput = browser.findElement(cssSelector("#email"));
//        emailInput.sendKeys("2p@2p.pl");
//
//        WebElement saveBtn = browser.findElement(cssSelector(".btn-success"));
//        saveBtn.click();

        WebElement firstNameChk = browser.findElement(cssSelector("#firstname-check"));
        assertThat("Name was correctly copied", firstNameChk.getText(), equalTo("Kuba"));

        WebElement lastNameChk = browser.findElement(cssSelector("#lastname-check"));
        assertThat("Surname was correctly copied", lastNameChk.getText(), equalTo("Szewc"));

        WebElement emailChk = browser.findElement(cssSelector(".form-control-plaintext"));
        assertThat("Email correctly copied", emailChk.getAttribute("value"), equalTo("2p@2p.pl"));

        Thread.sleep(3000);
    }

    @Test
    public void exercise_2() {
        browser.get("https://qbek.github.io/selenium-exercises/pl/check_boxes.html");

        var redCheckBox = browser.findElement(cssSelector("[name=\"red\"]"));
        redCheckBox.click();
        // anty pattern - nie sprawdzamy checkboxow po kliknieciu
//        assertThat("Checkbox is selected", redCheckBox.isSelected(), equalTo(true));

        var blueCheckBox = browser.findElement(cssSelector("[name=\"blue\"]"));
        blueCheckBox.click();
        var light = browser.findElement(cssSelector("#light"));
        assertThat("Light is pink", light.getAttribute("data-color"), equalTo("#FF00FF111"));
    }

    @Test
    public void exercise_2b() {
        browser.get("https://qbek.github.io/selenium-exercises/pl/check_boxes.html");

        var text = browser.findElement(cssSelector("#text"));
        assertThat("Comments are disabled", text.isEnabled(), equalTo(false));

        var switchCheck = browser.findElement(cssSelector(".custom-control-label"));
        switchCheck.click();
        assertThat("Comments are enabled", text.isEnabled(), equalTo(true));
    }

    @Test
    public void exercise_3() throws InterruptedException {
        browser.get("https://qbek.github.io/selenium-exercises/pl/radio_buttons.html");
        var radio = browser.findElement(cssSelector("[value=\"radiozet\"]"));
        radio.click();
        var radioPageLink = browser.findElement(cssSelector("#radiozet-details a"));
        assertThat("Link is correct", radioPageLink.getAttribute("href"), equalTo("https://www.radiozet.pl/"));
        assertThat("Link is visible", radioPageLink.isDisplayed(), equalTo(true));
    }
}
