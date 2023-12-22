package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

import java.io.IOException;

import elementos.ElementosWeb;

public class Steps {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	/*
	 * @Given("que eu esteja no site")
	 * 
	 * public void que_eu_esteja_no_site() {
	 * metodos.abrirNavegador("https://www.google.com.br"); }
	 * 
	 * @Given("que eu esteja no {string}") public void que_eu_esteja_no(String site)
	 * {
	 * 
	 * metodos.abrirNavegador(site); }
	 * 
	 * 
	 * @When("informar o nome da escola") public void informar_o_nome_da_escola() {
	 * 
	 * metodos.escrever("E2E treinamentos", el.getPesquisar());
	 * metodos.submit(el.getPesquisar());
	 * 
	 * }
	 * 
	 * @Then("visualizo as informacoes") public void visualizo_as_informacoes() {
	 * metodos.fecharNavegador("Encerrando o teste");
	 * 
	 * }
	 */

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {

		metodos.abrirNavegador(site);
	}
	
	
	
	
	
	

	@When("pesquisar {string}")
	public void pesquisar(String texto) throws IOException {

		metodos.escrever(texto, el.getPesquisar(), "escrevendo " + texto);
		metodos.submit(el.getPesquisar());

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @Then("valido {string}") public void valido(String string) {
	 * 
	 * System.out.println("Teste finalizado"); metodos.fecharNavegador(string); }
	 */
	@Then("valido escola {string}")
	public void valido_escola(String textoEsperado) {

		metodos.validarTexto(textoEsperado, el.getE2etreinamentos());
		metodos.fecharNavegador();
	}

	@Then("valido inovacao {string}") 
	public void valido_inovacao(String textoEsperado) {
		metodos.validarTexto(textoEsperado, el.getInovacao());
		metodos.fecharNavegador();

	}

	@Then("valido felicidade {string}")
	public void valido_felicidade(String textoEsperado) {
		metodos.validarTexto(textoEsperado, el.getFelicidade());
		metodos.fecharNavegador();

	}

	@Then("visualizo as {string}")
	public void visualizo_as(String teste) throws IOException {
		
		metodos.screenShot(teste);
		metodos.fecharNavegador();

	}


}

