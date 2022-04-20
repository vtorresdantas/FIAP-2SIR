//Elabore um m�todo (main) que simule a entrada de alunos
//em uma fila de atendimento e seu atendimento. Para tanto,
//criar um menu com as seguintes op��es:
//1) Insere o aluno na fila (identificado por seu RM).
//2) Retira o aluno da fila para o atendimento.
//3) Encerra o programa (s� poder� ser encerrado se a fila estiver vazia)

package FilaSequencial;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		exercicio02 fila = new exercicio02();

		fila.init();
		Scanner le = new Scanner(System.in);
		int op;
		do {
			System.out.println("Digite \n\t1- Inserir aluno \n\t2- Atender aluno" + "\n\t3- Sair\n Op��o: ");
			op = le.nextInt();
			switch (op) {
			case 1:
				System.out.print("Informe RM: ");
				int rm = le.nextInt();
				fila.enqueue(rm);
				break;
			case 2:
				if (!fila.isEmpty())
					System.out.println("Aluno chamado para atendimento: " + fila.dequeue());
				else
					System.out.println("N�o h� aluno para atender agora");
				break;
			case 3:
				if (fila.isEmpty())
					System.out.println(" Encerrando o atendimento de hoje");
				else {
					op = 0;
					System.out.println("Ainda h� aluno para ser atendido");
				}
				break;
			default:
				System.out.println("Op��o inv�lida!");
			}
		} while (op != 3);
	}

}
