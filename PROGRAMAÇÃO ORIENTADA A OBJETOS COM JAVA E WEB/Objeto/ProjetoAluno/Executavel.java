package ProjetoAluno;

import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Aluno a = new Aluno(); // instancia��o >= cria��o de um objeto

		// Entrada dos dados
		System.out.println("Informe o seu nome: ");
		a.nome = entrada.nextLine();

		System.out.println("Informe o seu RM: ");
		a.rm = entrada.nextInt();

		System.out.println("Informe a sua nota1: ");
		a.nota1 = entrada.nextDouble();

		System.out.println("Informe a sua nota2: ");
		a.nota2 = entrada.nextDouble();
		
		//Impress�o da m�dia do aluno
		
		System.out.println("Resultado: " + a.calcularMedia());

	}

}
