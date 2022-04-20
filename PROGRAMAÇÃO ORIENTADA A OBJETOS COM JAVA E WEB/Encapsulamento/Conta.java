
package br.fiap.conta;

import br.fiap.cliente.*;

public class Conta {

	private Cliente cliente;
	private int saldo;
	private String dados;

	public Conta(Cliente cliente, int saldo) {
		super();
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public String getDados() {
		String aux = "";
		aux += "CPF: " + cliente.getCpf() + "\n";
		aux += "Nome: " + cliente.getNome() + "\n";
		aux += "Saldo R$: " + saldo;
		
		return aux;
	}
	
	

}
