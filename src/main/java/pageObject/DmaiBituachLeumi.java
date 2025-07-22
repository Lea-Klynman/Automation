package pageObject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DmaiBituachLeumi extends BtlBasePage{
    public DmaiBituachLeumi(WebDriver driver) {
        super(driver);
    }

    public void isOnPage() throws InterruptedException {
        Thread.sleep(3000);
        WebElement title= driver.findElement(By.xpath("//h1//span[@id='lbl_title']"));
        Assertions.assertEquals(" דמי ביטוח לאומי ", title.getText(),"Not found the page");
    }

    public void counterDmaiBituach(String date) throws InterruptedException {
        driver.findElement(By.xpath("//a/strong[contains(text(),'מחשבון לחישוב דמי הביטוח')]")).click();
        step1(date);
        step2();
        finishProcess();
    }
    public void step1(String date){
        driver.findElement(By.id("ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_rdb_employeType_2")).click();
        driver.findElement(By.id("ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_rdb_Gender_0")).click();
        WebElement dateInput=driver.findElement(By.id("ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_DynDatePicker_BirthDate_Date"));
        dateInput.sendKeys(date);
        driver.findElement(By.id("ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_StartNavigationTemplateContainerID_StartNextButton")).click();

    }
    public void step2() throws InterruptedException {
        Thread.sleep(3000);
        WebElement title= driver.findElement(By.id("header"));
        Assertions.assertEquals(" צעד שני ", title.getText(),"Not found the page");
        driver.findElement(By.id("ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_rdb_GetNechut_1")).click();
        driver.findElement(By.id("ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_StepNavigationTemplateContainerID_StepNextButton")).click();
    }
    public void finishProcess() throws InterruptedException {
        Thread.sleep(3000);

        WebElement title= driver.findElement(By.id("header"));
        Assertions.assertEquals("סיום", title.getText(),"Not found the page");
        WebElement nationalInsuranceElement = driver.findElement(By.xpath("//ul[contains(@class,'CalcResult')]//li[1]/strong"));
        String nationalInsuranceText = nationalInsuranceElement.getText().trim();
        Assertions.assertEquals("43", nationalInsuranceText, "שגיאה בדמי ביטוח לאומי");

        WebElement healthInsuranceElement = driver.findElement(By.xpath("//ul[contains(@class,'CalcResult')]//li[2]/strong"));
        String healthInsuranceText = healthInsuranceElement.getText().trim();
        Assertions.assertEquals("120.00", healthInsuranceText, "שגיאה בדמי ביטוח בריאות");

        WebElement totalElement = driver.findElement(By.xpath("//ul[contains(@class,'CalcResult')]//li[3]/strong"));
        String totalText = totalElement.getText().trim();
        Assertions.assertEquals("163", totalText, "שגיאה בסך הכולל של דמי הביטוח");
    }
}
