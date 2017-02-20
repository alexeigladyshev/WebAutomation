package SearchItems;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageFactorySearch.SearchItems;

/**
 * Created by rrt on 1/3/2016.
 */
public class SearchItemsByDataProvider extends CommonAPI {
     //One Data Driven Option to supply search.data from Data Provider
    @DataProvider(name = "items")
    public Object[][] createData(){
        return new Object[][]{
                {"Books"} ,
                {"Baby"} ,
                {"Computer"},


        };
    }

    @Test(dataProvider = "items")
    public void searchUsingDataProvider(String data)throws InterruptedException{
        //initialize Search page factory
        SearchItems search = PageFactory.initElements(driver, SearchItems.class);
            search.searchFor(data);
            sleepFor(2);
            search.clearSearchInput();
    }
}
