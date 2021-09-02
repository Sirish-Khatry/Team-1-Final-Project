package com.qa.choonz.uat.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.choonz.hooks.SeleniumHooks;

import com.qa.choonz.uat.pages.PlaylistPage;
import com.qa.choonz.uat.pages.UsersPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaylistStepDefs {
	private WebDriver driver;
	private PlaylistPage playlistPage;
	private UsersPage usersPage;

	public PlaylistStepDefs(SeleniumHooks hooks) {
		this.driver = hooks.getDriver();
		this.playlistPage = PageFactory.initElements(driver, PlaylistPage.class);
		this.usersPage = PageFactory.initElements(driver, UsersPage.class);
	}	

	@Given("I am on the playlists page")
	public void iAmOnThePlaylistsPage() {
		this.driver.get("http://127.0.0.1:5500/static/index.html");
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("I sign up and login to create a playlist")
	public void I_sign_up_and_login_to_create_a_playlist() throws InterruptedException {
		usersPage.clickSignUp();
		usersPage.addFullname("Sirish Khatry");
		usersPage.addUsername("sirisho");
		usersPage.addPassword("sirish123");
		Thread.sleep(2000);
		usersPage.clickCreateAccBtn();
		usersPage.closeBtn();
		Thread.sleep(2000);
		usersPage.clickLogIn();
		Thread.sleep(2000);
		usersPage.AddLogInInfo("sirisho", "sirish123");
		Thread.sleep(2000);
		usersPage.clickLogInUser();
		usersPage.closeLogIn();
		Thread.sleep(2000);
		usersPage.clickHome();
	}
	
	@When("I click on playlists management")
	public void i_click_on_playlists_management() {
		playlistPage.clickPlaylistMenu();
	}

	@When("I click on create a playlist")
	public void i_click_on_create_a_playlist() {
		playlistPage.clickCreatePlaylist();
	}

	@When("I fill in the required playlist fields")
	public void i_fill_in_the_required_playlist_name_field() {
		playlistPage.addFields("Summer Sun", "Perfect for relaxing in the sun on a nice summers day", "1",
				"Sun over trees");
	}

	@When("I click create new playlist")
	public void i_click_create_new_playlist() {
		playlistPage.clickCreate();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {

	}
	
	@When("I sign up and login to update a playlist")
	public void I_sign_up_and_login_to_update_a_playlist() throws InterruptedException {
		usersPage.clickSignUp();
		usersPage.addFullname("Sirish Khatry");
		usersPage.addUsername("sirisho");
		usersPage.addPassword("sirish123");
		Thread.sleep(2000);
		usersPage.clickCreateAccBtn();
		usersPage.closeBtn();
		Thread.sleep(2000);
		usersPage.clickLogIn();
		Thread.sleep(2000);
		usersPage.AddLogInInfo("sirisho", "sirish123");
		Thread.sleep(2000);
		usersPage.clickLogInUser();
		usersPage.closeLogIn();
		Thread.sleep(2000);
		usersPage.clickHome();
	}

	@When("I click on playlist management menu")
	public void i_click_on_playlist_management_menu() {
	playlistPage.clickPlaylistMenu();
	}

	@When("I click on update a playlist")
	public void i_click_on_update_a_playlist() {
	
	}

	@When("I fill in the required update playlist fields")
	public void i_fill_in_the_required_update_playlist_fields() {
		
	}

	@When("I click the update playlist button")
	public void i_click_the_update_playlist_button() {
	
	}

	@Then("I should see the updated playlist")
	public void i_should_see_the_updated_playlist() {
		
	}

}
