package Pilha;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TipoPilhaInt pilha = new TipoPilhaInt();
		pilha.init();

		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);
		pilha.push(5);
		pilha.push(6);

		pilha.push(1); // E
		
		System.out.println("Valor retirado: " + pilha.pop()); // D
		
		pilha.push(2); // E
		
		System.out.println("Valor retirado: " + pilha.pop()); // D
		
		pilha.push(3); // E
		pilha.push(4); // E
		pilha.push(5); // E
		
		System.out.println("Valor retirado: " + pilha.pop()); // D
		
		System.out.println("Valor retirado: " + pilha.pop()); // D
		
		System.out.println("Valor retirado: " + pilha.pop()); // D
		
		pilha.push(6); // E
		
		System.out.println("Valor retirado: " + pilha.pop()); // D

	}

}
