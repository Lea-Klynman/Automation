package pageObject;

import enums.TopMenuEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BtlBasePage extends BasePage {

    @FindBy(id ="TopQuestions" )
    protected WebElement Search;
    @FindBy(id ="ctl00_Topmneu_BranchesHyperLink" )
    protected WebElement BranchesButton;

    @FindBy(id ="ctl00_Topmneu_InsuranceHyperLink" )
    protected WebElement DmaiBituchButton;

    public BtlBasePage(WebDriver driver) {
        super(driver);
    }

    public void navigate(TopMenuEnum topMenuEnum){
        driver.findElement(By.linkText(topMenuEnum.getTopMenu())).click();
    }

    public void navigateSubMenu(String subMenu){
        driver.findElement(By.linkText(subMenu)).click();
    }


    public void EnterValueToSearchInput(String value){
        Search.sendKeys(value );
        Search.sendKeys( Keys.ENTER);
    }

    public BranchesPage NavigateBranches(){
        BranchesButton.click();
        return new BranchesPage(super.driver);
    }

    public DmaiBituachLeumi NavigateDmaiBituchLeumi(){
        DmaiBituchButton.click();
        driver.findElement(By.xpath("div//ul//li//a[contains(text(),'דמי ביטוח לאומי')]\"")).click();
        return new DmaiBituachLeumi(super.driver);
    }

}
