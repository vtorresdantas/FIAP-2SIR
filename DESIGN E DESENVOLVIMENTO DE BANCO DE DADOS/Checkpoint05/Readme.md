# Checkpoint05

## Introdução

Seu banco de dados está criado, com todas as suas tabelas e constraints que garantem a qualidade de seu projeto de acordo com as formas normais que regem um banco de dados relacional (pelo menos até a 3ª Forma Norma). Mas todas as tabelas estão vazias!
Chegou a hora de trabalhar com os dados, fazendo inserções, remoções e modificações de dados, usando os comandos DML da linguagem dentro de transações SQL.

- Nesta avaliação de checkpoint, você deverá executar TRÊS tarefas:

Máximo de 2 participantes (podem ser o mesmo ou diferente das entregas anteriores)

# Tarefa 1: Carga inicial de dados

- Entregar o script SQL que faz uma carga inicial de dados. O script deve obrigatoriamente ter os itens abaixo e cada item deve ser uma transação SQL diferente, devidamente efetivada.

a. Inserir pelo menos 2 registros em cada tabela.

b. Inserir pelo menos 5 clientes PF e 2 clientes PJ.

c. Inserir pelo menos 5 vendas para diferentes clientes (distribuídas entre clientes PF e PJ). Em cada venda devem existir pelo menos 2 produtos

### Atenção: Transações não efetivadas serão consideradas não concluídas, e, portanto, zerado o item.

# Tarefa 2: Modificação e Remoção de dados

- No mesmo script usado para colocar os comandos da tarefa 1, adicione comandos para executar as ações abaixo. Cada item deve ser uma transação SQL diferente, devidamente efetivada.

a. Modificar o nome de um dos clientes. Use o CPF para identificar qual o cliente que terá o nome modificado.

b. Modificar a quantidade em estoque de um produto “x” em uma loja “y”. (lembre-se que a quantidade de estoque de cada produto é por loja, como definido na fase de projeto)

c. Remover uma das vendas cadastradas no item “c” data tarefa 1. Lembre-se que remover uma venda implica, obrigatoriamente, em remover os itens daquela venda.

### Atenção: Transações não efetivadas serão consideradas não concluídas, e, portanto, zerado o item.

# Tarefa 3: Interface para entrada e Manipulação de Dados

- É fato que uso de comandos DML são, na sua grande maioria, associados a programação. É neste momento que vemos uma clara interação com outras disciplinas. O banco de dados não faz sentido
sozinho . Nesta tarefa, você deverá:

a. Criar uma interface (“aplicação”) para inserção, manipulação e remoção dos seguintes dados:

- Cliente
- Produto
- Venda e seus itens

b. Montar uma apresentação em vídeo - bem rápida - na qual mostram a parte do código que usaram os comandos SQL para cliente ou venda (escolham uma) e mostrando que está
funcionando.

c. Opcionalmente, compartilhar o acesso a aplicação para que possa ser acessada pelo professor.

### Atenção: Podem usar qualquer linguagem de programação, mas explicitamente usarem comandos DML para fazerem as operações no banco de dados.

###  Regras Para Entrega:

- As tarefas 1 e 2 devem estar obrigatoriamente em um ÚNICO ARQUIVO no formato texto e com extensão .”sql”. Qualquer outro formato será ignorado e as questões zeradas.
- As informações da tarefa 3 devem estar em outro arquivo
- Coloque em um arquivo chamado “integrantes.txt” o RM e nome dos participantes
- Coloque todos os arquivos em um único arquivo {nome_aluno}_{rm}.zip => USE OBRIGATORIAMENTE

.ZIP. Entregas com .7z ou outro formato não serão aceitas

{Nome_aluno} ➔ Nome do aluno que fez a entrega no Portal Apex da disciplina

{rm} ➔ RM do aluno que fez a entrega no Portal Apex da disciplina

- A entrega será pelo portal Apex da disciplina de banco de dados, na área de trabalho:
- 
http://oracle.fiap.com.br:8080/apex/f?p=portal

- Apenas um aluno entrega e indica os participantes do grupo. NÃO FAÇAM ENTREGAS DUPLICADAS PARA EVITAR PROBLEMAS COM NOTAS

## Pontuação
### Tarefa 1: 3.5 pontos => Cada item não entrega desconta 1 pontos
### Tarefa 2: 3.5 pontos => Cada item não entrega desconta 1 pontos
### Tarefa 3: 3.0 pontos => (a) vale 1.5 pontos e (b) vale 1.5 pontos
