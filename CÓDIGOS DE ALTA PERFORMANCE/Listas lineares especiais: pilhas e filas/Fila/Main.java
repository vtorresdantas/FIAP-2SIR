package FilaSequencial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FilaSequencialInt fila = new FilaSequencialInt();

		fila.init();
		fila.enqueue(23);
		fila.enqueue(66);
		fila.enqueue(17);
		// fila.enqueue(32);

		if (!fila.isEmpty())
			System.out.println("Valor retirado da fila: " + fila.dequeue());
		if (!fila.isEmpty())
			System.out.println("Valor retirado da fila: " + fila.dequeue());
		if (!fila.isEmpty())
			System.out.println("Valor retirado da fila: " + fila.dequeue());
		if (!fila.isEmpty())
			System.out.println("Valor retirado da fila: " + fila.dequeue());
		
		fila.first();
		
		

	}

}
