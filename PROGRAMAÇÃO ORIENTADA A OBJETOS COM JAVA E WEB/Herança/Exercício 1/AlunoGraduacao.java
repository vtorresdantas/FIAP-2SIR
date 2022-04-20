package br.fiap.aluno;

public class AlunoGraduacao extends Aluno {

	public AlunoGraduacao(String nome, long rm, double prova1, double prova2, String curso, double trabalho) {
		super(nome, rm, prova1, prova2);
		this.curso = curso;
		this.trabalho = trabalho;
	}

	// atributo específico
	private String curso;
	private double trabalho;

	public double calcularMedia() {

		return (prova1 + prova2) / 2 * 0.7 + trabalho * 0.30;

	}

}
