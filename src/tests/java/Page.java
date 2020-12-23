import org.openqa.selenium.WebDriver;

/**
 * @author Adam Gataev (r0717663)
 */
public abstract class Page {

    WebDriver driver;
    String path = "http://localhost:8080/Project_war_exploded/Controller";

    public Page (WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getPath() {
        return path;
    }

    public String getTitle () {
        return driver.getTitle();
    }

}