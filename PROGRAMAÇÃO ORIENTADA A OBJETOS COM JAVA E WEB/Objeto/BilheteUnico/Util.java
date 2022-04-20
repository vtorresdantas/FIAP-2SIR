package BilheteUnico;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {

	// Declaração do array para armazenar os cadastros do bilhetes
	Bilhete[] bilhete = new Bilhete[5];

	// variavél para controlar a posição
	int posicao;

	public void cadastrarBilhete() {
		String nome, cpf, tipo;
		int indice;

		if (posicao >= bilhete.length) {
			showMessageDialog(null, "Sistema inoperante");
		} else {
			cpf = showInputDialog("Qual o seu cpf?");
			indice = pesquisar(cpf); // -1 indica que não encontrou
			if (indice == -1) {
				nome = showInputDialog("Nome");
				tipo = showInputDialog("Tipo (Estudante/Professor/Normal");
				bilhete[posicao] = new Bilhete(nome, cpf, tipo);
				posicao++;
			} else {
				showMessageDialog(null, cpf + " já está cadastrado");
			}

		}
	}

	// método para pesquisar cpf de usuário
	// método retorna a posição do array onde o usuário foi encontrado ou
	// -1 quando o usuário não estiver cadastrado

	public int pesquisar(String cpf) {

		int aux = -1;

		for (int i = 0; i < posicao; i++) {
			if (bilhete[i].usuario.cpf.equalsIgnoreCase(cpf)) {
				aux = i;
				break;
			}

		}

		return aux;
	}

	public void consultarBilhete() {

		String cpf, msg;
		int indice;

		cpf = showInputDialog("Qual o seu cpf?");
		indice = pesquisar(cpf);

		if (indice == -1) {
			showMessageDialog(null, cpf + " não está cadastrado");

		} else {

			msg = "Número do bilhete: " + bilhete[indice].numero + "\n";
			msg += "Nome do usuário: " + bilhete[indice].usuario.nome + "\n";
			msg += "Tipo de usuário: " + bilhete[indice].usuario.tipo + "\n";
			msg += "Número do cpf: " + bilhete[indice].usuario.cpf + "\n";
			msg += "Saldo do usuário: " + String.format("%2f", bilhete[indice].saldo) + "\n";

			showMessageDialog(null, msg);

		}
	}

	public void menuPrincipal() {

		String aux = "Escolha uma opção\n1. Administrador\n" + "2. Usuário\n3. Finalizar";
		int opcao;

		do {
			opcao = parseInt(showInputDialog(aux));
			if (opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Opção inválida");
			} else if (opcao == 1) {
				menuAdministrador();
			} else if (opcao == 2) {
				menuUsuario();
			}

		} while (opcao != 3);
	}

	public void menuAdministrador() {

		showMessageDialog(null, "Bem-vindo Administrador");

		String aux = "Escolha uma opção\n1. Cadastrar bilhete\n" + "2. Consultar bilhete\n3. Sair";
		int opcao;

		do {
			opcao = parseInt(showInputDialog(aux));
			if (opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Opção inválida");
			} else if (opcao == 1) {
				cadastrarBilhete();
			} else if (opcao == 2) {
				consultarBilhete();
			}

		} while (opcao != 3);

	}

	public void menuUsuario() {

		showMessageDialog(null, "Bem-vindo Usuário");

		String aux = "Escolha uma opção\n1. Consultar saldo\n" + "2. Carregar bilhete\n"
				+ "3. Passar na catraca\n4. Sair";
		int opcao;

		do {
			opcao = parseInt(showInputDialog(aux));
			if (opcao < 1 || opcao > 4) {
				showMessageDialog(null, "Opção inválida");
			} else if (opcao == 1) {

				consultarSaldo();

			} else if (opcao == 2) {
				carregarBilhete();

			} else if (opcao == 3) {
				passarNaCatraca();

			}

		} while (opcao != 4);

	}

//método para consultar o saldo do bilhete

	public void consultarSaldo() {

		String cpf;
		int indice;

		cpf = showInputDialog(null, "CPF: ");
		indice = pesquisar(cpf);

		if (indice != -1) {
			showMessageDialog(null, "Saldo R$: " + bilhete[indice].saldo);
		} else {
			showMessageDialog(null, "CPF não encontrado");
		}
	}

	// método para carregar o bilhete com um valor informado pelo usuário

	public void carregarBilhete() {

		String cpf;
		int indice;
		double valor;

		cpf = showInputDialog(null, "CPF: ");
		indice = pesquisar(cpf);

		if (indice != -1) {
			valor = parseDouble(showInputDialog("Valor da recarga: "));
			bilhete[indice].carregarBilhete(valor);
		}
	}

	// método para passar na catraca
	public void passarNaCatraca() {

		String cpf;
		int indice;

		cpf = showInputDialog(null, "CPF: ");
		indice = pesquisar(cpf);

		if (indice != -1) {
			bilhete[indice].passarNaCatraca();
		}

	}

}
