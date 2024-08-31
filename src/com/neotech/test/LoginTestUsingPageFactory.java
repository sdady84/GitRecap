package com.neotech.test;

import com.neotech.pages.DashboardPageUsingPageFactory;
import com.neotech.pages.LoginPageUsingPageFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingPageFactory extends CommonMethods {

	public static void main(String[] args) {

		// https://hrm.neotechacademy.com

		setUp();

		 LoginPageUsingPageFactory login = new LoginPageUsingPageFactory();
		 DashboardPageUsingPageFactory dashboard = new DashboardPageUsingPageFactory();
		
		// send the username
		sendText(login.username, ConfigsReader.getProperty("username"));
		// send the password
		sendText(login.password, ConfigsReader.getProperty("password"));

		click(login.loginBtn);

		wait(4);

		// validate if the logo is displayed
		if (dashboard.logo.isDisplayed()) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}

		// validate the account name
		String expectedName = "Jacqueline White";
		String actualName = dashboard.accountName.getText();

		if (actualName.equals(expectedName)) {
			System.out.println(expectedName + " is logged in!");
		} else {
			System.out.println(expectedName + " is NOT logged in!");
		}

		wait(2);

		tearDown();
	}

}