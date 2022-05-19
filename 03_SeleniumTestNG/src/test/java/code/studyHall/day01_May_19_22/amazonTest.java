package code.studyHall.day01_May_19_22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonTest {
    public static void main(String[] args) {
        //Go to Apple.ca
        //Verify if you landed on correct website

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();// this will maximize browser window
        //go to automationpractice website
        driver.get("http://automationpractice.com/index.php");
        WebElement searchBox=driver.findElement(By.name("search_query"));

        searchBox.sendKeys("T-shirt");

        WebElement searchButton= driver.findElement(By.name("submit_search"));
        searchButton.click();

        //alternative way to the above
        //driver.findElement(By.name("search_query")).sendKeys("T-Shirt"+ Keys.ENTER);
        String expectedTitle="Search - My Store";
        String actualTitle=driver.getTitle();

        if(expectedTitle.equals(actualTitle)){

            System.out.println("Title verification is successful");
        }else{
            System.out.println("The expected title was "+expectedTitle+" Actual title is "+actualTitle);
            System.out.println("Title verification failed. Please check for additional info!");
        }
        driver.close();
    }
}
