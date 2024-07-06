import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page extends Page_Base {
    public Login_Page(WebDriver driver) {
        super(driver);
    }
    private By User_name=By.id("user-name");
    private By Password=By.id("password");
    private By login_button=By.id("login-button");
    private By error_messege=By.cssSelector("div.error-message-container.error");

    public void enter_username(String username)
    {
        send_values(driver.findElement(User_name), username);
    }
    public void enter_password(String password)
    {
        send_values(driver.findElement(Password), password);
    }

    public void press_login(){
        click(driver.findElement(login_button));
    }

    public String Text_of_error_messege()
    {
         return get_Text(driver.findElement(error_messege));
    }

    public boolean present_of_username_field()
    {
       return present_of_element(User_name);
    }
    public boolean present_of_Password_field()
    {
        return present_of_element(Password);
    }
    public boolean present_of_Login_button()
    {
        return present_of_element(login_button);
    }
    public boolean visibility_of_error_messege()
    {
        return element_visibility(driver.findElement(error_messege));
    }


}
