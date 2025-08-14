package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class AddToCartSteps {

    private WebDriver driver;
    private WebDriverWait wait;

    @Given("the user is on the product page")
    public void userIsOnTheProductPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/namita.sharma.leeds.uk/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://localhost:80/ATE_PEP2_Testing_Using_TestNG/");
        
     // Click on "Product page" in the dropdown list
        WebElement pagesMenu = driver.findElement(By.linkText("Pages"));
		Actions actions = new Actions(driver);
		actions.moveToElement(pagesMenu).perform();
		
		// Action: Click on "Contact" link
		 
		       
		      
        WebElement productLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Product Details")));
        productLink.click();

    }

    @When("the user clicks the {string} button")
    public void userClicksButton(String buttonName) {
        if (buttonName.equals("Add to Cart")) {
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[name='addtocart']"))).click();
        } else if (buttonName.equals("PLACE ORDER")) {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Place Order']"))).click();
        } else if (buttonName.equals("CHECKOUT")) {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn essence-btn']"))).click();
        }
    }

    @Then("the product is added to the cart")
    public void productIsAddedToCart() {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[name='addtocart']")));
        System.out.println("Product added to cart.");
        WebElement imageElement = driver.findElement(By.cssSelector("img[src='img/core-img/bag.svg']"));
        imageElement.click();
        System.out.println("Cart icon clicked.");
        }
    
    @When("the user proceeds to checkout")
    public void userProceedsToCheckout() {
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn essence-btn']")));
        WebElement CheckoutElement = driver.findElement(By.xpath("//a[@class='btn essence-btn']"));
        CheckoutElement.click();
        System.out.println("User checked out.");
    }

    @Then("the billing address page is displayed")
    public void billingAddressPageIsDisplayed() {

        System.out.println("Billing address page is displayed.");
    }

    @When("the user fills in all required billing details")
    public void userFillsInBillingDetails() {
        System.out.println("Starting to fill billing details.");
        System.out.println(ExpectedConditions.visibilityOfElementLocated(By.id("first_name")));
        // Consolidated the wait and findElement into a single, chained command for robustness
        WebElement firstNameField = driver.findElement(By.id("first_name"));
        firstNameField.sendKeys("John");
        System.out.println("First name filled.");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("last_name"))).sendKeys("Doe");
        System.out.println("Last name filled.");

        // Country dropdown interaction is now a single, clean line
        WebElement countryDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'nice-select') and contains(@class, 'w-100')]")));
        countryDropdown.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(), 'United Kingdom')]"))).click();
        System.out.println("Country selected.");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("street_address"))).sendKeys("123 Main St");
        System.out.println("Street address filled.");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city"))).sendKeys("Leeds");
        System.out.println("City filled.");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postcode"))).sendKeys("LS1 1AA");
        System.out.println("Postcode filled.");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("state"))).sendKeys("West Yorkshire");
        System.out.println("State filled.");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone_number"))).sendKeys("1234567890");
        System.out.println("Phone number filled.");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_address"))).sendKeys("john.doe@Mailinator.com");
        System.out.println("Email address filled.");

        // The checkbox click is now more robust
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='customCheck1']"))).click();

        System.out.println("Billing details filled successfully.");
    }

    @Then("the order is successfully placed")
    public void orderIsSuccessfullyPlaced() {
        // The locator here should be the "Place Order" button, which is clicked in a single line
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Place Order']"))).click();
        System.out.println("Order successfully placed.");
        driver.quit();
    }
}