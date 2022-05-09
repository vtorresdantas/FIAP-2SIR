package br.fiap.pessoa;

public abstract class Pessoa {

	protected String nome;
	protected String cpf;

	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

}
