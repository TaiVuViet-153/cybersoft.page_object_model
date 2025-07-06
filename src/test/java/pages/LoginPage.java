package pages;

import org.openqa.selenium.By;

public class LoginPage {
    private WebDriver driver;

    // Constructor nhận webdrivẻ
    public LoginPage(Webdriver driver) {
        this.driver = driver;
    }

    // Hàm thực hiện đăng nhập
    public void login(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }
}
