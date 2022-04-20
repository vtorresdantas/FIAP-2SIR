package br.fiap.controle;

import br.fiap.empregado.*;

public class Controle {

	private Empregado[] lista;
	private int indice;

	public Controle(int tamanho) {
		lista = new Empregado[tamanho];
		indice = 0;
	}

	public void inserir(Empregado empregado) {
		if (indice < lista.length) {
			lista[indice] = empregado;
			indice++;
		}
	}

	public Empregado pesquisar(long matricula) {

		Empregado aux = null;

		for (int i = 0; i < indice; i++) {
			if (lista[i].getMatricula() == matricula) {
				aux = lista[i];
			}
		}

		return aux;
	}

	public String listar() {

		String horista = "Empregado Horista\n";
		String comissionado = "Empregado Comissionado\n";

		for (int i = 0; i < indice; i++) {
			if (lista[i] instanceof EmpregadoHorista) {
				horista += lista[i] + "\n";
			} else {
				comissionado += lista[i] + "\n";
			}

		}
		return horista + "\n" + comissionado;
	}

}
