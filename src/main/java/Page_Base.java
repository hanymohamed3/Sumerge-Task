import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page_Base {
    protected WebDriver driver;
     public WebDriverWait wait;
    public Page_Base(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void click(WebElement element)
    {
        element.click();
    }
    public void clear(WebElement element)
    {
        element.clear();
    }
    public void send_values(WebElement element, String keys)
    {
        element.sendKeys(keys);
    }

    public boolean element_visibility(WebElement element)
    {
        if(element.isDisplayed())
            return true;
        else
            return false;
    }

    public boolean present_of_element(By by)
    {
        try {
            driver.findElement(by);
            return true;
        }
        catch (NoSuchElementException exp)
        {
            return false;
        }

    }
    public String get_Text(WebElement element)
    {
      return   element.getText();
    }
}
