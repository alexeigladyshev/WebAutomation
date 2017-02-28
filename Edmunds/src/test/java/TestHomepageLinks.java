import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by aleks_000 on 2/20/2017.
 */
public class TestHomepageLinks extends CommonAPI {

    @Test
    public void TestMakeButton(){

        driver.findElement(By.xpath(".//option[@value='honda']")).click();
        driver.findElement(By.xpath(".//option[@value='civic'][contains(text(), 'Civic Sedan')]")).click();
        driver.findElement(By.xpath(".//option[@value = '2015']")).click();
        driver.findElement(By.xpath(".//*[@id='edm-entry-home-page-hero-carousel']/div/div[12]/div/div[1]/div[4]/div/button[1]")).
                click();

    }
}
