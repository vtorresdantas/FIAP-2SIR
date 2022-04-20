package salarioProfessor;

public class Professor {

	// atributos ou propriedades ou variavéis de instância (= objeto)

	int aulas; // variável relacionada ao valor da hora-atividade
	double horas; // variável relacionada ao valor da hora-aula
	String nome; // variável relacionada ao nome do professor

	// método para calcular e retornar o valor do salário
	public double calcularSalario() {
		double sb, ha, dsr, salario;

		sb = aulas * 4.5 * horas; //salário base
		ha = sb * 0.05; //horas atividades
		dsr = (sb + ha) / 6; //descanso semanal remunerado
		salario = sb + ha + dsr;

		return salario;

	}

}
