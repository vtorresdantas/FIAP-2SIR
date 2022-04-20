package br.fiap.empregado;

public abstract class Empregado {

	// Atributos
	protected long matricula;
	protected String nome;

	// construtor
	public Empregado(long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public abstract double calcularSalario();

	@Override
	public String toString() {
		String aux = "";
		aux = "Empregado matricula =" + matricula + "\n";
		aux = "nome = " + nome + "\n";
		return aux;
	}

	public long getMatricula() {
		return matricula;
	}

}
