package ListasEncadeadas;

public class ListaIntCrescente {

	private class NO {
		int dado;
		NO prox;
	}

	NO lista = null;

	public void insere(int elem) {
		NO novo = new NO();
		novo.dado = elem;
		if (lista == null) {
			novo.prox = null;
			lista = novo;
		} else if (novo.dado < lista.dado) { // Insere como 1o da lista
			novo.prox = lista;
			lista = novo;
		} else { // insere a partir do 2o elemento
			NO aux = lista;
			boolean achou = false;
			while (aux.prox != null && !achou) {
				if (aux.prox.dado < novo.dado)
					aux = aux.prox;
				else
					achou = true;
			}
			novo.prox = aux.prox;
			aux.prox = novo;
		}
	}

	public void show() {
		NO aux = lista;
		while (aux != null) {
			System.out.print(aux.dado + "\t");
			aux = aux.prox;
		}
		System.out.println();
	}

	public void remove(int valor) {
		if (lista != null) {
			if (valor == lista.dado)
				lista = lista.prox;
			else {
				NO aux = lista;
				boolean achou = false;
				while (aux.prox != null && !achou) {
					if (aux.prox.dado == valor)
						achou = true;
					else
						aux = aux.prox;
				}
				if (achou)
					aux.prox = aux.prox.prox;
				else
					System.out.println("Valor não foi encontrado na lista");
			}
		}
		else
			System.out.println("Lista está vazia");
	}
}
