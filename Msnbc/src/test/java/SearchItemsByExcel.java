import base.CommonAPI;
import dataToSearch.ItemsToBeSearched;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by aleks_000 on 3/6/2017.
 */
public class SearchItemsByExcel extends CommonAPI {

    @Test
    public void Search() throws IOException, InterruptedException {

        //create instance of excel file reader class
        dataToSearch.ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();

        //PageFactory class init
        PageFactorySearch.SearchItems search = PageFactory.initElements(driver, PageFactorySearch.SearchItems.class);

        String[] value = itemsToBeSearched.getData();

        for (int i = 1; i< value.length; i++){

            search.SearchFor(value[i]);
            sleepFor(2);
            search.clearSearchInput();
        }
    }


}
