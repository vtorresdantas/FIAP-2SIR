# Diagrama de atividades

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




