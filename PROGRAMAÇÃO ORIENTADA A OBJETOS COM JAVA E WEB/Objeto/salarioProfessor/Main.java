package salarioProfessor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instancia��o --> gerar objeto
		Scanner teclado = new Scanner(System.in);
		Professor professor = new Professor();

		// entrada de dados
		System.out.println("Nome do professor: ");
		professor.nome = teclado.next();
		System.out.println("N�mero de aulas semanais: ");
		professor.aulas = teclado.nextInt();
		System.out.println("Valor da hora-atividade: ");
		professor.horas = teclado.nextDouble();

		System.out.println("Sal�rio final do professor: (" + professor.nome + ") R$ " + professor.calcularSalario());

	}

}
