package BilheteUnico;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {

	// Declara��o do array para armazenar os cadastros do bilhetes
	Bilhete[] bilhete = new Bilhete[5];

	// variav�l para controlar a posi��o
	int posicao;

	public void cadastrarBilhete() {
		String nome, cpf, tipo;
		int indice;

		if (posicao >= bilhete.length) {
			showMessageDialog(null, "Sistema inoperante");
		} else {
			cpf = showInputDialog("Qual o seu cpf?");
			indice = pesquisar(cpf); // -1 indica que n�o encontrou
			if (indice == -1) {
				nome = showInputDialog("Nome");
				tipo = showInputDialog("Tipo (Estudante/Professor/Normal");
				bilhete[posicao] = new Bilhete(nome, cpf, tipo);
				posicao++;
			} else {
				showMessageDialog(null, cpf + " j� est� cadastrado");
			}

		}
	}

	// m�todo para pesquisar cpf de usu�rio
	// m�todo retorna a posi��o do array onde o usu�rio foi encontrado ou
	// -1 quando o usu�rio n�o estiver cadastrado

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
			showMessageDialog(null, cpf + " n�o est� cadastrado");

		} else {

			msg = "N�mero do bilhete: " + bilhete[indice].numero + "\n";
			msg += "Nome do usu�rio: " + bilhete[indice].usuario.nome + "\n";
			msg += "Tipo de usu�rio: " + bilhete[indice].usuario.tipo + "\n";
			msg += "N�mero do cpf: " + bilhete[indice].usuario.cpf + "\n";
			msg += "Saldo do usu�rio: " + String.format("%2f", bilhete[indice].saldo) + "\n";

			showMessageDialog(null, msg);

		}
	}

	public void menuPrincipal() {

		String aux = "Escolha uma op��o\n1. Administrador\n" + "2. Usu�rio\n3. Finalizar";
		int opcao;

		do {
			opcao = parseInt(showInputDialog(aux));
			if (opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Op��o inv�lida");
			} else if (opcao == 1) {
				menuAdministrador();
			} else if (opcao == 2) {
				menuUsuario();
			}

		} while (opcao != 3);
	}

	public void menuAdministrador() {

		showMessageDialog(null, "Bem-vindo Administrador");

		String aux = "Escolha uma op��o\n1. Cadastrar bilhete\n" + "2. Consultar bilhete\n3. Sair";
		int opcao;

		do {
			opcao = parseInt(showInputDialog(aux));
			if (opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Op��o inv�lida");
			} else if (opcao == 1) {
				cadastrarBilhete();
			} else if (opcao == 2) {
				consultarBilhete();
			}

		} while (opcao != 3);

	}

	public void menuUsuario() {

		showMessageDialog(null, "Bem-vindo Usu�rio");

		String aux = "Escolha uma op��o\n1. Consultar saldo\n" + "2. Carregar bilhete\n"
				+ "3. Passar na catraca\n4. Sair";
		int opcao;

		do {
			opcao = parseInt(showInputDialog(aux));
			if (opcao < 1 || opcao > 4) {
				showMessageDialog(null, "Op��o inv�lida");
			} else if (opcao == 1) {

				consultarSaldo();

			} else if (opcao == 2) {
				carregarBilhete();

			} else if (opcao == 3) {
				passarNaCatraca();

			}

		} while (opcao != 4);

	}

//m�todo para consultar o saldo do bilhete

	public void consultarSaldo() {

		String cpf;
		int indice;

		cpf = showInputDialog(null, "CPF: ");
		indice = pesquisar(cpf);

		if (indice != -1) {
			showMessageDialog(null, "Saldo R$: " + bilhete[indice].saldo);
		} else {
			showMessageDialog(null, "CPF n�o encontrado");
		}
	}

	// m�todo para carregar o bilhete com um valor informado pelo usu�rio

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

	// m�todo para passar na catraca
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
