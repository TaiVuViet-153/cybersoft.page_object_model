package pages;

public class DashboardPage {
    private WebDriver driver;

    // constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPimPage() {
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
    }

    public void goToAdminPage() {
        driver.findElement(By.xpath("//span[text()='Admin']")).click();
    }

    public void goToMyInfoPage() {
        driver.findElement(By.xpath("//span[text()='My Info']")).click();
    }
}
