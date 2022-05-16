package br.fiap.pessoa;

public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		String aux = "";
		aux = "CPF: " + cpf + "\n";
		aux += "Nome: " + nome + "\n";
		return aux;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
