package ProjetoAluno;

public class Aluno {

	// Atributos ou propriedades ou variavél de instância (= objeto)

	String nome;
	int rm;
	double nota1;
	double nota2;

	// Método para calcular e retornar a média do aluno

	public double calcularMedia() {

		return ((nota1 + nota2) / 2);
	}

}
