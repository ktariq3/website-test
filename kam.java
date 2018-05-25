package newproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class PG1 {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://www.valtech.com/";
        String baseUrl1 = "https://www.valtech.com/about/";
        String baseUrl2 = "https://www.valtech.com/services/";
        String baseUrl3 = "https://www.valtech.com/work/";


        String expectedTitle = "Latest News";
        String actualTitle = "Latest News";

        String expectedTitle1 = "About";
        String actualTitle1 = "About";


        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       driver.get(baseUrl1);

        if (actualTitle1.contentEquals(expectedTitle1)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
            driver.get(baseUrl2);
          if (actualTitle2.contentEquals(expectedTitle2)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       driver.get(baseUrl3);

        if (actualTitle3.contentEquals(expectedTitle3)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        Select se = new Select(driver.findElement(By.id("Contact us!")));

List<WebElement> l = se.getOptions();
l.size();
        //close Fire fox
        driver.close();
       
    }

}