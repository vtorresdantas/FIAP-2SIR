package br.fiapmusic.main;

import br.fiapmusic.musica.Musica;
import br.fiapmusic.playlist.Playlist;
import br.fiapmusic.cantor.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instanciar uma playlist
		Playlist playlist = new Playlist(4);

		// gerar 4 objetos do tipo cantor
		Cantor cantor1 = new Cantor("Selmini");
		Cantor cantor2 = new Cantor("Patricia", "inglesa");
		Cantor cantor3 = new Cantor("Renato");
		Cantor cantor4 = new Cantor("Agesandro", "Brasileiro");

		// gerar 4 objetos do tipo música
		Musica musica1 = new Musica("abc", "forró", cantor1);
		Musica musica2 = new Musica("xyz", "metal", cantor2);
		Musica musica3 = new Musica("edf", "sertanejo", cantor3);
		Musica musica4 = new Musica("fgh", "freeza", cantor4);
		
		playlist.inserir(musica1);
		playlist.inserir(musica2);
		playlist.inserir(musica3);
		playlist.inserir(musica4);
		
		//exercício 7
		playlist.tocar("abc");
		playlist.tocar("xyz");
		
		//exercício 8
		System.out.println(playlist.listar());

	}

}
