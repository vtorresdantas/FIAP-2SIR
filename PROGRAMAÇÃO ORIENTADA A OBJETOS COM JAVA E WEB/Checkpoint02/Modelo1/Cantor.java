package br.fiapmusic.cantor;

public class Cantor {

	// atributos
	private String nome;
	private String nacionalidade;

	public Cantor(String nome, String nacionalidade) {

		this.nome = nome;
		this.nacionalidade = nacionalidade;

	}

	public Cantor(String nome) {
		this.nome = nome;
	}

	public String getDados() {

		String aux = "";

		aux += "Nome: " + nome + "\n";
		aux += "Nacionalidade: " + nacionalidade + "\n";

		return aux;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

}
