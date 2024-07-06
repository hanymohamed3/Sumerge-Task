import org.testng.Assert;
import org.testng.annotations.Test;

public class Third_Requirment extends Test_Base {

    Login_Page loginPage;
    String username = "HanyMohamed";
    String Password = "123456";

    @Test
    public void check_invalid_credentials()
    {
        loginPage = new Login_Page(driver);

        loginPage.enter_username(username);

        loginPage.enter_password(Password);

        loginPage.press_login();

        Assert.assertTrue(loginPage.Text_of_error_messege().contains("Epic sadface: Username and password do not match any user in this service"));

        Assert.assertTrue(loginPage.visibility_of_error_messege());

    }
}
