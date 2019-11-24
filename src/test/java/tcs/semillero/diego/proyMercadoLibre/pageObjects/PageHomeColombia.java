package tcs.semillero.diego.proyMercadoLibre.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PageHomeColombia extends PageObject {
	@FindBy(xpath = "//nav[@id='nav-header-menu']//a[contains(text(),'Ingresa')]")
	private WebElementFacade btnIngresa;

	@FindBy(xpath = "//input[@placeholder='Buscar productos, marcas y más…']")
	private WebElementFacade txtBuscarItems;

	@FindBy(xpath = "//button[@class='nav-search-btn']")
	private WebElementFacade btnBuscar;

	@FindBy(xpath = "//a[@id=\"saveQuest\"]")
	private WebElementFacade btnVerResultados;

	@FindBy(xpath = "//label[@class=\"adults__modal-close\"]")
	private WebElementFacade btnNoVerResultados;

	@FindBy(xpath = "//label[@class=\"ic-close\"]")
	private WebElementFacade btnCerrarEmergente;

	@FindBy(xpath = "//span[@class='nav-header-username']")
	private WebElementFacade btnSesionIniciada;
	
	@FindBy(xpath = "//h1[@class='breadcrumb__title']")
	private WebElementFacade lblAdultos;
	
	@FindBy(xpath = "//label[@class='modal-label']")
	private WebElementFacade dskFueraEmergente;
	
	
	public void establecerItem(String adulto) {
		txtBuscarItems.sendKeys(adulto);
	}
	

	public WebElementFacade getBtnBuscar() {
		return btnBuscar;
	}

	public WebElementFacade getBtnVerResultados() {
		return btnVerResultados;
	}

	public WebElementFacade getBtnNoVerResultados() {
		return btnNoVerResultados;
	}

	public WebElementFacade getBtnCerrarEmergente() {
		return btnCerrarEmergente;
	}

	public WebElementFacade getBtnIngresa() {
		return btnIngresa;
	}

	public WebElementFacade getBtnSesionIniciada() {
		return btnSesionIniciada;
	}


	public WebElementFacade getTxtBuscarItems() {
		return txtBuscarItems;
	}


	public WebElementFacade getLblAdultos() {
		return lblAdultos;
	}


	public WebElementFacade getDskFueraEmergente() {
		return dskFueraEmergente;
	}
	
}
