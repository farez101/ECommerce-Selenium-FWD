package StepDefinitions;

import Pages.P07_ColorFilter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class D07_ColorFilterStepDef {

    P07_ColorFilter colFil = new P07_ColorFilter();
    @When("user hover on Apparel and selects shoes subcategory")
    public void user_hover_on_Apparel_and_selects_shoes_subcategory(){
        colFil.hover_Apparel_select_shoes();
    }

    @And("user filter with color red")
    public void user_filter_with_color_red() throws InterruptedException {
        colFil.getFilterColorRed().click();
        Thread.sleep(1500);
    }

    @Then("user check that only one shoe is appearing")
    public void user_check_that_only_one_shoe_is_appearing(){

        SoftAssert soft = new SoftAssert();
        int sizeResult = colFil.getResultOfProductSearch().size();
        System.out.println(sizeResult);
        soft.assertTrue(sizeResult==1);
        soft.assertAll();

    }
}
