package pages;

public class AddEmployee {
    private WebDriver driver;

    // Constructor
    public AddEmployee (WebDriver driver) {
        this.driver = driver;
    }

    public void goToAddEmployee () {
        driver.findElement(By.xpath("//a[text()=\"Add Employee\"]")).click();
    }

    public String addNewEmployee(String firstName, String lastName) {
        driver.findElement(By.name("firstName")).sendKeys(firstName);
        driver.findElement(By.name("lastName")).sendKeys(lastName);
        String empID = driver.findElement(By.xpath("//label[text()=\"Employee Id\"]/../following-sibling::div/input")).getAttribute("value");
        driver.findElement(By.xpath("")).click();

        return empID;
    }

    public Boolean verifyNewEmployee(String expectedFirstName, String expectedLastName, String expectedEmpID) {
        String actualFirstName = driver.findElement(By.name("firstName")).getAttribute("value").trim();
        String actualLastName = driver.findElement(By.name("lastName")).getAttribute("value").trim();
        String actualEmpID = driver.findElement(By.xpath("//label[text()=\"Employee Id\"]/../following-sibling::div/input")).getAttribute("value").trim();

        return expectedFirstName.equals(actualFirstName) && expectedLastName.equals(actualLastName) && expectedEmpID.equals(actualEmpID);
    }
}
