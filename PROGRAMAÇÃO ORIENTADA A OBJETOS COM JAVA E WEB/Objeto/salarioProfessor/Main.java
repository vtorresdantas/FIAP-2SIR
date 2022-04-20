package salarioProfessor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciação --> gerar objeto
		Scanner teclado = new Scanner(System.in);
		Professor professor = new Professor();

		// entrada de dados
		System.out.println("Nome do professor: ");
		professor.nome = teclado.next();
		System.out.println("Número de aulas semanais: ");
		professor.aulas = teclado.nextInt();
		System.out.println("Valor da hora-atividade: ");
		professor.horas = teclado.nextDouble();

		System.out.println("Salário final do professor: (" + professor.nome + ") R$ " + professor.calcularSalario());

	}

}
