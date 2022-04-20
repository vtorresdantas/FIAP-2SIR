package FilaSequencial;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {

		exercicio02 fila = new exercicio02();
		fila.init();
		Scanner le = new Scanner(System.in);
		int op;
		do {
			System.out.println("1- Inserir paciente para consulta");
			System.out.println("2- Chamar o paciente");
			System.out.println("3- Encerrar o programa");
			op = le.nextInt();

			switch (op) {
			case 1:
				System.out.print("Informe o nome do cliente: ");
				String cliente = le.next();
				fila.enqueueString(cliente);
				break;
			case 2:
				if (!fila.isEmpty()) {
					cliente = fila.dequeueString();
					System.out.println("Processo " + cliente + " está sendo executado");
					System.out.println("Processo foi concluído? (1-sim/ 2-não)");
					int resp = le.nextInt();
					if (resp == 2)
						fila.enqueueString(cliente);
					else
						System.out.println("Processo " + cliente + " concluído");
				}
				break;
			case 3:
				if (fila.isEmpty())
					System.out.println("Desligando o programa...");
				else {
					System.out.println("Deseja encerrar todos os processos " + "em execução? (1-sim/2-não)");
					int resp = le.nextInt();
					if (resp == 1) {
						while (!fila.isEmpty())
							System.out.println("Encerrando processo " + fila.dequeueString());
						System.out.println("Shutdown...");
					} else
						op = 0;
				}
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (op != 3);
		le.close();
	}

}
