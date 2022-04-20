package salarioProfessor;

public class Professor {

	// atributos ou propriedades ou variav�is de inst�ncia (= objeto)

	int aulas; // vari�vel relacionada ao valor da hora-atividade
	double horas; // vari�vel relacionada ao valor da hora-aula
	String nome; // vari�vel relacionada ao nome do professor

	// m�todo para calcular e retornar o valor do sal�rio
	public double calcularSalario() {
		double sb, ha, dsr, salario;

		sb = aulas * 4.5 * horas; //sal�rio base
		ha = sb * 0.05; //horas atividades
		dsr = (sb + ha) / 6; //descanso semanal remunerado
		salario = sb + ha + dsr;

		return salario;

	}

}
