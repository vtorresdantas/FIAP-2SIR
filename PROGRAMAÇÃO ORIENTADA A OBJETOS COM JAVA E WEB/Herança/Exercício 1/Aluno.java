package br.fiap.aluno;

public abstract class Aluno {

	// atributos que serão compartilhados

	protected String nome;
	protected long rm;
	protected double prova1;
	protected double prova2;

	//construtor para inicializar os atributos
	public Aluno(String nome, long rm, double prova1, double prova2) {

		this.nome = nome;
		this.rm = rm;
		this.prova1 = prova1;
		this.prova2 = prova2;

	}

	public abstract double calcularMedia();

	@Override
	public String toString() {
		String aux = "";

		aux += "RM: " + rm + "\n";
		aux += "Nome: " + nome + "\n";
		aux += "Média " + calcularMedia();

		return aux;
	}

}
