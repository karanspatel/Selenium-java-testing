import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class seleniumTest {

    @BeforeClass
    public static void setupClass()
    {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void signInTest()
    {
        //Initiating chrome webdriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Going to the particular URL
        driver.get("https://www.wolframcloud.com");
        //Maximizing the chrome window for optimal view
        driver.manage().window().maximize();
        //Creates a button element that is clickable
        WebElement button;
        button = driver.findElement(By.xpath("//*[@id=\"landingPage\"]/div/main/section/div[2]/div/label[2]/button"));
        //Clicks the sign in button
        button.click();
        System.out.println("Sign In Test Passed!");
        //Quits the window
        driver.quit();
    }

    @Test
    public void logInTest()
    {
        //Initiating chrome webdriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Going to the particular URL
        driver.get("https://www.wolframcloud.com");
        //Maximizing the chrome window for optimal view
        driver.manage().window().maximize();
        //Creates a button element that is clickable
        WebElement button;
        button = driver.findElement(By.xpath("//*[@id=\"landingPage\"]/div/main/section/div[2]/div/label[2]/button"));
        //Clicks the sign in button
        button.click();
        //Creates a username element to store username element in
        WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        //Sends the username text to fill the username field
        username.sendKeys("karanspatel1998@gmail.com");
        //Stores the button location for sign in
        button = driver.findElement(By.xpath("//*[@id=\"sign-in-btn\"]"));
        //Clicks the sign in button
        button.click();
        //Creates a password element to store password element in
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        //Sends the password text to fill the password field
        password.sendKeys("@Minaxitx6");
        //Stores the location of the sign in button
        button = driver.findElement(By.xpath("//*[@id=\"sign-in-btn\"]"));
        //Clicks the sign in button
        button.click();
        System.out.println("Logging in test passed!");
        //Quits the window
        driver.quit();
    }

    @Test
    public void newNotebookTest()
    {
        //Initiating chrome webdriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Going to the particular URL
        driver.get("https://www.wolframcloud.com");
        //Maximizing the chrome window for optimal view
        driver.manage().window().maximize();
        //Creates a button element that is clickable
        WebElement button;
        button = driver.findElement(By.xpath("//*[@id=\"landingPage\"]/div/main/section/div[2]/div/label[2]/button"));
        //Clicks the sign in button
        button.click();
        //Creates a username element to store username element in
        WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        //Sends the username text to fill the username field
        username.sendKeys("karanspatel1998@gmail.com");
        //Stores the button location for sign in
        button = driver.findElement(By.xpath("//*[@id=\"sign-in-btn\"]"));
        //Clicks the sign in button
        button.click();
        //Creates a password element to store password element in
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        //Sends the password text to fill the password field
        password.sendKeys("@Minaxitx6");
        //Stores the location of the sign in button
        button = driver.findElement(By.xpath("//*[@id=\"sign-in-btn\"]"));
        //Clicks the sign in button
        button.click();
        //Stores the location of the new notebook button
        button = driver.findElement(By.xpath("//*[@id=\"resizableElement\"]/div[1]/section/section/div[1]/button"));
        //Clicks the new notebook button
        button.click();
        System.out.println("New notebook test has been passed!");
        //Quits the window
        driver.quit();
    }

    @Test
    public void insertCellTest() throws InterruptedException {
        //Initiating chrome webdriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Going to the particular URL
        driver.get("https://www.wolframcloud.com");
        //Maximizing the chrome window for optimal view
        driver.manage().window().maximize();
        //Creates a button element that is clickable
        WebElement button;
        button = driver.findElement(By.xpath("//*[@id=\"landingPage\"]/div/main/section/div[2]/div/label[2]/button"));
        //Clicks the sign in button
        button.click();
        //Creates a username element to store username element in
        WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        //Sends the username text to fill the username field
        username.sendKeys("karanspatel1998@gmail.com");
        //Stores the button location for sign in
        button = driver.findElement(By.xpath("//*[@id=\"sign-in-btn\"]"));
        //Clicks the sign in button
        button.click();
        //Creates a password element to store password element in
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        //Sends the password text to fill the password field
        password.sendKeys("@Minaxitx6");
        //Stores the location of the sign in button
        button = driver.findElement(By.xpath("//*[@id=\"sign-in-btn\"]"));
        //Clicks the sign in button
        button.click();
        //Stores the location of the new notebook button
        button = driver.findElement(By.xpath("//*[@id=\"resizableElement\"]/div[1]/section/section/div[1]/button"));
        //Clicks the new notebook button
        button.click();
        //Stores the list of windows that are currently open
        ArrayList<String> handles = new ArrayList<> (driver.getWindowHandles());
        //Switches to the second window, the newest one
        driver.switchTo().window(handles.get(1));
        //Waits for the browser to load properly
        Thread.sleep(1000);
        //Stores the element for the insert button and performs a click on the button
        WebElement element = driver.findElement(By.linkText("Insert"));
        Actions action = new Actions(driver);
        action.click(element).build().perform();
        //Stores the element for the create inline text box button and performs a click
        WebElement e = driver.findElement(By.xpath("//*[@id=\"fileHeaderMenu\"]/ul/li[3]/ul/li[5]/a"));
        Actions a = new Actions(driver);
        a.click(e).build().perform();
        Thread.sleep(1000);
        //Stores the location of the text box created from previous button
        WebElement text = driver.findElement(By.className("_2u1PLvBCF8NYOgFE_NxE_r"));
        //Sends an equation to solve into the text box field and evaulates the expression
        text.sendKeys("2+2" + Keys.SHIFT + Keys.ENTER);
        System.out.println("Inserting and Evaluating test has been passed!");
        //Quits the window
        driver.quit();
    }
}