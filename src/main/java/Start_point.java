import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Start_point {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Applications/webDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println("Title:" + driver.getTitle());
        driver.findElement(By.cssSelector("[name='q']")).clear();
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("Hello, world!");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".g h3 a")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.quit();
    }



    public void testGoogleSearch() throws Exception {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
      //  System.setProperty("webdriver.chrome.driver", "/Applications/webDrivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println("Title:"+driver.getTitle());
        driver.findElement(By.cssSelector("[name='q']")).clear();
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("Hello, world!");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".g h3 a")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.quit();


//        Thread.sleep(50000);  // Let the user actually see something!
//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("ChromeDriver");
//        searchBox.submit();
//        Thread.sleep(5000);  // Let the user actually see something!
//        driver.quit();
    }
}
