package Tests;

import Methods.LoginPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Sasha on 19.02.2017.
 */
public class plugins extends BaseTest {

    @Test
    public void creategitlub() throws InterruptedException {
        driver.get(baseUrl + "/users/sign_in");
        LoginPage loginPage = new LoginPage();
        LoginPage.login(driver, "sasha.yevtushenko@aiesec.net", "qwerasd1995");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("My Projects")).click();
        driver.findElement(By.cssSelector("img.project-logo.mCS_img_loaded")).click();
        driver.findElement(By.linkText("Integrations")).click();
        driver.findElement(By.cssSelector("span.translation_missing")).click();
        driver.findElement(By.linkText("Add new plugin")).click();
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.linkText("Git Lab")).click();
        driver.findElement(By.id("git_lab_setting_access_token")).clear();
        driver.findElement(By.id("git_lab_setting_access_token")).sendKeys("YqKDPtTHieadFPptVMBb");
        driver.findElement(By.id("git_lab_setting_project_url")).clear();
        driver.findElement(By.id("git_lab_setting_project_url")).sendKeys("https://gitlab.com/sasha.yevtushenko/Test.git");
        driver.findElement(By.name("commit")).click();
        WebElement errorMessage = driver.findElement(By.className("author"));
        assertTrue(errorMessage.getText().contains("Sasha Yevtushenko"));



    }
    @Test
    public void creategithub() throws InterruptedException {
        driver.get(baseUrl + "/users/sign_in");
        LoginPage loginPage = new LoginPage();
        LoginPage.login(driver, "sasha.yevtushenko@aiesec.net", "qwerasd1995");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("My Projects")).click();
        driver.findElement(By.cssSelector("img.project-logo.mCS_img_loaded")).click();
        driver.findElement(By.linkText("Integrations")).click();
        driver.findElement(By.cssSelector("span.translation_missing")).click();
        driver.findElement(By.linkText("Add new plugin")).click();
        driver.findElement(By.linkText("Please choose integration plugin")).click();
        driver.findElement(By.linkText("Git Hub")).click();
        driver.findElement(By.id("git_hub_setting_repository_url")).clear();
        driver.findElement(By.id("git_hub_setting_repository_url")).sendKeys("https://github.com/EvtSasha/SuperTest.git");
        driver.findElement(By.id("git_hub_setting_access_token")).clear();
        driver.findElement(By.id("git_hub_setting_access_token")).sendKeys("206e690d9601c1bd12bff46fe6f48ccb055dc324");
        driver.findElement(By.name("commit")).click();
        WebElement errorMessage = driver.findElement(By.className("author"));
        assertTrue(errorMessage.getText().contains("Sasha Yevtushenko"));









    }

}