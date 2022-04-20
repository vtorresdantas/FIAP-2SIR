package br.fiap.main;

import br.fiap.cliente.Cliente;
import br.fiap.conta.Conta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta[] conta = new Conta[3];

		conta[0] = new Conta(new Cliente("362", "vitor"), 50000);
		conta[1] = new Conta(new Cliente("123", "matheus"), 2500);
		conta[2] = new Conta(new Cliente("123", "matheus"), 5000);

		for (Conta c : conta) {
			System.out.println(c.getDados());
		}

	}

}
