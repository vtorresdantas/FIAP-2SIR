package filas;

public class FilaString {

	private class NO {
		String dado;
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

	public void enqueue(String elem) {
		NO novo = new NO();
		novo.dado = elem;
		novo.prox = null;
		if (isEmpty())
			ini = novo;
		else
			fim.prox = novo;
		fim = novo;
	}

	public String dequeue() {
		String valor = ini.dado;
		ini = ini.prox;
		if (ini == null)
			fim = null;
		return valor;
	}

}
