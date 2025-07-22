import org.junit.jupiter.api.Test;
import pageObject.BtlBasePage;
import pageObject.DmaiLaidaPage;

public class SearchTest extends BaseTest{
    @Test
    public void dmaiLaidaTest() throws InterruptedException {

        BtlBasePage page=new BtlBasePage(driver);
        DmaiLaidaPage dlpage=new DmaiLaidaPage(driver);
        page.EnterValueToSearchInput("חישוב סכום דמי לידה ליום");
        dlpage.isOnPage();
    }
}
