package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	public LoginPage loginPage;
	public LoginStepDefinition () {
		loginPage = new LoginPage();
	}

	@Given("Je me connecte sur l application nopcommerce")
	public void jeMeConnecteSurLApplicationNopcommerce() {
    loginPage.goToUrl();
	}

	@When("Je saisis le Email {string}")
	public void jeSaisisLeEmail(String mail) {
    loginPage.fillEmail(mail);
	}

	@When("Je saisis le Password {string}")
	public void jeSaisisLePassword(String keyword) {
    loginPage.fillPassword(keyword);
	}

	@When("Je clique sur le bouton LogIn")
	public void jeCliqueSurLeBoutonLogIn() {
    loginPage.clickOnBtnLogin();
	}

	@Then("Je me redirige vers la page Home {string}")
	public void jeMeRedirigeVersLaPageHome(String string) {

	}

}
