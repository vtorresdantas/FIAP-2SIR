# Listas lineares encadeadas

## Definição

- Uma lista linear é uma coleção de elementos ordenados
- O conceito de lista linear especifica que é uma estrutura dinâmica caracterizada por uma seqüência ordenada de elementos

![image](https://user-images.githubusercontent.com/62342894/166259287-f6013906-224b-4bda-8673-06e6d75394f1.png)

- Quando elementos de uma lista linear são alocados na memória principal de forma dinâmica (durante a execução do programa) essa listas são conhecidas como sendo listas encadeadas ou também listas ligadas.

- A alocação dinâmica significa armazenar mais um dado alocando (ou obtendo) uma região de memória onde este novo dado deve ser armazenado dinamicamente, ou seja, enquanto o programa está sendo executado.
- Portanto, deve ser utilizada quando não se conhece de antemão o número de elementos que uma estrutura deverá ter para armazenar dados de entrada de um programa.
- O número máximo de elementos fica apenas restrito a disponibilidade de memória (memória RAM).
- O espaço de memória disponível para ser utilizado pelo programa em execução é chamado de heap.

## Regiões de Memória e seu Funcionamento

![image](https://user-images.githubusercontent.com/62342894/166259580-950ed172-30c9-4f3e-aa1f-53b00766a46b.png)

![image](https://user-images.githubusercontent.com/62342894/166259625-41c2974b-8aa3-42cc-b8da-f504fc72a6ab.png)

# Lista Encadeada - Introdução

![image](https://user-images.githubusercontent.com/62342894/166259915-c802bc5a-caec-48b1-9165-00a308401f41.png)

- Objetos são instanciados sem nenhuma ordem, dependendo apenas de ser encontrada região de memória livre na heap
- Não faz sentido ter uma referência para cada objeto instanciado se não se quer decidir antes quantos elementos existirão na lista linear.

## Lista Linear Encadeada

- Para que se transforme em uma lista linear é necessário que cada elemento tenha a indicação (ponteiro) de onde se encontra o elemento que é o seu sucessor.
- Para que isto possa acontecer, cada elemento deve se tornar:

![image](https://user-images.githubusercontent.com/62342894/166260031-8c2bfd3e-5824-490d-bb2a-7f18412fd8dd.png)

- Portanto, chamaremos de nó cada elemento da lista.

### Representação de Lista Linear Encadeada

![image](https://user-images.githubusercontent.com/62342894/166260081-f1ac5155-f8ac-450c-8959-f14a99f92c4c.png)

## Declaração de um Nó (Nodo)

![image](https://user-images.githubusercontent.com/62342894/166260196-c087701b-a31c-4bec-95f3-9253a6da8ee3.png)

## Exemplo Encadeamento de Nós (Elementos)

![image](https://user-images.githubusercontent.com/62342894/166260252-c19eec24-3dd6-4f75-920c-0b1af188ea53.png)

![image](https://user-images.githubusercontent.com/62342894/166260277-bad9a4b1-68ed-4ade-bb17-299b57ca342b.png)



