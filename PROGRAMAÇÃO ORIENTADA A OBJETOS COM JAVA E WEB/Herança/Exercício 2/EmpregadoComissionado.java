package br.fiap.empregado;

public class EmpregadoComissionado extends Empregado {

	private double totalDeVendas;
	private double comissao;

	public EmpregadoComissionado(long matricula, String nome) {
		super(matricula, nome);
		this.totalDeVendas = totalDeVendas;
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		return totalDeVendas * comissao / 100;
	}

	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Salário: R$" + calcularSalario();
		return aux;
	}

}
