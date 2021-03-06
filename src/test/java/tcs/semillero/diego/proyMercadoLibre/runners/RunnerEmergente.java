package tcs.semillero.diego.proyMercadoLibre.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/emergente.feature", glue= {"tcs.semillero.diego.proyMercadoLibre.definitions"}, snippets = SnippetType.CAMELCASE)
public class RunnerEmergente {

}
