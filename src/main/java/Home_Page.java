import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page extends Page_Base{
    public Home_Page(WebDriver driver) {
        super(driver);
    }
    private By Swag_lab=By.xpath("//div[text()='Swag Labs']");

    public String Swag_Lab()
    {
        return get_Text(driver.findElement(Swag_lab));
    }
    public boolean visibility_of_swag_lab()
    {
        return element_visibility(driver.findElement(Swag_lab));
    }

}
