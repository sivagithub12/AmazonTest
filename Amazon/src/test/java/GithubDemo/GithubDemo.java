package GithubDemo;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class GithubDemo 
{
	public static WebDriver driver;
	
  @Test//(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

	/*
	 * @DataProvider public Object[][] dp() { return new Object[][] { new Object[] {
	 * 1, "a" }, new Object[] { 2, "b" }, }; }
	 */
  @BeforeClass
  public void beforeClass() 
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.com");
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
