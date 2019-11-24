package tcs.semillero.diego.proyMercadoLibre.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://mercadolibre.com")
public class PageHome extends PageObject {
	@FindBy(xpath = "//a[@id='CO']")
	private WebElementFacade btnPaisColombia;
	@FindBy(xpath = "//a[@id='PA']")
	private WebElementFacade btnPaisPanama;
	public WebElementFacade getBtnPaisColombia() {
		return btnPaisColombia;
	}

	public WebElementFacade getBtnPaisPanama() {
		return btnPaisPanama;
	}
}