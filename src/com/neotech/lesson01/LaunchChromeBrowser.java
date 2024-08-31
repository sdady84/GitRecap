package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {


		//Open the browser
		WebDriver driver = new ChromeDriver();  //CTRL + SHIFT + O  -- imports the necessary objects
		
		//Go to the URL
		driver.get("https://www.neotechacademy.com/");
		
		//Do whatever test you need
				//this would be where the actions take place
		
			//for now I just want to code to stop here, so that I can see the page loading
			Thread.sleep(10000); //this is stopping the execution for 10 seconds so that I can see the page 
		
		//Close the browser
		driver.quit();
		
		
		
	}

}