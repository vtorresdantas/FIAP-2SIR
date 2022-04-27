package br.fiapjuridica.main;

import br.fiapjuridica.advogado.Advogado;
import br.fiapjuridica.defensoria.Defensoria;
import br.fiapjuridica.processo.Processo;

public class Main {
	public static void main(String[] args) {
		
		// objeto do tipo Defensoria para acessar as funcionalidades
		Defensoria defensoria = new Defensoria(4);
		
		// exercício 6 --> geração de 4 objetos do tipo Processo
		// para gerar os objetos do tipo Processo é necessário ter objetos do tipo Advogado
		Advogado advogado1 = new Advogado(1, "Pedro");
		Advogado advogado2 = new Advogado(2, "Maria", "Criminal");
		Advogado advogado3 = new Advogado(3, "João");
		Advogado advogado4 = new Advogado(4, "Ana", "Penal");
		
		Processo processo1 = new Processo(1000, "01/01/2022", "Selmini", advogado1);
		Processo processo2 = new Processo(2000, "20/08/2019", "Patrícia", advogado2);
		Processo processo3 = new Processo(3000, "15/10/2020", "Agessandro", advogado3);
		Processo processo4 = new Processo(4000, "20/11/2021", "Renato", advogado4);
		
		defensoria.inserir(processo1);
		defensoria.inserir(processo2);
		defensoria.inserir(processo3);
		defensoria.inserir(processo4);
		
		
		// exercício 7 --> encerrando dois processos armazenados na defensoria
		defensoria.encerrar(2000, "25/04/2022");
		defensoria.encerrar(4000, "25/04/2022");
		
		// exercício 8 --> impressão dos dados de todos os processos armazenados.
		System.out.println(defensoria.listar());

	}
}
