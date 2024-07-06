import org.testng.Assert;
import org.testng.annotations.Test;

public class Second_Requirment extends Test_Base{

    Login_Page loginPage;
    Home_Page homePage;
    String username = "standard_use";
    String Password = "secret_sauce";

    @Test
    public void check_valid_credentials()
    {
        loginPage = new Login_Page(driver);

        homePage = new Home_Page(driver);

        loginPage.enter_username(username);

        loginPage.enter_password(Password);

        loginPage.press_login();

        Assert.assertTrue(homePage.visibility_of_swag_lab());

    }
}
