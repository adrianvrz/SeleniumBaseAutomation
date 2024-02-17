package pages;

public class PaginaPrincipal extends BasePage{

    private String searchButton = "//*[@id=\"menu-item-20\"]/a";
    
    public PaginaPrincipal() {
        super(driver);
    }

    //Metoth to navigate to the page www.freerangetesters.com
    public void navigateToExampleWeb() {
        navigateTo("https://www.example.com");
        clickElement(searchButton);
    }
    
}
