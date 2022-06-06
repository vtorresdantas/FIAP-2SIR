package ListasEncadeadas;

import java.util.Scanner;

public class MainTeste {

	public static void main(String[] args) {

		ListaIntCrescente lista = new ListaIntCrescente();
		Scanner le = new Scanner(System.in);

		System.out.print("Informe valor positivo (negativo encerra): ");
		int valor = le.nextInt();
		while (valor >= 0) {
			lista.insere(valor);
			lista.show();
			System.out.print("Informe valor positivo (negativo encerra): ");
			valor = le.nextInt();
		}

		System.out.print("Informe valor positivo para remover (negativo encerra): ");
		valor = le.nextInt();
		while (valor >= 0) {
			lista.remove(valor);
			lista.show();
			System.out.print("Informe valor positivo para remover (negativo encerra): ");
			valor = le.nextInt();
		}
		le.close();

	}

}
