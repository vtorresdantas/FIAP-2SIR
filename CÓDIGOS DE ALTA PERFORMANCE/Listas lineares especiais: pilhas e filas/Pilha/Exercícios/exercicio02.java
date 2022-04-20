//2) Implemente a classe TipoFilaInt em JAVA (tipo concreto de dado)

package FilaSequencial;

public class exercicio02 {

	public final int N = 3;
	int[] dados = new int[N]; // vetor de N elementos
	String[] dados2 = new String[N]; // vetor de N elementos
	int ini, fim, cont;

	public void init() {
		ini = fim = cont = 0;

	}

	public boolean isEmpty() {
		if (cont == 0)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (cont == N)
			return true;
		else
			return false;
	}

	public void enqueue(int elem) {
		if (isFull()) {
			System.out.println("Fila cheia");
		} else {
			dados[fim] = elem;
			fim = (fim + 1) % N;
			cont++;

		}

	}

	public void enqueueString(String elem) {
		if (isFull()) {
			System.out.println("Fila cheia");
		} else {

			dados2[fim] = elem;
			fim = (fim + 1) % N;
			cont++;

		}

	}

	public int dequeue() {

		int e = dados[ini];
		ini = (ini + 1) % N;
		cont--;

		return e;

	}

	public String dequeueString() {

		String e = dados2[ini];
		ini = (ini + 1) % N;
		cont--;

		return e;

	}

	public void first() {

		int e = dados[ini];

		System.out.println("o Valor (" + e + ") � o inicio da fila");
	}

}
