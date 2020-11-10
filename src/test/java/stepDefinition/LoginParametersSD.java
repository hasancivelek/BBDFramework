package stepDefinition;

import RunnerTest.webPages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginParametersSD {


    private  final LoginPage loginPage=new LoginPage();
    @Given("^I am on admin panel page$")
    public void verifyAdminPage(){
        Assert.assertEquals(loginPage.getAdminHeader(),"Admin area demo");

    }
    @When("^I enter (.+) into (username|password) text fields on admin page$")
    public void enterDataUserAndPassField(String anyText, String textField){
        switch (textField){
            case"username":
                loginPage.enterEmail(anyText);
                break;
            case "password":
                loginPage.enterPassword(anyText);
                break;
        }

    }
@And("^I click on login button on admin login page$")
    public void clickOnButton(){
        loginPage.clickOnLogin();
}
@Then("^I verify that I used invalid credentials$")
    public void verifyInvalidLogin(){
    Assert.assertEquals(true,loginPage.getErrorMassage().contains("Login was unsuccessful."));

}

}
