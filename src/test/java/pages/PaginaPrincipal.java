package pages;

public class PaginaPrincipal extends BasePage{

    private String searchButton = "//a[@href='/selenium-y-cucumber-java'][normalize-space()='Ver curso']";
    
    public PaginaPrincipal() {
        super(driver);
    }

    //Metoth to navigate to the page www.freerangetesters.com
    public void navigateToFreeRangerTesters() {
        navigateTo("https://www.freerangetesters.com");
        clickElement(searchButton);
    }
    
}
