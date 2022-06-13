package FilaEncadeada;

public class TipoFilaEncadeada {

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

	public void enqueue(int valor) {
		NO novo = new NO();
		novo.dado = valor;
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
