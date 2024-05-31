package testng.assertion.softassertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

    @Test
    public void assertEqualMethod() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        SoftAssert a = new SoftAssert();
        String title = driver.getTitle();
        a.assertEquals(title, "Google", "title should be match");
        a.assertAll();
        driver.close();
    }

    @Test
    public void A() {

        String exeTest = "hi";
        String actTest = "hii";
        SoftAssert a = new SoftAssert();
        a.assertEquals(exeTest,actTest);
        a.assertAll();
    }

    @Test
    public void B() {
        System.out.println("Hi");
        System.out.println("title should be match");
        System.out.println("Hi");
            

    }
}