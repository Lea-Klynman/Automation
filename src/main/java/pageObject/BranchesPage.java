package pageObject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BranchesPage  extends BtlBasePage{
    public BranchesPage(WebDriver driver) {
        super(driver);
    }

    public void isOnPage() throws InterruptedException {
        Thread.sleep(3000);
        WebElement title= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/h1\n"));
        ////div[@class='opener-bg']/h1[starts-with(text(),’סניפים’]
        Assertions.assertEquals("סניפים וערוצי שירות", title.getText(),"Not found the page");
    }
    public void chooseBranch(){
        WebElement snif=driver.findElement(By.className("SnifName"));
        snif.click();
    }
    public void isClickBranch() throws InterruptedException {
        Thread.sleep(5000);
        WebElement label=driver.findElement(By.xpath("//div//label[contains(text(),'כתובת')]"));
       // System.out.println(labels.get(0).getText());
        Assertions.assertEquals("כתובת", label.getText(),"Not found the label address");
      //  System.out.println(labels.get(1).getText());
     //   Assertions.assertEquals("כתובת", labels.get(1).getText(),"Not found the label");
      //  Assertions.assertEquals("מענה טלפוני", labels.get(2).getText(),"Not found the label phone ");

    }
}
