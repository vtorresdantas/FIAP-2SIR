package br.fiap.form;

import br.fiap.empregado.*;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Form {

	public void menu() {
		int opcao;
		String aux = "Escolha uma op��o\n";
		aux += "1. Cadastro\n";
		aux += "2. Pesquisa\n";
		aux += "3. Listagem\n";
		aux += "4. Finalizar";

		do {
			opcao = parseInt(showInputDialog(aux));
			if (opcao < 1 || opcao > 4) {
				showMessageDialog(null, "Op��o inv�lida");

			}

		} while (opcao != 4);
	}

}
