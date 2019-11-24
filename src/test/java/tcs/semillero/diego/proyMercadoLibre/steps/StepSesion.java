package tcs.semillero.diego.proyMercadoLibre.steps;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import tcs.semillero.diego.proyMercadoLibre.pageObjects.PageHome;
import tcs.semillero.diego.proyMercadoLibre.pageObjects.PageHomeColombia;
import tcs.semillero.diego.proyMercadoLibre.pageObjects.PageRecuperarClave;
import tcs.semillero.diego.proyMercadoLibre.pageObjects.PageSesion;

public class StepSesion {
	private PageHome objPageHome;
	private PageHomeColombia objPageHomeColombia;
	private PageSesion objPageSesion;
	private PageRecuperarClave objPageRecuperarClave;

	@Step
	public void ingresarAlNavegadorYALaPaginaWeb() throws Exception {
		objPageHome.open();
		objPageHome.getBtnPaisColombia().click();
	}

	@Step
	public void ingresarAlNavegadorYALaPaginaWebConPaisDiferenteAColombia() throws Exception {
		objPageHome.open();
		objPageHome.getBtnPaisPanama().click();
	}

	@Step
	public void pulsarLinkIniciaEIngresarUsuarioRegistrado(String usuario) throws Exception {
		objPageHomeColombia.getBtnIngresa().click();
		objPageSesion.establecerUsuarioOCorreo(usuario);
		objPageSesion.getBtnAutenticarEmailUsuario().click();
	}

	@Step
	public void pulsarLinkIniciaEIngresarCorreoRegistrado(String correo) throws Exception {
		objPageHomeColombia.getBtnIngresa().click();
		objPageSesion.establecerUsuarioOCorreo(correo);
		objPageSesion.getBtnAutenticarEmailUsuario().click();
	}

	@Step
	public void pulsarLinkIniciaEIngresarCorreoVacio(String correo) throws Exception {
		objPageHomeColombia.getBtnIngresa().click();
		objPageSesion.establecerUsuarioOCorreo(correo);
		objPageSesion.getBtnAutenticarEmailUsuario().click();
	}

	@Step
	public void pulsarLinkIniciaEIngresarCorreo(String correo) throws Exception {
		objPageHomeColombia.getBtnIngresa().click();
		objPageSesion.establecerUsuarioOCorreo(correo);
		objPageSesion.getBtnAutenticarEmailUsuario().click();
	}

	@Step
	public void ingresarClave(String clave) throws Exception {
		objPageSesion.establecerClave(clave);
		objPageSesion.getBtnAutenticarClave().click();
	}

	@Step
	public void ingresarClaveVacia(String clave) throws Exception {
		objPageSesion.establecerClave(clave);
		objPageSesion.getBtnAutenticarClave().click();
	}

	@Step
	public void ingresarClaveIncorrecta(String clave) throws Exception {
		objPageSesion.establecerClave(clave);
		objPageSesion.getBtnAutenticarClave().click();
	}

	@Step
	public void pulsarBotonNoSeMiClave() throws Exception {
		objPageSesion.getBtnNoSeMiClave().click();
	}

	@Step
	public void verificarRedireccionAOpcionesDeRecuperacion() throws Exception {
		Assert.assertEquals(true, objPageRecuperarClave.getObjRecuperarClave().isVisible());
	}

	@Step
	public void verificarQueSeSoliciteClave() throws Exception {
		Assert.assertEquals(true, objPageSesion.getBtnAutenticarClave().isVisible());
	}

	@Step
	public void verificarMensajeDeErrorCompletaDato() throws Exception {
		Assert.assertEquals("Completa este dato.", objPageSesion.getLblMensajeError().getText());
	}

	@Step
	public void verificarMensajeDeErrorRevisaTuEmailOUsuario() throws Exception {
		Assert.assertEquals("Revisa tu e-mail o usuario.", objPageSesion.getLblMensajeError().getText());
	}

	@Step
	public void verificarMensajeDeErrorRevisaClave() throws Exception {
		Assert.assertEquals("Revisa tu clave.", objPageSesion.getLblMensajeError().getText());
	}

	@Step
	public void verificarMensajeDeErrorErrorPais() throws Exception {
		Assert.assertEquals("Ingresaste un e-mail o usuario de Mercado Libre Colombia",
				objPageSesion.getLblMensajeError().getText());
	}

	@Step
	public void verificarInicioDeSesion() throws Exception {
		objPageHomeColombia.getBtnSesionIniciada().getText();
	}
}
