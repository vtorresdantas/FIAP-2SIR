//Operações:
//1. Consultar saldo
//2. Carregar bilhete
//3. Passar na catraca
//4. Sair
package BilheteUnico;

public class Usuario {

	// Atributos ou variáveis de instância
	String nome;
	String cpf;
	String tipo;

	// Método construtor("Especial") para inicializar os atributos do objeto
	// 1a. construtor não tem tipo, nem mesmo o void
	// 2a. o construtor sempre tem o mesmo nome da classe
	public Usuario(String nome, String cpf, String tipo) {
		this.nome = nome;
		this.cpf = cpf;
		this.tipo = tipo;
		
	}	

}
