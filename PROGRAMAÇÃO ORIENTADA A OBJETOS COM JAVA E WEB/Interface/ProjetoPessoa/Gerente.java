package br.fiap.pessoa;

public class Gerente extends Empregado implements Bonus, Salario {

	private Double salario;
	private Double bonus;

	public Gerente(String nome, String cpf, String matricula, Double salario, Double bonus) {
		super(nome, cpf, matricula);
		this.salario = salario;
		this.bonus = bonus;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularBonus() {
		// TODO Auto-generated method stub
		return 0;
	}

}
