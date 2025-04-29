package petshop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import petshop.utilities.Driver;

import java.util.List;

public class NavigatePetshopPage  {
   // public class NavigatePetshopPage extends BasePage {

    public NavigatePetshopPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "ps-cta-button")
    public WebElement goShopping;

    @FindBy(xpath = "//header[@class='ps-navigation-container']//div[@class='ps-navigation-item'][2]")
    public List<WebElement> categories;

    @FindBy(xpath = "//a[contains(text(),'Toys')]")
    public WebElement toys;

    @FindBy(xpath = "//a[contains(text(),'Clothes')]")
    public WebElement clothes;

    @FindBy(xpath = "//p[contains(text(),'Cat Scratch Tower (Midi)')]")
    public WebElement scratcTower;

    @FindBy(xpath = "//a[contains(text(),'Add to Cart')]")
    public WebElement addToCart;

    @FindBy(xpath = "//a[contains(text(),'View Cart')]")
    public WebElement viewCart;

    @FindBy(xpath = "//span[contains(text(),'Cat Scratch Tower (Midi)')]")
    public WebElement inCart;

    @FindBy(xpath = "//div[@class='js-close-overlay']")
    public WebElement closePop;

    @FindBy(xpath = "//a[contains(text(),'Purchase')]")
    public WebElement purchase;

    @FindBy(xpath = "//h1[contains(text(),'Purchased Successfuly! ')]")
    public WebElement purchaseSuccess;














}
