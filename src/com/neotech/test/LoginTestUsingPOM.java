package com.neotech.test;

import com.neotech.pages.DashboardPage;
import com.neotech.pages.LoginPage;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingPOM extends CommonMethods {

	public static void main(String[] args) {
		//https://hrm.neotechacademy.com

		setUp();
		
		//right after setUp()  we are in the login page, so the elements are there, and I can locate them
		LoginPage login = new LoginPage();
		
		//sending the username
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		//sending the password
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		//click on login
		
		click(login.loginBtn);
		
		//or
		//login.loginBtn.click();
		
		wait(3);
		
		//at this point I can locate all the dashboard elements 
		DashboardPage dashboard = new DashboardPage();
		
		//lets validate if the logo on dashboard is showing
		if(dashboard.logo.isDisplayed())
		{
			System.out.println("Test Passed!");
		}
		else
		{
			System.out.println("Test Failed!");
		}
		
		
		//lets validate that the employee name "Jacqueline White" is showing
		
		String expectedName = "Jacqueline White";
		String actualName = dashboard.accountName.getText();
		
		if (actualName.equals(expectedName))
		{
			System.out.println(expectedName + " is logged in.");
		}
		else
		{
			System.out.println(expectedName + " is NOT logged in.");
		}
		
		wait(2);
		
		tearDown();
		
		
	}

}