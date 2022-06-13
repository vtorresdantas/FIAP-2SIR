package FilaEncadeada;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TipoFilaEncadeada fila = new TipoFilaEncadeada();

		fila.init();

		fila.enqueue(6);

		fila.enqueue(5);

		fila.dequeue();

		System.out.println(fila.dequeue());

	}

}
