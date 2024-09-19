import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class test {
    static WebDriver driver;
    @Given("User deschide browser")
    public void deschide_b() {
        System.setProperty("webdriver.edge.driver", "C:/Users/diana/Downloads/edgedriver_win64/msedgedriver.exe");
        driver = new EdgeDriver();
    }
    @When("User cauta \"emag.ro\"")
    public void deschide_emag() {
        driver.get("https://www.emag.ro");
    }
    @And("User cauta {string}")
    public void cauta_apple(String produs) {
        WebElement searchBoxEmag = driver.findElement(By.id("searchboxTrigger"));
        searchBoxEmag.sendKeys(produs);
        searchBoxEmag.submit();
    }
    public static void main(String[] args){
        //TO DO



        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys();

    }
}
