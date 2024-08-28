package tautest;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {
    private static WebDriver webDriver;


    @BeforeAll
    public static void beforeAll() {
        webDriver = new ChromeDriver();

    }

    @AfterAll
    public static void afterAll() {
        webDriver.quit();

    }

    @Test
    public void OpenThePageAndCheckTheTitle() {
        String expectedTitle = "Google";
        webDriver.get("https://www.google.com");
        assertEquals(expectedTitle, webDriver.getTitle());
    }

}
