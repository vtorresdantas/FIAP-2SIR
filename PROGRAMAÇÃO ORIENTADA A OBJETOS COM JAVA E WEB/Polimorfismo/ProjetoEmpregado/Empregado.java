package br.fiap.empregado;

import br.fiap.pessoa.Pessoa;

public abstract class Empregado extends Pessoa {
	protected String matricula;

	public Empregado(String nome, String cpf, String matricula) {
		super(nome, cpf);
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Número da matrícula: " + matricula + "\n";

		return aux;
	}

}
