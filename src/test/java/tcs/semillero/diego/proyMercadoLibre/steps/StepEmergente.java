package tcs.semillero.diego.proyMercadoLibre.steps;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import tcs.semillero.diego.proyMercadoLibre.pageObjects.PageHomeColombia;

public class StepEmergente {
	PageHomeColombia objPageHomeColombia;
	@Step
	public void ingresarElementoDeBusquedaParaAdulto(String adulto) throws Exception {
		objPageHomeColombia.establecerItem(adulto);
		objPageHomeColombia.getBtnBuscar().click();
	}

	@Step
	public void verificarQueAparezcaElEmergente() throws Exception {
		Assert.assertEquals(true, objPageHomeColombia.getBtnVerResultados().isVisible());
	}
	@Step
	public void pulsarBotonVerResultados() throws Exception {
		objPageHomeColombia.getBtnVerResultados().click();
		
	}
	@Step
	public void verificarSeRealiceLaBusqueda() throws Exception {
		Assert.assertEquals(true,objPageHomeColombia.getLblAdultos().isVisible());
	}
	
	@Step
	public void pulsarBotonNoVerResultados() throws Exception {
		objPageHomeColombia.getBtnNoVerResultados().click();
	}

	@Step
	public void verificarQueNoAparezcaElContenidoDeLaBusqueda() throws Exception {
		Assert.assertEquals(true,objPageHomeColombia.getTxtBuscarItems().getText().equals(""));
	}

	@Step
	public void pulsarFueraDelEmergente() throws Exception {
		objPageHomeColombia.getDskFueraEmergente().click();
	}

	@Step
	public void pulsarBotonCerrarEmergente() throws Exception {
		objPageHomeColombia.getBtnCerrarEmergente().click();
	}
}
