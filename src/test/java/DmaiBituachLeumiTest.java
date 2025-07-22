import org.junit.jupiter.api.Test;
import pageObject.BtlBasePage;
import pageObject.DmaiBituachLeumi;

public class DmaiBituachLeumiTest extends BaseTest{
    @Test
    public void HabituateLeukemiaForGuysTest() throws InterruptedException {
        BtlBasePage page=new BtlBasePage(driver);
        DmaiBituachLeumi DmaiPAge= new DmaiBituachLeumi(driver);
        page.NavigateDmaiBituchLeumi();
        DmaiPAge.isOnPage();
        DmaiPAge.counterDmaiBituach("01/11/2006");

    }
}
