package br.fiapjuridica.processo;

import br.fiapjuridica.advogado.Advogado;

public class Processo {
	private int codigo;
	private String dataAbertura;
	private String dataEncerramento;
	private String nomeDoCliente;
	private Advogado advogado;
	
	public Processo(int codigo, String dataAbertura, String nomeDoCliente, Advogado advogado) {
		super();
		this.codigo = codigo;
		this.dataAbertura = dataAbertura;
		this.nomeDoCliente = nomeDoCliente;
		this.advogado = advogado;
	}
	
	public String getDados() {
		String aux = "";
		aux += "Código: " + codigo + "\n";
		aux += "Data de abertura: " + dataAbertura + "\n";
		aux += "Data de encerramento: " + dataEncerramento + "\n";
		aux += "Nome do cliente: " + nomeDoCliente + "\n";
		aux += advogado.getDados() + "\n";
		return aux;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(String dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public Advogado getAdvogado() {
		return advogado;
	}

	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}	
}
