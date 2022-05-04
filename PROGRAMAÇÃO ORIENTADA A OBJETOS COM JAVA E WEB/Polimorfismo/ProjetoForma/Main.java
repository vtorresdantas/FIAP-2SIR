package br.fiap.main;

import br.fiap.forma.Cilindro;
import br.fiap.forma.Circulo;
import br.fiap.forma.Forma;
import br.fiap.volume.Volume;
import br.fiap.forma.*;

public class Main {
	public static void main(String[] args) {

		Forma[] forma = new Forma[4];

		// gerando 4 objetos
		forma[0] = new Circulo(2, 3, 4);
		forma[1] = new Cilindro(1, -1, 3.5, 4.75);
		forma[2] = new Circulo(5, 5, 5.5);
		forma[3] = new Cilindro(3, 2, 2.5, 10);

		// saída dos dados
		for (Forma f : forma) {
			System.out.println(f);
		}

		// impressão do valor da área
		for (Forma f : forma) {
			System.out.println(f.calcularArea());
		}

		// impresão do valor do volume
		System.out.println();
		for (Forma f : forma) {
			if (f instanceof Volume) {
				System.out.println("Volume: " + ((Volume) f).CalcularVolume());

			}
		}

	}

}
