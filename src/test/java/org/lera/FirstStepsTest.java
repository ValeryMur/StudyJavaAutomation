package org.lera;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstStepsTest {

    WebDriver driver;

    @BeforeClass
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "/Applications/webDrivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleTitle() throws Exception {
        driver.get("http://www.google.com/xhtml");
        assertThat(driver.getTitle()).isEqualToIgnoringCase("google");
    }

    @Test
    public void testGoogleSearch() throws Exception {
        System.setOut(new PrintStream(new FileOutputStream("path")));
        System.err.println("Fail");
    }

    @Test
    public void testBrowserNavigation(){
        driver.get("https://google.com");
        driver.get("https://facebook.com");
        System.out.println("CURRENT URL: "+driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("AFTER .back() URL: "+driver.getCurrentUrl());
        driver.navigate().forward();
        System.out.println("AFTER .forward() URL: "+driver.getCurrentUrl());
    }

    @AfterClass
    public void shutDownDriver(){
        driver.quit();
    }

}
