package tcs.semillero.diego.proyMercadoLibre.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import tcs.semillero.diego.proyMercadoLibre.steps.StepSesion;

public class DefinitionSesion {
	@Steps
	private StepSesion objStepSesion;

	@Given("^ingresar al navegador y a la pagina web$")
	public void ingresarAlNavegadorYALaPaginaWeb() throws Exception {
		objStepSesion.ingresarAlNavegadorYALaPaginaWeb();
	}

	@Given("^ingresar al navegador y a la pagina web con pais diferente a Colombia$")
	public void ingresarAlNavegadorYALaPaginaWebConPaisDiferenteAColombia() throws Exception {
		objStepSesion.ingresarAlNavegadorYALaPaginaWebConPaisDiferenteAColombia();
	}

	@When("^pulsar link inicia e ingresar usuario registrado \"([^\"]*)\"$")
	public void pulsarLinkIniciaEIngresarUsuarioRegistrado(String usuario) throws Exception {
		objStepSesion.pulsarLinkIniciaEIngresarUsuarioRegistrado(usuario);
	}

	@When("^pulsar link inicia e ingresar correo registrado \"([^\"]*)\"$")
	public void pulsarLinkIniciaEIngresarCorreoRegistrado(String correo) throws Exception {
		objStepSesion.pulsarLinkIniciaEIngresarCorreoRegistrado(correo);
	}

	@When("^pulsar link inicia e ingresar correo vacio \"([^\"]*)\"$")
	public void pulsarLinkIniciaEIngresarCorreoVacio(String correo) throws Exception {
		objStepSesion.pulsarLinkIniciaEIngresarCorreoVacio(correo);
	}

	@When("^pulsar link inicia e ingresar correo \"([^\"]*)\"$")
	public void pulsarLinkIniciaEIngresarCorreo(String correo) throws Exception {
		objStepSesion.pulsarLinkIniciaEIngresarCorreo(correo);
	}

	@When("^ingresar clave \"([^\"]*)\"$")
	public void ingresarClave(String clave) throws Exception {
		objStepSesion.ingresarClave(clave);
	}

	@When("^ingresar clave vacia \"([^\"]*)\"$")
	public void ingresarClaveVacia(String clave) throws Exception {
		objStepSesion.ingresarClaveVacia(clave);
	}

	@When("^ingresar clave incorrecta \"([^\"]*)\"$")
	public void ingresarClaveIncorrecta(String clave) throws Exception {
		objStepSesion.ingresarClaveIncorrecta(clave);
	}

	@When("^pulsar boton no se mi clave$")
	public void pulsarBotonNoSeMiClave() throws Exception {
		objStepSesion.pulsarBotonNoSeMiClave();
	}

	@Then("^verificar redireccion a opciones de recuperacion$")
	public void verificarRedireccionAOpcionesDeRecuperacion() throws Exception {
		objStepSesion.verificarRedireccionAOpcionesDeRecuperacion();
	}

	@Then("^verificar que se solicite clave$")
	public void verificarQueSeSoliciteClave() throws Exception {
		objStepSesion.verificarQueSeSoliciteClave();
	}

	@Then("^verificar inicio de sesion$")
	public void verificarInicioDeSesion() throws Exception {
		objStepSesion.verificarInicioDeSesion();
	}

	@Then("^verificar mensaje de error completa dato$")
	public void verificarMensajeDeErrorCompletaDato() throws Exception {
		objStepSesion.verificarMensajeDeErrorCompletaDato();
	}

	@Then("^verificar mensaje de error revisa tu Email o usuario$")
	public void verificarMensajeDeErrorRevisaTuEmailOUsuario() throws Exception {
		objStepSesion.verificarMensajeDeErrorRevisaTuEmailOUsuario();
	}

	@Then("^verificar mensaje de error revisa clave$")
	public void verificarMensajeDeErrorRevisaClave() throws Exception {
		objStepSesion.verificarMensajeDeErrorRevisaClave();
	}

	@Then("^verificar mensaje de error error pais$")
	public void verificarMensajeDeErrorErrorPais() throws Exception {
		objStepSesion.verificarMensajeDeErrorErrorPais();
	}

}
