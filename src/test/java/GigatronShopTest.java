import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.PolyUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GigatronShopTest extends BaseTest{


    PopupPage popupPage;
    HomePage homePage;

@BeforeMethod
    public void setUp()
{
    driver = openBrowser();
    popupPage = new PopupPage(driver);
    homePage = new HomePage(driver);

}
@Test
    public void ShopTest(){
    popupPage.clickOnPopup();
    popupPage.clickPrihvati();
    homePage.inputSearch("Samsung");

}

@AfterMethod
    public void after(){
    driver.quit();
}

}
