# Global Solution - Engenharia de Software

resumo mts https://github.com/mtshto/gs-resumos/blob/main/README.md

## Extend e includ

![image](https://user-images.githubusercontent.com/62342894/199144802-b00cfacf-d6b9-4389-8bcf-de9244013e9f.png)

### UC - Contexto

![image](https://user-images.githubusercontent.com/62342894/199134643-c52e3261-e99d-49a7-9072-e044ef5cc003.png)

### Registrar saída de veículo

![image](https://user-images.githubusercontent.com/62342894/199144066-8679a2b9-2f5e-421c-b8ef-909b42944465.png)

### Registrar entrada de veículo

![image](https://user-images.githubusercontent.com/62342894/199144127-e061ab8f-e8d4-43ec-b81f-c1e016f186c8.png)

## Descrição de Caso de Uso (Slide Aula 9)

### Explicação textual composta da seguintes estrutura de tópicos:

- Resumo: explica rapidamente quem dispara o Caso de Uso, quais os dados de entrada e controles aplicados na execução do Caso, quais os resultados esperados e quais são os clientes do resultado.

- Requisitos associados: Lista de Requisitos de Negócio (funcionais), contemplados no Caso de Uso

- Condições para a execução
- Atores: Participantes do Caso de Uso

- Descrição do Fluxo Principal: explica a lógica principal do Caso de Uso numa visão linear de “começo”, “meio” e “fim”.

- Descrição dos Subfluxos Alternativos: explica a lógica dos possíveis encaminhamentos que o Caso de Uso pode ter em função das escolhas do Ator ou dos resultados de “processamento” da transação.

- Descrição dos Subfluxos de Exceção: trata os erros de utilização previstos e respostas para possíveis falhas de processamento da transação (tratamento de erros e exceções previstas).

![image](https://user-images.githubusercontent.com/62342894/199133824-b0a73bc5-05f7-4081-bda9-d3237cd8ffe2.png)

## Cenarios de Uso (Slide Aula 10)

Os cenários são divididos em:

- Cenário Primário: serve para validar o fluxo principal do Caso de Uso,simulando o uso correto ou mais frequente.

- Cenários Secundários: servem para validar os fluxos de exceção ealternativos do Caso de Uso, simulando o uso incorreto (situações deerro de utilização/operação que precisam ser tratados pelo sistema)ou situações menos frequentes previstas nos fluxos alternativos (lógicaalternativa).

### Exemplo

![image](https://user-images.githubusercontent.com/62342894/199144620-ece8f9ae-9d18-4327-8159-bdad148c41fd.png)

### Cenário principal: Consulta seguida de saque com sucesso

- passos realizados do UC: 1,2,3,4,5,6,7,8,9,10

### Cenário secundário 1: Consulta com sucesso sem saque

- passos realizados do UC: 1,2,3,4,5,6,A1.1

### Cenário secundário 2: Conta de acesso inválida

- passos realizados do UC: 1,2,3,E1.1

### Cenário secundário 3: Conta de acesso válida e senha inválida

- passos realizados do UC: 1,2,3,4,E2.1

## Orientação à Objeto (OO) (Slide Aula 11)

Uma vez identificado um Tipo, ele pode gerar:

Uma Classe de Objetos que é uma Metaestrutura que conterá todosObjetos com as mesmas características.

- Exemplo: Toda nota Fiscal precisa ser identificada unicamente no mundo.

Um Atributo em uma Classe indica uma característica do Objeto naClasse

- Exemplo: A Nota Fiscal tem como suas características, possuir um número, umasérie, uma data, um valor, etc.

Um Método em uma Classe descreve um comportamento/ação possível doObjeto na Classe

- Exemplo: A Nota Fiscal pode ser arquivada, destruída, gerada, etc.

![image](https://user-images.githubusercontent.com/62342894/199145603-e7bdc1c8-30a9-45ea-a182-21c73f281171.png)

## Diagrama de Atividades (Slide Aula 17)

No contexto da UML, o Diagrama de Atividades é um diagrama comportamental (que especifica o comportamento do software), e através dele podemos modelar partes do comportamento de um software.

## Processo

![image](https://user-images.githubusercontent.com/62342894/188696351-4683d426-27be-402b-a1b0-43197fb0473c.png)

## Exemplificação

![image](https://user-images.githubusercontent.com/62342894/188696391-866eebed-47b8-4842-b85e-fe240a14c93f.png)

## Notação

Adicionalmente podem ser separadas as responsabilidades de Atores edo Sistema em Raias (Lanes), dentro de uma Piscina (Pool) querepresenta a operação de uso.

![image](https://user-images.githubusercontent.com/62342894/188696502-b62711ac-ce5e-4115-9daf-abe09943de61.png)

## Exemplo

![image](https://user-images.githubusercontent.com/62342894/188696531-4de75706-7ea9-42b5-94ae-1b7ed89c8652.png)

##  Descrição

Os Diagramas de Atividades têm aplicação variada.

Pela facilidade que proporcionam para representar operações de umaempresa eles podem ser empregados para:

- Documentar processos do usuário, durante o levantamento derequisitos;

- Documentar o uso de sistemas legados, durante o levantamento derequisitos;
- Documentar um Caso de Uso de forma ilustrada;
- Documentar o uso de um software já projetado;

## ANÁLISE E PROJETO DE SISTEMAS

![image](https://user-images.githubusercontent.com/62342894/188696701-8b6b59e4-8ee5-4957-b72f-64f87333f8f6.png)



# Exemplos de soluções

## Explique o caso a seguir com um Diagrama de Atividades

Quando o novo sistema estiver pronto, o funcionário do estacionamento deve informar a placa do veículo que está ingressando e em seguida, procurar uma vaga livre pelo seu controle manual, via relatório PDF que foi gerado no sistema após a última entrada de veículo.

Se não houver vaga livre, o funcionário dispensa o veículo e encerra o processo.

Se houver vaga livre, funcionário pede ao sistema que bloqueie a vaga. O sistema então, grava um registro de alocação da vaga com dados de data, hora, identificação do veículo e vaga vinculada.

### UC - Registrar entrada de veículo
![image](https://user-images.githubusercontent.com/62342894/188690719-402c15c6-ef0e-49d0-a033-97e2735c964f.png)

### UC - Realizar entrada em oficina para manutenção

![image](https://user-images.githubusercontent.com/62342894/188691469-a356f55f-80f0-4329-9c26-e488f65e0ed7.png)

![image](https://user-images.githubusercontent.com/62342894/188691508-59660bb8-6e67-41d7-b13a-5352a2b89927.png)

### UC - Cadastro deEstacionamento

Como no Diagrama de Atividades você pode contemplar mais de um Cenáriode Uso, considere duas possibilidades: o CNPJ informado já existir e o sistemaimpedir o cadastro ou; o CNPJ não existir e o sistema cadastrar o novoestacionamento

![image](https://user-images.githubusercontent.com/62342894/188691795-2871f46e-f074-4da9-99e1-4ac1b1d84793.png)

## Diagrama de Classes (Slide Aula 12)

![image](https://user-images.githubusercontent.com/62342894/199145345-cc8e1466-c698-45cf-a049-185f27aad4ac.png)

## Relação de Classes (Slide Aula 13)

### Relações associativas

![image](https://user-images.githubusercontent.com/62342894/199145846-352f986d-7bc4-4d1b-978e-2e0a00ac09cc.png)

![image](https://user-images.githubusercontent.com/62342894/199145869-47c2ed0f-cd83-47cd-9e0d-8d3cb1ea1ce0.png)

### Cardinalidade

![image](https://user-images.githubusercontent.com/62342894/199145895-1fa99ce0-7069-4c51-8c0e-a940e38f0f3d.png)

### Associações com dependência

![image](https://user-images.githubusercontent.com/62342894/199145944-6d9f71ba-9d80-417f-ae4e-162d182e4544.png)

![image](https://user-images.githubusercontent.com/62342894/199145957-574c6ecc-74d8-4d23-b3a7-e6d0634f8026.png)

![image](https://user-images.githubusercontent.com/62342894/199145968-49c0e81d-c8ac-47b1-9e10-fd9e27184b84.png)

![image](https://user-images.githubusercontent.com/62342894/199146013-d7b53c65-d2d7-4e42-9b1f-49c5e5f070a3.png)

### Herança

![image](https://user-images.githubusercontent.com/62342894/199146193-007cbab5-9890-4c22-9587-766bcbb0436c.png)

## Especificação e Implementação (Slide Aula 14)

![image](https://user-images.githubusercontent.com/62342894/199146298-3f49aef4-ba42-4811-8d28-e05e6b3e8f6b.png)

![image](https://user-images.githubusercontent.com/62342894/199146325-2e06e670-4a8a-40db-97b6-351bcac596ae.png)

## Diagrama de Objetos e Comunicação (Slide Aula 15)

### Exercício

![image](https://user-images.githubusercontent.com/62342894/199146800-a7a773cc-5585-4e0c-9da1-95ea59c09b10.png)

### Resolução

![image](https://user-images.githubusercontent.com/62342894/199146842-8da2dc52-dfba-4cd7-b70d-049990fc9e75.png)

## Diagrama de Sequencia (Slide Aula 16)

![image](https://user-images.githubusercontent.com/62342894/199147165-64b6807a-f0d8-475b-95b7-1329a54fdf71.png)

## Diagrama de Estados (Slide Aula 18)

![image](https://user-images.githubusercontent.com/62342894/199147047-a8e43309-e1cd-49e4-9d20-608c5494bf37.png)

![image](https://user-images.githubusercontent.com/62342894/199147135-a25f71a5-4afa-4771-bdc5-61a7a1b252c5.png)

