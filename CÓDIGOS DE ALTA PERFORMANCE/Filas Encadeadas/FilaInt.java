package filas;

public class FilaInt {

	private class NO {
		int dado;
		NO prox;
	}

	NO ini, fim;

	public void init() {
		ini = fim = null;
	}

	public boolean isEmpty() {
		if (ini == null && fim == null)
			return true;
		else
			return false;
	}

	public void enqueue(int elem) {
		NO novo = new NO();
		novo.dado = elem;
		novo.prox = null;
		if (isEmpty())
			ini = novo;
		else
			fim.prox = novo;
		fim = novo;
	}

	public int dequeue() {
		int valor = ini.dado;
		ini = ini.prox;
		if (ini == null)
			fim = null;
		return valor;
	}

}
