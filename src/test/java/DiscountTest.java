import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class DiscountTest {


    @Test
    public void checkDiscount0(){
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=11111&first_name=Test&last_name=Test&email=test%40mail.ru&password1=11111&password2=11111");
        String email = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=8");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td[3]/input")).clear();
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td[3]/input")).sendKeys("19");
        driver.findElement(By.cssSelector("[value=Update")).click();
        double discountPercent = Double.parseDouble(driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText());
        softAssert.assertEquals(discountPercent, 0.0);
        double discountPrice = Double.parseDouble(driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText());
        softAssert.assertEquals(discountPrice, 0.0);
        double totalPrice = Double.parseDouble(driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText());
        softAssert.assertEquals(totalPrice, 190.0);
        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDiscount5(){
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=11111&first_name=Test&last_name=Test&email=test%40mail.ru&password1=11111&password2=11111");
        String email = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=8");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td[3]/input")).clear();
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td[3]/input")).sendKeys("500");
        driver.findElement(By.cssSelector("[value=Update")).click();
        double discountPercent = Double.parseDouble(driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText());
        softAssert.assertEquals(discountPercent, 5.0);
        double discountPrice = Double.parseDouble(driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText());
        softAssert.assertEquals(discountPrice, 250.0);
        double totalPrice = Double.parseDouble(driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText());
        softAssert.assertEquals(totalPrice, 4750.0);
        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDiscount7() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=11111&first_name=Test&last_name=Test&email=test%40mail.ru&password1=11111&password2=11111");
        String email = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=8");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td[3]/input")).clear();
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td[3]/input")).sendKeys("5000");
        driver.findElement(By.cssSelector("[value=Update")).click();
        double discountPercent = Double.parseDouble(driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText());
        softAssert.assertEquals(discountPercent, 7.0);
        double discountPrice = Double.parseDouble(driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText());
        softAssert.assertEquals(discountPrice, 3500.0);
        double totalPrice = Double.parseDouble(driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText());
        softAssert.assertEquals(totalPrice, 46500.0);
        driver.quit();
        softAssert.assertAll();
    }
}
