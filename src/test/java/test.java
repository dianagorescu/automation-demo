import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class test {
    static WebDriver driver;
    @Given("User deschide browser")
    public void deschide_b() {
        System.setProperty("webdriver.edge.driver", "C:/Users/diana/Downloads/edgedriver_win64/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
//    @When("User navigheaza la google.com")
//    public void navigheaza_la_google() {
//        driver.get("https://www.google.com");
//    }
    @When("User navigheaza la emag.ro")
    public void deschide_emag() {
        driver.get("https://www.emag.ro");
    }
    @And("User cauta {string}")
    public void cauta_apple(String produs) {
        WebElement searchBoxEmag = driver.findElement(By.id("searchboxTrigger"));
        searchBoxEmag.sendKeys(produs);
        searchBoxEmag.submit();
    }
    @And("User bifeaza tipul de procesor {string}")
    public void bifeaza_tip_procesor(String procesor) {

        WebElement detail = driver.findElement(By.xpath("//a[@href='https://www.emag.ro/search/laptopuri/filter/tip-procesor-f7885,apple-m2-v31491/laptopuri+Apple/c?ref=lst_leftbar_7885_31491']"));
        detail.click();
        //driver.quit();
    }

    @Then("User primeste lista cu laptopuri Apple")
    public void verifica_lista_laptopuri_apple() {

        WebElement resultTitle = driver.findElement(By.cssSelector(".card-item .card-v2-title"));
        assert(resultTitle.getText().toLowerCase().contains("apple"));

        //driver.quit();
    }
    public static void main(String[] args){
        //TO DO
//        System.setProperty("webdriver.edge.driver", "C:/Users/diana/Downloads/edgedriver_win64/msedgedriver.exe");
//        driver = new EdgeDriver();
//
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.get("https://www.emag.ro");
//
//        WebElement searchBoxEmag = driver.findElement(By.id("searchboxTrigger"));
//        searchBoxEmag.sendKeys("laptopuri Apple");
//        searchBoxEmag.submit();
//
//        WebElement detail = driver.findElement(By.xpath("//a[@href='https://www.emag.ro/search/laptopuri/filter/tip-procesor-f7885,apple-m2-v31491/laptopuri+Apple/c?ref=lst_leftbar_7885_31491']"));
//        detail.click();
//
//        WebElement resultTitle = driver.findElement(By.cssSelector(".card-item .card-v2-title"));
//        assert(resultTitle.getText().toLowerCase().contains("apple"));
//
//        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
//
//        driver.quit();

    }
}
