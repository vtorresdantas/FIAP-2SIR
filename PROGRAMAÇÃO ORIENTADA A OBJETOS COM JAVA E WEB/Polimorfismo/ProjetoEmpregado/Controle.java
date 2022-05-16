package br.fiap.controle;

import br.fiap.*;
import br.fiap.pessoa.Pessoa;

import static javax.swing.JOptionPane.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.*;
import static java.lang.Double.*;

public class Controle {

	private List<Pessoa> lista = new ArrayList<Pessoa>();

	public void menu() {
		int opcao = 0;
		String aux = "Escolha uma opção\n";
		aux += "1. Cadastrar empregado\n";
		aux += "2. Cadastrar cliente\n";
		aux += "3. Pesquisar\n";
		aux += "4. Listar empregados\n";
		aux += "5. Listar clientes\n";
		aux += "6. Remover\n";
		aux += "7. Finalizar\n";

		do {
			try {
				opcao = parseInt(showInputDialog(aux));
			} catch (NumberFormatException e) {
				showMessageDialog(null, "A opção deve ser um número");
			}
		} while (opcao != 7);
	}

}
