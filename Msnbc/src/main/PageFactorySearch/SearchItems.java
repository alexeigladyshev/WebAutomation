package PageFactorySearch;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by aleks_000 on 3/6/2017.
 */
public class SearchItems {

    @FindBy (how = How.XPATH, using = ".//*[@id='site_search_text']")
    public static WebElement SearchInput;

    @FindBy (how = How.XPATH, using = ".//*[@id='site-search']/input[2]")
    public static WebElement SearchSubmit;

    public void SearchFor(String item) {SearchInput.sendKeys(item, Keys.ENTER);}
    public void clearSearchInput() {SearchInput.clear(); }
}
