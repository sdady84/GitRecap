package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTitleVerification {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open Amazon website
            driver.get("https://www.amazon.com/");

            // Get the page title
            String pageTitle = driver.getTitle();

            // Verify the page title
            String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
            if (pageTitle.equals(expectedTitle)) {
                System.out.println("Title verification passed.");
            } else {
                System.out.println("Title verification failed. Expected: " + expectedTitle + ", but got: " + pageTitle);
            }
        } catch (WebDriverException e) {
            System.err.println("WebDriverException: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}