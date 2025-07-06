package scripts;

import pages.AddEmployee;
import pages.DashboardPage;
import pages.LoginPage;


public class AddEmployeeTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(3000);

            // Lớp loginpage
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login("Admin", "admin123");

            System.out.println("Đăng nhập thành công");
            Thread.sleep(5000);

            DashboardPage dashboardPage = new DashboardPage(driver);
            dashboardPage.goToPimPage();
            System.out.println("Chuyển hướng sang Pim thành công");
            Thread.sleep(5000);

            AddEmployee addEmployee = new AddEmployee(driver);
            addEmployee.goToAddEmployee();
            System.out.println("Chuyển hướng thành công");
            Thread.sleep(5000);

            String firstName = "Testing";
            String lastName = "Automation";
            String empID = addEmployee.addNewEmployee(firstName, lastName);
            System.out.println("Thêm thành công");
            Thread.sleep(3000);

            Boolean isVerify = addEmployee.verifyNewEmployee(firstName, lastName, empID);
            if (isVerify) {
                System.out.println("Kết quả trùng khớp");
            } else {
                System.out.println("Kết quả không trùng khớp");
            }


        } catch (Exception e) {
            System.out.println("Lỗi " + e.getMessage());
        } finally {
            driver.quit();
        }

    }
}
