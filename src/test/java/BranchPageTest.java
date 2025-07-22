import org.junit.jupiter.api.Test;
import pageObject.BranchesPage;
import pageObject.BtlBasePage;


public class BranchPageTest extends BaseTest{
    @Test
    public void branchesPageTest() throws InterruptedException {
        BtlBasePage page=new BtlBasePage(driver);
        BranchesPage brpage=new BranchesPage(driver);
        page.NavigateBranches();
        brpage.isOnPage();
        brpage.chooseBranch();
        brpage.isClickBranch();
    }
}
