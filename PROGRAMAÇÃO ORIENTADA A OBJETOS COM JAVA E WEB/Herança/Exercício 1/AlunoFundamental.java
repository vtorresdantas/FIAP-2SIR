package br.fiap.aluno;

public class AlunoFundamental extends Aluno {

	public AlunoFundamental(String nome, long rm, double prova1, double prova2, int serie) {
		super(nome, rm, prova1, prova2);
		this.serie = serie;
	}

	// atributo específico
	private int serie;

	public double calcularMedia() {

		return (prova1 + prova2) / 2;

	}

}
