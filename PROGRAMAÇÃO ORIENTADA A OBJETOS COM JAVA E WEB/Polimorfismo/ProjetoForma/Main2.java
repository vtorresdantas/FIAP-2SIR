package br.fiap.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.fiap.forma.*;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instaniar o objeto
		List<Forma> lista = new LinkedList<Forma>();

		lista.add(new Circulo(2, 3, 4));
		lista.add(new Cilindro(9, 14, 7, 6));

		// impressao dos elementos
		Forma aux;
		for (int i = 0; i < lista.size(); i++) {
			aux = lista.get(i);
			System.out.println(aux);
		}

	}

}
