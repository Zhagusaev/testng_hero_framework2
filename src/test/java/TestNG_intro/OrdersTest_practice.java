package TestNG_intro;

import Pages.WebOrderPage;
import Utilities.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrdersTest_practice  extends TestBase {

    WebOrderPage page = new WebOrderPage();



@DataProvider(name = "order")
    public Object [][] getData(){
    return new Object [][]{
            {"Jon Wick","4646 w Forster ave","Chicago","Illinois","60645"},
            {"Adam Hendesron","2233 e Montrose ave","Bishkek","Chuy","60606"},
    };
}



@Test(dataProvider = "order")
    public void test(String customerName,String street, String city, String state, String zipCode){

    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Process.aspx");

    page.customerName.sendKeys(customerName);
    page.street.sendKeys(street);
    page.city.sendKeys(city);
    page.state.sendKeys(state);
    page.zipCode.sendKeys(zipCode);



}
}
