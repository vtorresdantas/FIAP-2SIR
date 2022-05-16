package br.fiap.cliente;

import br.fiap.pessoa.Pessoa;

public class Cliente extends Pessoa {
	private double valorDaDivida;

	public Cliente(String nome, String cpf, double valorDaDivida) {
		super(nome, cpf);
		this.valorDaDivida = valorDaDivida;
	}

	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Valor da dívida: " + valorDaDivida + "\n";

		return aux;
	}

	public double getValorDaDivida() {
		return valorDaDivida;
	}

	public void setValorDaDivida(double valorDaDivida) {
		this.valorDaDivida = valorDaDivida;
	}

}
