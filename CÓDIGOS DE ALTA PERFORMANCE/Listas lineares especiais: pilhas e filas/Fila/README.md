# Listas Lineares Especiais: Filas Sequenciais - Códigos de alta perfomance

Definição:

- Uma fila é um conjunto ordenado de itens onde a remoção de itens se faz em um extremo e a inserção em outro.
- É uma estrutura de dados que segue a disciplina *FIFO – First In First Out* (primeiro a entrar primeiro a sair). 

![image](https://user-images.githubusercontent.com/62342894/161970948-46f3afae-8977-427c-b5da-86e17895e246.png)

# Operações com Fila:

*init*
- inicia a fila deixando-a vazia;

*isEmpty*
- verifica se a fila está vazia, retornando verdade se estiver vazia e falso, caso contrário;

*isFull*
- verifica se a fila está cheia, retornando verdade se estiver cheia e falso, caso contrário;

*enqueue (valor)*
- insere um elemento com o valor do argumento na extremidade fim da fila

*dequeue(valor)*
- remove um elemento na extremidade início da fila retornando o valor do conteúdo do elemento

*first(valor)*
- lê o conteúdo do elemento que está no início da fila retornando em valor

# Definição do Tipo de Dado Fila

A definição do tipo de dado fila sequencial (utilizando vetor) precisa de:

- Um vetor para armazenar dados
- Referência para a posição de início (ini)
- Referência para a posição de fim (fim)

![image](https://user-images.githubusercontent.com/62342894/161971952-893b24d8-d259-466c-a31e-445c76bdad74.png)

# Módulo init

![image](https://user-images.githubusercontent.com/62342894/161972125-bf0a0fee-e2ef-45f3-b144-cf4bfbd9bf1e.png)
![image](https://user-images.githubusercontent.com/62342894/161972152-d287b212-5ff4-42ec-a11b-1c121a309a7b.png)

# Módulo enqueue (valor)

![image](https://user-images.githubusercontent.com/62342894/161972330-7b45e349-3ce2-40f6-b8ee-8a513ec59256.png)
![image](https://user-images.githubusercontent.com/62342894/161972354-7e99404a-dd59-48b4-ac8e-49fe458b12c9.png)
![image](https://user-images.githubusercontent.com/62342894/161972376-4c840932-726d-4a57-a6a1-ba0407143990.png)

# Módulo dequeue (valor)

![image](https://user-images.githubusercontent.com/62342894/161972590-dda45271-695c-4963-b192-0d8c68c4d00f.png)
![image](https://user-images.githubusercontent.com/62342894/161972603-fb6a87b3-b82c-4b5a-8447-89d5631e5eb7.png)
![image](https://user-images.githubusercontent.com/62342894/161972632-b6bfd36b-4ace-4e5a-8640-7bb96b3ba6d6.png)

# Módulo isEmpty

![image](https://user-images.githubusercontent.com/62342894/161972765-cbaaf812-386f-4930-b4b0-caeec9efad16.png)

# Módulo isFull

![image](https://user-images.githubusercontent.com/62342894/161972802-4ace4061-eb23-49dc-a475-076b01896cde.png)

# Módulo first

![image](https://user-images.githubusercontent.com/62342894/161973142-9e05aa87-0ad8-4d60-b252-d70143d25811.png)












