package FilaSequencial;

public class FilaSequencialInt {

	public final int N = 3;
	int[] dados = new int[N]; // vetor de N elementos
	int ini, fim, cont;

	// Invocação dos métodos

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

	public int dequeue() {

		int e = dados[ini];
		ini = (ini + 1) % N;
		cont--;

		return e;

	}

	public void first() {

		int e = dados[ini];

		System.out.println("o Valor (" + e + ") é o inicio da fila");
	}

}
