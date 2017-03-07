import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by aleks_000 on 3/7/2017.
 */
public class SearchByDataProvider extends CommonAPI {

    @DataProvider (name = "items")
    public Object[][] createData(){

        return new Object[][]{
                {"asia"},
                {"europe"},
                {"america"}
        };
    }

    @Test (dataProvider = "items")
    public void SearchUsingDataProvider(String data) throws InterruptedException{

        PageFactorySearch.SearchItems search = PageFactory.initElements(driver, PageFactorySearch.SearchItems.class);
        search.SearchFor(data);
        sleepFor(2);
        search.clearSearchInput();
    }
}
