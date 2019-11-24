package tcs.semillero.diego.proyMercadoLibre.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PageSesion extends PageObject {
	@FindBy(xpath = "//input[@id='user_id']")
	private WebElementFacade txtEmailUsuario;
	@FindBy(xpath = "//input[@class='ui-button ui-button--primary auth-button auth-button--user']")
	private WebElementFacade btnAutenticarEmailUsuario;
	@FindBy(xpath = "//input[@id='password']")
	private WebElementFacade txtClave;
	@FindBy(xpath = "//button[@id='action-complete']")
	private WebElementFacade btnAutenticarClave;
	@FindBy(xpath = "//div[@class='ui-form__message']")
	private WebElementFacade lblMensajeError;
	@FindBy(xpath = "//button[@id='action-decline']")
	private WebElementFacade btnNoSeMiClave;
	@FindBy(xpath = "//button[@id='action-complete']")
	private WebElementFacade btnIniciarSesion;

	public void establecerUsuarioOCorreo(String usuarioOCorreo) {
		txtEmailUsuario.sendKeys(usuarioOCorreo);

	}

	public void establecerClave(String clave) {
		txtClave.sendKeys(clave);
	}

	public WebElementFacade getBtnAutenticarEmailUsuario() {
		return btnAutenticarEmailUsuario;
	}

	public WebElementFacade getBtnAutenticarClave() {
		return btnAutenticarClave;
	}

	public WebElementFacade getLblMensajeError() {
		return lblMensajeError;
	}

	public WebElementFacade getBtnNoSeMiClave() {
		return btnNoSeMiClave;
	}

	public WebElementFacade getBtnIniciarSesion() {
		return btnIniciarSesion;
	}

}