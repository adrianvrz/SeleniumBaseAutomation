package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class PutHereTheSteps {

    PaginaPrincipal LadingPage = new PaginaPrincipal();

    @Given("I navigate to www.exmaple.com")
    public void i_navigate_to_exampleWeb() {
        LadingPage.navigateToExampleWeb();
    }
    
}
