package tcs.semillero.diego.proyMercadoLibre.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PageRecuperarClave extends PageObject {
	@FindBy(xpath = "//b[contains(text(),'aulaambientalentrenubes@gmail.com')]")
	WebElementFacade objRecuperarClave;

	public WebElementFacade getObjRecuperarClave() {
		return objRecuperarClave;
	}
}
