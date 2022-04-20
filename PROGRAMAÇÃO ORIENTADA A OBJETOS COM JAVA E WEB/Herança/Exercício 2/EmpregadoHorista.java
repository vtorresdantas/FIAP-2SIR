package br.fiap.empregado;

public class EmpregadoHorista extends Empregado {

	private int totalDeHorasTrabalhadas;
	private double valorDaHoraTrabalhada;

	public EmpregadoHorista(long matricula, String nome) {
		super(matricula, nome);
		this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
		this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
	}

	@Override
	public double calcularSalario() {
		return totalDeHorasTrabalhadas * valorDaHoraTrabalhada;
	}

	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Salário: R$" + calcularSalario();
		return aux;
	}

}
