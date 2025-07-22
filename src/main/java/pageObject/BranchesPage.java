package pageObject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BranchesPage  extends BtlBasePage{
    public BranchesPage(WebDriver driver) {
        super(driver);
    }

    public void isOnPage() throws InterruptedException {
        Thread.sleep(3000);
        WebElement title= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/h1\n"));
        Assertions.assertEquals("סניפים וערוצי שירות", title.getText(),"Not found the page");
    }
    public void chooseBranch(){
        WebElement snif=driver.findElement(By.className("SnifName"));
        snif.click();
    }
    public void isClickBranch() throws InterruptedException {
        Thread.sleep(5000);
        WebElement address=driver.findElement(By.xpath("//div//label[contains(text(),'כתובת')]"));
        Assertions.assertEquals("כתובת", address.getText(),"Not found the label address");
        WebElement people=driver.findElement(By.xpath("//div//label[contains(text(),'קבלת קהל')]"));
        Assertions.assertEquals("קבלת קהל", people.getText(),"Not found the label address");
        WebElement phone=driver.findElement(By.xpath("//div//label[contains(text(),'מענה טלפוני')]"));
        Assertions.assertEquals("מענה טלפוני", phone.getText(),"Not found the label address");

    }
}
