package StepDefinitions;

import Pages.P08_TagSelected;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class D08_TagSelectStepDef {
    P08_TagSelected tag = new P08_TagSelected();

    @And("user select tag cool from popular tags")
    public void user_select_tag_cool_from_popular_tags (){
        tag.getTagCool().click();
    }
    @Then("page load with title containing cool")
    public void page_load_with_title_containing_cool(){
        Assert.assertTrue(Hooks.driver.getTitle().toLowerCase().contains("cool"));
    }
    @And("user select tag game from popular tags")
    public void user_select_tag_game_from_popular_tags(){
        tag.getTagGame().click();
    }
    @Then("page load with title containing game")
    public void page_load_with_title_containing_game(){
        Assert.assertTrue(Hooks.driver.getTitle().toLowerCase().contains("game"));
    }
}
