package TipoPilha;

public class TipoPilhaInt {

	// os atributos "dados" e "topo" formam uma pilha
	public final int N = 6;
	int[] dados = new int[N]; // vetor de N elementos
	int topo;

	// Invocação dos métodos

	public void init() {
		topo = 0;

	}

	public boolean isEmpty() {
		if (topo == 0)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (topo == N)
			return true;
		else
			return false;
	}

	public void push(int elem) {
		if (isFull() == false) {
			dados[topo] = elem;
			topo++;
		} else {
			System.out.println("Stack Overflow");
		}

	}

	public int pop() {
		topo--;
		return (dados[topo]);
	}
}
