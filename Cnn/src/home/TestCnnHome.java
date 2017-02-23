package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import javax.smartcardio.CommandAPDU;

/**
 * Created by PIIT_NYA on 12/31/2016.
 */
public class TestCnnHome extends CommonAPI{

    @Test
    public void testHome(){
        clickByXpath(".//*[@id='nav']/div[2]/div[2]/a[2]");


        //By headline = By.xpath("html/body/div[6]/section[1]/div[1]/div[2]/div/a/h2");
        clickByXpath("html/body/div[6]/section[1]/div[1]/div[2]/div/a/h2");

        navigateBack();
        //clickByXpath(".//*[@id='nav']/div[2]/div[2]/a[3]");

    }

}
