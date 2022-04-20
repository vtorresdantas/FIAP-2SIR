package FilaSequencial;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		exercicio02 fila = new exercicio02();
		fila.init();
		Scanner le = new Scanner(System.in);
		int op;
		do {
			System.out.println("1- Submeter processo");
			System.out.println("2- Executar processo");
			System.out.println("3- Shutdown");
			op = le.nextInt();

			switch (op) {
			case 1:
				System.out.print("Informe pid: ");
				int pid = le.nextInt();
				fila.enqueue(pid);
				break;
			case 2:
				if (!fila.isEmpty()) {
					pid = fila.dequeue();
					System.out.println("Processo " + pid + " est� sendo executado");
					System.out.println("Processo foi conclu�do? (1-sim/ 2-n�o)");
					int resp = le.nextInt();
					if (resp == 2)
						fila.enqueue(pid);
					else
						System.out.println("Processo " + pid + " conclu�do");
				}
				break;
			case 3:
				if (fila.isEmpty())
					System.out.println("Shutdown...");
				else {
					System.out.println("Deseja encerrar todos os processos " + "em execu��o? (1-sim/2-n�o)");
					int resp = le.nextInt();
					if (resp == 1) {
						while (!fila.isEmpty())
							System.out.println("Encerrando processo " + fila.dequeue());
						System.out.println("Shutdown...");
					} else
						op = 0;
				}
				break;
			default:
				System.out.println("Op��o inv�lida");
			}
		} while (op != 3);
		le.close();
	}

}
