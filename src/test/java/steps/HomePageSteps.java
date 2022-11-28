package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

public class HomePageSteps extends CommonSteps {

    private static final Logger logger = LogManager.getLogger(HomePageSteps.class);

    public HomePage homePage;


    public void verifySuiteDashBoard() {
        homePage.suiteCrmDashboardButton.isDisplayed();
//        Actions action = new Actions(driver);
//        action.moveToElement(commonPage.opportunitiesModule).build().perform();  // build().perform

    }

    public void clickOpportunitiesModule() {
        homePage = new HomePage(driver);
        homePage.opportunitiesModule.click();
    }

    public void clickOnHomePage() {
        homePage = new HomePage(driver);
        homePage.homePageButton.click();
    }
}
