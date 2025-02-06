package org.asdfg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {

	public static void main(String[] args) {
	
	System.setProperty("webDriver.chrome.driver", "C:\\Users\\RAFAT\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
		

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
		
	String title = driver.getTitle();
		
		
		System.out.println(title);

		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		
		if (actualTitle.equals(expectedTitle)) {
			
			System.out.println("Title Matched");
		} else { System.out.println("Miss Matched");
			
		} 
	driver.quit();
	}
	

}
