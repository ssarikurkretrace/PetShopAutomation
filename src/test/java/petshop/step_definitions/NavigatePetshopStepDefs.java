package petshop.step_definitions;

import petshop.pages.NavigatePetshopPage;
import petshop.utilities.BrowserUtils;
import petshop.utilities.ConfigurationReader;
import petshop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class NavigatePetshopStepDefs {
    protected NavigatePetshopPage navigate;

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {
        //To open main page
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user clicks go shopping")
    public void the_user_clicks_go_shopping() {
        navigate = new NavigatePetshopPage();
        navigate.goShopping.click();

    }
    @Then("Then the user should see following options")
    public void then_the_user_should_see_following_options(List<String> menuOptions) {
        BrowserUtils.waitFor(2);
        //get the list of webelement and convert them to list of string and assert
        List<String> actualOptions = BrowserUtils.getElementsText(navigate.categories);

        Assert.assertEquals(menuOptions,actualOptions);
        System.out.println("menuOptions = " + menuOptions);
        System.out.println("actualOptions = " + actualOptions);

    }

    @Then("user clicks {string}")
    public void user_clicks(String clickCategory) {

        if (clickCategory.equals("Toys")){
            navigate.toys.click();

        }else if(clickCategory.equals("Clothes")){
            navigate.clothes.click();

        }
    }

    @Then("user on the {string} page")
    public void user_on_the_page(String clickedCategory) {
        if (clickedCategory.equals("Toys")){

            Assert.assertTrue(Driver.get().getCurrentUrl().contains("toys"));


        }else if(clickedCategory.equals("Clothes")){
            Assert.assertTrue(Driver.get().getCurrentUrl().contains("clothing"));

        }
    }

    @When("user can add product to cart")
    public void user_can_add_product_to_cart() throws InterruptedException {
        navigate.scratcTower.click();
       // BrowserUtils.waitForClickablility(navigate.addToCart,15);
        Thread.sleep(5000);
//        Actions actions = new Actions(Driver.get());
//        actions.moveToElement(navigate.addToCart).click().perform();
       // BrowserUtils.waitForVisibility(navigate.viewCart,5);
        Thread.sleep(5000);

        navigate.addToCart.click();
        //BrowserUtils.waitFor(5);

        navigate.viewCart.click();

       // navigate.closePop.click();

    }

    @Then("verify product on the cart")
    public void verify_product_on_the_cart() {

        Assert.assertTrue(navigate.inCart.getText().contains("Cat Scratch Tower (Midi)"));

    }


    @Then("verify user can buy product")
    public void verify_user_can_buy_product() throws InterruptedException {

        Thread.sleep(5000);

        navigate.purchase.click();
        Thread.sleep(5000);
        Assert.assertTrue(navigate.purchaseSuccess.getText().contains("Purchased Successfuly!"));





    }









}
