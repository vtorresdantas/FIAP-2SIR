package BilheteUnico;

import java.util.Random;
import java.util.Scanner;

public class Bilhete {

	// Atributos ou propriedades ou variáveis de instância
	int numero;
	double saldo;
	static double valorDaPassagem = 4.4;
	Usuario usuario;

	// Método construtor para inicializar os atributos do objeto
	public Bilhete(String nome, String cpf, String tipo) {
		Random gerador = new Random();
		numero = gerador.nextInt(10000);
		saldo = 0;
		usuario = new Usuario(nome, cpf, tipo);
	}

	// Método para atualizar o valor da passagem de acordo com uma porcentagem
	public static void AtualizarValorDaPassagem(double porcentagem) {
		valorDaPassagem = valorDaPassagem * (1 + porcentagem / 100);
	}

	// Método para carregar o bilhete com um valor recebido via parametro
	public void carregarBilhete(double valor) {
		saldo += valor;
	}

	// Método para passar na catraca
	public void passarNaCatraca() {
		double valor = valorDaPassagem;
		if (usuario.tipo.equalsIgnoreCase("estudante") || usuario.tipo.equalsIgnoreCase("professor")) {
			valor = valorDaPassagem / 2;
		}
		saldo -= valor;
	}

	

}
