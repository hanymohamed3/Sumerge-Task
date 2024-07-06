import org.testng.Assert;
import org.testng.annotations.Test;

public class First_Requirment extends Test_Base {
    Login_Page loginPage;
    String username = "standard_use";
    String Password = "secret_sauce";

    @Test
    public void check_present_of_elements()
    {
        loginPage =new Login_Page(driver);

        Assert.assertTrue(loginPage.present_of_Login_button());

        Assert.assertTrue(loginPage.present_of_Password_field());

        Assert.assertTrue(loginPage.present_of_Login_button());
    }

}
