package skeletonTestNG1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class NewTest {
/*  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("Main test");
  }*/
private WebDriver driver;
int icol, irows;

    @Test
public void findWebtableRowCol() {
	
	System.out.println("I am Test Case 1");

        String baseUrl = "https://money.rediff.com/gainers/bsc/daily/groupa";


        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
        List col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
        icol = col.size();
        System.out.println("No of cols are : " +icol);

        //No.of rows
        List  rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        irows = rows.size();
        System.out.println("No of rows are : " + irows);

    }





@Test
public void locateElementIneed() {
	
	System.out.println("I am Test Case 2");

	for (int i = 5; i <= 5; i++){

	    for (int j = 1 ;j <= 1 ; j++){

            WebElement cellIneed = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[" + i + "]/td[" + j + "]"));

            System.out.println(cellIneed.getText());

            Assert.assertEquals(cellIneed.getText(),"Dilip Buildcon Ltd.","Expected link needed not found");


            driver.close();

        }

    }


}
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am after Method");
  }


 /* @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }*/
  @BeforeClass
  public void beforeClass() {

      String currentDir = System.getProperty("user.dir");

       ChromeDriverManager.getInstance().setup();

       driver = new ChromeDriver();

      System.out.println("I am before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am after Suite");
  }

}














