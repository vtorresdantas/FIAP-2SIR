# Projeto Aluno - Programação Orientada a Objetos

- Exemplo prático de Programação Orientada a Objetos:

# Instanciação de classes

- Instanciar uma classe significa criar novos objetos a partir da classe.

- Todo objeto instanciado pertence a uma classe, ou seja, o tipo de um objeto é sempre uma determinada classe.

A sintaxe para a instanciação de um objeto é:

*NomeDaClasse nomeDaVariável = new NomeDaClasse();*

![image](https://user-images.githubusercontent.com/62342894/161978348-35a21fe1-0967-4ee1-adc0-857991fafba9.png)

O processo de instanciação pode ser dividido em duas partes:

*NomeDaClasse nomeDaVariável;
nomeDaVariável = new nomeDaClasse();*

- Exemplo: instanciação da classe Pessoa*

*Pessoa p; //apenas a declaração de uma variável (o objeto ainda não existe)*

*p = new Pessoa(); //neste momento o objeto passa a existir na memória*

# Atributos

- Também conhecidos como dados membros ou variáveis de instância.

- Os atributos são variáveis que devem ser declaradas dentro das classes (fora dos métodos). Exemplo:

![image](https://user-images.githubusercontent.com/62342894/161978709-b66b0854-24ad-43e4-b139-defa849e3a99.png)

# Manipulação de objetos

- Não se esqueça que uma classe somente define os atributos e métodos de um conjunto de objetos.
- Para utilizar os atributos é necessário criar um ou mais objetos da classe.
- Cada objeto contém uma “cópia” de todos os atributos da classe. Os atributosarmazenam os dados (características) de cada um dos objetos.

![image](https://user-images.githubusercontent.com/62342894/161978916-f67e316a-54a2-4070-bc45-846df422b0c4.png)

# Exemplo de manipulação de objetos:

![image](https://user-images.githubusercontent.com/62342894/161979100-ac51fe21-2de3-4d29-a5b2-d9b5f6f86f45.png)
![image](https://user-images.githubusercontent.com/62342894/161979122-083c0152-1a9e-4c68-9c57-82d7be0f6311.png)

- Não se esqueça que os membros (atributos e métodos) de um objeto só podem ser acessados se o objeto for instanciado (criado).

![image](https://user-images.githubusercontent.com/62342894/161979287-40200411-76dd-4d4e-946c-f29ca9dda915.png)

# Métodos

- Contêm o código que “entende” e manipula o estado (conjunto de valores) de um objeto. Uma declaração de método consiste de duas partes: o cabeçalho do método e o corpo do método.

![image](https://user-images.githubusercontent.com/62342894/161979484-a2a1dfd8-e737-4ad0-b22a-8eb9455d5307.png)

A assinatura do método representa o cabeçalho do método (*visibilidade + tipo + nome do método + parâmetros*).

O corpo do método contém o código necessário para manipular os estados do objeto. *O corpo do método representa a lógica da aplicação*.

Métodos são invocados como operações sobre objetos através de referência usando o operador ponto (.). Sintaxe:

*variávelDeReferência.nomeDoMétodo(argumentos);*

- *visibilidade:* normalmente (*private, public, protected ou default*).
- *tipo:* tipo retornado pelo método (por exemplo, *int , double*, etc.). Pode ser void para indicar que o método não tem retorno.
- *parâmetros:* dados passados para o método.

# Exemplo de Método

![image](https://user-images.githubusercontent.com/62342894/161979922-a01f9d14-10fd-4580-a079-09de283a025e.png)

# Diferença entre argumento e parâmetro

![image](https://user-images.githubusercontent.com/62342894/161980000-e4915939-3df9-41aa-b5a2-a253b8833a6e.png)







































