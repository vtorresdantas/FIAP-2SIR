//1) Implemente o tipo abstrato de dado (TAD) da operação first.

package FilaSequencialExercicios;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] dados = new int[3]; // vetor de N elementos
		int ini = 0;

		first(dados, ini);

	}

	public static void first(int[] dados, int ini) {

		int e = dados[ini];

		System.out.println("o Valor (" + e + ") é o inicio da fila");
	}

}

//modulo first()
//inicio
//inicio = dados[ini]
//fim
