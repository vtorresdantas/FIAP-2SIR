package ProjetoAluno;

public class Aluno {

	// Atributos ou propriedades ou variav�l de inst�ncia (= objeto)

	String nome;
	int rm;
	double nota1;
	double nota2;

	// M�todo para calcular e retornar a m�dia do aluno

	public double calcularMedia() {

		return ((nota1 + nota2) / 2);
	}

}
