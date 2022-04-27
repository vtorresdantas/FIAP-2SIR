package br.fiapjuridica.advogado;

public class Advogado {
	private int matricula;
	private String nome;
	private String area;
	
	public Advogado(int matricula, String nome, String area) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.area = area;
	}

	public Advogado(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public String getDados() {
		String aux = "";
		aux += "Matrícula: " + matricula + "\n";
		aux += "Nome: " + nome + "\n";
		aux += "Área: " + area + "\n";
		return aux;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}	
}
