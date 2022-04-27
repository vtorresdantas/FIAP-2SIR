package br.fiapmusic.playlist;

import br.fiapmusic.musica.*;

public class Playlist {

	private Musica[] lista;
	private int indice;

	public Playlist(int tamanho) {
		lista = new Musica[tamanho];
	}

	public void inserir(Musica musica) {

		if (indice < lista.length) {
			lista[indice] = musica;
			indice++;
		}

	}

	public void tocar(String titulo) {

		int total;
		
		for (int i = 0; i < indice; i++) {
			if (lista[i].getTitulo().equalsIgnoreCase(titulo)) {
				total = lista[i].getTotal();
				lista[i].setTotal(total+1);
			}
		}

	}

	public String listar() {

		String aux = "";

		for (int i = 0; i < indice; i++) {
			aux += lista[i].getDados() + "\n";

		}

		return aux;

	}
}
