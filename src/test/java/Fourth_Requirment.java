import org.testng.Assert;
import org.testng.annotations.Test;

public class Fourth_Requirment extends Test_Base {
    Login_Page loginPage;
    String username = "HanyMohamed";
    String Password = "123456";

    @Test(priority = 1)
    public void check_empty_username()  {
        loginPage = new Login_Page(driver);

        loginPage.enter_password(Password);

        loginPage.press_login();

        Assert.assertTrue(loginPage.Text_of_error_messege().contains("Epic sadface: Username is required"));

        Assert.assertTrue(loginPage.visibility_of_error_messege());

    }

    @Test(priority = 2)
    public void check_empty_password() {
        loginPage = new Login_Page(driver);

        Refresh();

        loginPage.enter_username(username);

        loginPage.press_login();

        Assert.assertTrue(loginPage.Text_of_error_messege().contains("Epic sadface: Password is required"));

        Assert.assertTrue(loginPage.visibility_of_error_messege());


    }

}
