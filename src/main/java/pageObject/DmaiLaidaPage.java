package pageObject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DmaiLaidaPage extends BtlBasePage {

    public DmaiLaidaPage(WebDriver driver) {
        super(driver);
    }

    public void isOnPage() throws InterruptedException {
        Thread.sleep(3000);
        WebElement title= driver.findElement(By.xpath("//div[@id='results']/h2"));
        Assertions.assertEquals(" תוצאות חיפוש עבור  חישוב סכום דמי לידה ליום ", title.getText(),"Not found the page");
    }
}
