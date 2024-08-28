package tautest;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    public void OpenThePageAndCheckTheTitle() throws InterruptedException {
        String expectedTitle = "Google";
        String searchText ="IT Companies In Finland";
        webDriver.get("https://www.google.com");
        assertEquals(expectedTitle, webDriver.getTitle());
        WebElement textBox = webDriver.findElement(By.id("APjFqb"));
        textBox.sendKeys(searchText, Keys.ENTER);
//        assertEquals(searchText, textBox.getText());
     //   textBox.sendKeys(Keys.ENTER);
        //commit from feature branch to master branch

    }

}
