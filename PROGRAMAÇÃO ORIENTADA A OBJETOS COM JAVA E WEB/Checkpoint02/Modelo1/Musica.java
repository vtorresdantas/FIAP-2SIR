package br.fiapmusic.musica;

import br.fiapmusic.cantor.Cantor;

public class Musica {

	// atributos

	private String titulo;
	private String genero;
	private int total;
	private Cantor cantor;

	public Musica(String titulo, String genero, Cantor cantor) {
		this.titulo = titulo;
		this.genero = genero;
		this.cantor = cantor;

	}

	public String getDados() {

		String aux = "";

		aux += "Titulo da m�sica: " + titulo + "\n";
		aux += "G�nero da m�sica: " + genero + "\n";
		aux += "Cantor da m�sica: " + cantor.getDados();
		aux += "Total de execu��es: " + total + "\n";

		return aux;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Cantor getCantor() {
		return cantor;
	}

	public void setCantor(Cantor cantor) {
		this.cantor = cantor;
	}
	
	

}
