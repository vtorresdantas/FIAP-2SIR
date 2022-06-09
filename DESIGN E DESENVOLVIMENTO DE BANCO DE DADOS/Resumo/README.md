# Resumo de Design e desenvolvimento de banco de dados

## Modelo Entidade-Relacionamento (MER)

### Abordagem Relacional

Um banco de dados relacional ou base de dados relacional é um sistema de
armazenamento de dados baseado nos elementos do mundo real (ENTIDADES) e
como eles se relacionam (RELACIONAMENTOS), buscando sempre consistência,
integridade e evitando redundâncias (NORMALIZAÇÃO) dos dados.

# Objetivo Principal

Desenvolver um modelo que represente as necessidades do
negócio baseados na representação de artefatos do mundo real e como eles se
relacionam

![image](https://user-images.githubusercontent.com/62342894/171479088-4c85ca40-fa88-452f-9ea6-32634c9d21d6.png)

# MER - ENTIDADES

Define-se como Entidade aquele objeto que existe no mundo real (artefatos) com
significado próprio e que possui uma identificação distinta.

Uma entidade pode ser a representação de:

- Um artefato físicico do mundo real, como: pessoas, funcionário, nota fiscal,
produto, etc
- Um aterfato conceitual como: serviços, disciplina, consulta médica, tipo
produto, Centro de custo, etc

Entidades contém um grupo de informações que as descrevem, que são
chamados de atributos

# ENTIDADES – Classificação

![image](https://user-images.githubusercontent.com/62342894/171479507-1b49dcd1-2040-4adc-9723-10bb0dca1702.png)

![image](https://user-images.githubusercontent.com/62342894/171479531-bb9b82f4-3d03-470b-b3a9-543544d35e64.png)

# MER - ATRIBUTOS

São informações que qualificam e caracterizam uma entidade.

Os atributos são, em síntese, toda informação que se deseja ter daquela
entidade. Por exemplo:

- Para uma entidade FUNCIONARIO, deseja-se armazenar: o cpf, o nome, o
endereço, o salário e assim por diante. Estes são os atributos da entidade
FUNCIONÁRIO.
- Para uma entidade PEDIDO, deseja-se armazenar: o nro_pedido, a data e o
valor tota. Estes são os atributos da entidade PEDIDO

# MER – CLASSIFICAÇÃO DOS ATRIBUTOS

Atributos de uma entidades podem ser classificados como:

- Atributo Simples: guarda em si um único valor indivisível.
Ex: nome_cliente, data_nascimento, valor_produto

- Atributo Composto: é logicamente formado por um conjunto de outros atributos.
Ex: Endereço (Rua + Número + Bairro + CEP + Cidade)

- Atributo Multivalorado: pode possuir várias ocorrências (vários valores)
Ex: Telefone (você pode querer armazenar vários telefones para a mesma pessoa)

- Atributo Calculado (Derivado): Pode ser conseguido a partir de outro(s) atributo(s).
Ex: Idade (data atual – a data de nascimento)

- Atributo Determinante: É o atributo que garante a unicidade de cada instância de uma
Entidade. Também é chamado de Identificador
Ex: rm_aluno, nr_matricula_funcionario, nr_nota_fisca, renavam 

# MER – INSTÂNCIAS DE UMA ENTIDADE (TUPLAS)

![image](https://user-images.githubusercontent.com/62342894/171479732-c86065c3-f45a-45ac-9b33-a0763e179967.png)

Tuplas têm o mesmo significado que um registro ou uma linha de
uma tabela, mas no modelo relacional formalmente se utiliza o termo
TUPLA ou Instância da entidade e não linha ou registro

# MER – ATRIBUTOS CHAVES

![image](https://user-images.githubusercontent.com/62342894/171479797-5ff418cf-d9bb-4b54-bd6d-f95c6e52b4ba.png)

# MER – CHAVE PRIMÁRIA SIMPLES E COMPOSTA

![image](https://user-images.githubusercontent.com/62342894/171480352-706a1c53-8adf-444f-9233-f281124d3532.png)

# MER – CHAVE ESTRANGEIRA

![image](https://user-images.githubusercontent.com/62342894/171480380-c2218340-076a-4c83-9511-3b89e9708c12.png)

# Relacionamento 1:N Identificado

![image](https://user-images.githubusercontent.com/62342894/171480528-2a292c08-b95e-4eb7-82e0-7015b23a255c.png)

![image](https://user-images.githubusercontent.com/62342894/171480558-b156be3f-018c-4e58-9f1c-de5cfee43a17.png)

# Entidades Associativas (ou Agregação)

![image](https://user-images.githubusercontent.com/62342894/171480581-93287099-4b3c-4e16-ad8e-c85b5c77689a.png)

![image](https://user-images.githubusercontent.com/62342894/171480816-5fe6f9f2-cd4f-4052-b36e-c0ca3b4ff712.png)

# Entidades Associativas (Oracle Data Modeler) - Modelo lógico

![image](https://user-images.githubusercontent.com/62342894/171480776-71216fbd-8f9d-4f4a-9b45-83f399a39ee4.png)

# Modelo relacional Relacionamentos 1:1

![image](https://user-images.githubusercontent.com/62342894/171484868-886aa25d-7c3a-4b15-ac46-a4b23197336d.png)
![image](https://user-images.githubusercontent.com/62342894/171484886-6723fd35-6670-4f66-9bde-3799fc9b209b.png)

# Relacionamentos 1:N

![image](https://user-images.githubusercontent.com/62342894/171484959-3d6654e1-c74f-49a3-a626-08bd874cdbce.png)
![image](https://user-images.githubusercontent.com/62342894/171484971-c857d444-9aaf-4f96-a74e-e7d37c77e71f.png)

# Relacionamentos M:N
![image](https://user-images.githubusercontent.com/62342894/171485017-e6a73c9e-e44f-48a0-be04-564d750b1cb7.png)
![image](https://user-images.githubusercontent.com/62342894/171485047-70311e64-d1ad-4c65-be58-d170096dc3a7.png)

# Atributo Multivalorado

![image](https://user-images.githubusercontent.com/62342894/171485096-bf2b0d2f-33f2-406e-bcd1-bdd3cd450d9d.png)

# RELACIONAMENTOS

![image](https://user-images.githubusercontent.com/62342894/171487893-e2db0d71-70ab-4ba5-ab76-d410fa767914.png)

# Obrigatoriedade em um relacionamento

![image](https://user-images.githubusercontent.com/62342894/171490125-2e1ea2c3-9f14-4a5e-96eb-f422c0bc9d77.png)

![image](https://user-images.githubusercontent.com/62342894/171490143-8cbb2c61-2756-4d85-b8a4-995870d41f1a.png)





