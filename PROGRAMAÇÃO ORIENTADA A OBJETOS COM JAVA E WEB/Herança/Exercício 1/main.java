package br.fiap.main;

import br.fiap.aluno.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno[] aluno = new Aluno[3];
		aluno[0] = new AlunoFundamental("vitor", 88415, 8, 9, 5);
		aluno[1] = new AlunoGraduacao("torres", 88430, 5, 6, "si", 9);
		aluno[2] = new AlunoPosGraduacao("dantas", 88758, 8, 2);

		for (int i = 0; i < aluno.length; i++) {

			System.out.println(aluno[i]);
			System.out.println();
		}

	}

}
