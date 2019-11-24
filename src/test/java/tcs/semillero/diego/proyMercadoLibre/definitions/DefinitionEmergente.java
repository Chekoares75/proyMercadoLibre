package tcs.semillero.diego.proyMercadoLibre.definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import tcs.semillero.diego.proyMercadoLibre.steps.StepEmergente;

public class DefinitionEmergente {
	@Steps
	StepEmergente objStepEmergente;
	
	@When("^ingresar elemento de busqueda para adulto \"([^\"]*)\"$")
	public void ingresarElementoDeBusquedaParaAdulto(String adulto) throws Exception {
		objStepEmergente.ingresarElementoDeBusquedaParaAdulto(adulto);
	}


	@Then("^verificar que aparezca el emergente$")
	public void verificarQueAparezcaElEmergente() throws Exception {
		objStepEmergente.verificarQueAparezcaElEmergente();
	}

	@When("^pulsar boton ver resultados$")
	public void pulsarBotonVerResultados() throws Exception {
		objStepEmergente.pulsarBotonVerResultados();
	}

	@Then("^verificar se realice la busqueda$")
	public void verificarSeRealiceLaBusqueda() throws Exception {
		objStepEmergente.verificarSeRealiceLaBusqueda();
	}
	
	@When("^pulsar boton no ver resultados$")
	public void pulsarBotonNoVerResultados() throws Exception {
		objStepEmergente.pulsarBotonNoVerResultados();
	}

	@Then("^verificar que no aparezca el contenido de la busqueda$")
	public void verificarQueNoAparezcaElContenidoDeLaBusqueda() throws Exception {
		objStepEmergente.verificarQueNoAparezcaElContenidoDeLaBusqueda();
	}

	@When("^pulsar fuera del emergente$")
	public void pulsarFueraDelEmergente() throws Exception {
		objStepEmergente.pulsarFueraDelEmergente();
	}

	@When("^pulsar boton cerrar emergente$")
	public void pulsarBotonCerrarEmergente() throws Exception {
		objStepEmergente.pulsarBotonCerrarEmergente();
	}
}
