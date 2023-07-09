package steps;

import java.io.IOException;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import pages.Formulario;
import pages.Metodos;

public class FormularioTest extends Metodos {

	Metodos metodos = new Metodos();
	Formulario formulario = new Formulario();

	@Dado("que eu esteja no formulario")
	public void que_eu_esteja_no_formulario() {

		metodos.abrirBrowser("file:///C:/Users/Consultor/Documents/Importante/Pir%C3%A2mide%20de%20Testes/index.html");

	}

	@Quando("eu preencher e enviar o formulario")
	public void eu_preencher_e_enviar_o_formulario() throws IOException {
		formulario.preencherFormulario("Juliana Santos", "juliana.santos@e2etreinamentos.com.br", "Teste UI concluido com sucesso");

	}

	@Então("sou direcionado para o site da escola")
	public void sou_direcionado_para_o_site_da_escola() {
		metodos.validarTitle("E2E Treinamentos – Cursos Tech");

	}

}
