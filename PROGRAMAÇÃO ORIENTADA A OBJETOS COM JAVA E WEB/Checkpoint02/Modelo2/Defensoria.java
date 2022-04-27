package br.fiapjuridica.defensoria;

import br.fiapjuridica.processo.Processo;

public class Defensoria {
	private Processo[] lista;
	private int indice;
	
	public Defensoria(int tamanho) {
		lista = new Processo[tamanho];
	}
	
	public void inserir(Processo processo) {
		if(indice < lista.length) {
			lista[indice] = processo;
			indice++;
		}
	}
	
	public void encerrar(int codigo, String dataEncerramento) {
		for(int i = 0; i < lista.length; i++) {
			if(lista[i].getCodigo() == codigo) {
				lista[i].setDataEncerramento(dataEncerramento);
			}
		}
	}
	
	public String listar() {
		String aux = "";
		for(int i = 0; i < lista.length; i++) {
			aux += lista[i].getDados() + "\n";
		}
		return aux;
	}
}
