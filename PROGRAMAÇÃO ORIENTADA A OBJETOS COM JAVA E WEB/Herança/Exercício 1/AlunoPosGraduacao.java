package br.fiap.aluno;

public class AlunoPosGraduacao extends Aluno {

	public AlunoPosGraduacao(String nome, long rm, double prova1, double prova2) {
		super(nome, rm, prova1, prova2);
		// TODO Auto-generated constructor stub
	}

	public double calcularMedia() {

		return prova1 * 0.40 + prova2 * 0.60;

	}

}
