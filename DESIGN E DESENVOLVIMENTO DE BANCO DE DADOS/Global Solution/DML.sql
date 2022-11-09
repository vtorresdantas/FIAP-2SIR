/*Tarefa 1: Carga inicial de dados
Entregar o script SQL que faz uma carga inicial de dados. O script deve obrigatoriamente ter os itens abaixo
e cada item deve ser uma transação SQL diferente, devidamente efetivada.
a. Inserir pelo menos 2 registros em cada tabela.*/

/* TRUNCATE NAS TABELAS */

truncate table tipo_animal;
truncate table raca_animal;
truncate table estado;
truncate table cidade;
truncate table cliente;
truncate table pf;
truncate table pj;
truncate table animal;
truncate table devolucao;
truncate table devolucao_produtos;
truncate table reserva;
truncate table reserva_produtos;
truncate table venda;
truncate table vendedor;
truncate table itens_venda;
truncate table loja;
truncate table produto;
truncate table estoque_produto;
truncate table status_produto;
truncate table unidade_produto;
truncate table fornecedor;
truncate table fornecedor_produto;

commit;

/*TABELA TIPO_ANIMAL*/

INSERT INTO TIPO_ANIMAL (id_tipo, nm_tipo) values (1, 'cachorro');
INSERT INTO TIPO_ANIMAL (id_tipo, nm_tipo) values (2, 'gato');

commit;

/*TABELA RACA_ANIMAL*/

INSERT INTO RACA_ANIMAL (id_raca, nm_raca, id_tipo) values (1, 'golden', 1);
INSERT INTO RACA_ANIMAL (id_raca, nm_raca, id_tipo) values (2, 'vira-lata', 2);

commit;

/*TABELA ESTADO*/

INSERT INTO ESTADO (uf, nm_estado) values ('SP', 'São Paulo');
INSERT INTO ESTADO (uf, nm_estado) values ('RJ', 'Rio de janeiro');
INSERT INTO ESTADO (uf, nm_estado) values ('MG', 'MINAS GERAI');
INSERT INTO ESTADO (uf, nm_estado) values ('ES', 'Espirito Santo');

commit;

/*TABELA CIDADE*/

INSERT INTO CIDADE (id_cidade, uf, nm_cidade) values (1, 'SP', 'CAMPINAS');
INSERT INTO CIDADE (id_cidade, uf, nm_cidade) values (2, 'SP', 'GUARULHOS');
INSERT INTO CIDADE (id_cidade, uf, nm_cidade) values (3, 'MG', 'Belo horizonte');
INSERT INTO CIDADE (id_cidade, uf, nm_cidade) values (4, 'ES', 'FLORIANOPOLIS');

commit;

/*TABLE CLIENTE*/

INSERT INTO CLIENTE (id_cliente, nm_cliente, email, logradouro, complemento, cep, id_cidade, uf, tp_cliente, comentario) 
values (1, 'Vitor', 'vtorresdantas7@gmail.com', 'Rua Jose', 'Casa', 123, 2, 'SP', 'PJ', 'teste');

INSERT INTO CLIENTE (id_cliente, nm_cliente, email, logradouro, complemento, cep, id_cidade, uf, tp_cliente, comentario) 
values (2, 'Matheus', 'matheus7@gmail.com', 'Rua joao', 'Apartamento', 4566, 1, 'SP', 'PJ', 'teste');

INSERT INTO CLIENTE (id_cliente, nm_cliente, email, logradouro, complemento, cep, id_cidade, uf, tp_cliente, comentario) 
values (3,'Kaique', 'kaique7@gmail.com', 'Rua Jose', 'Casa', 123, 2, 'SP', 'PF', 'teste');

INSERT INTO CLIENTE (id_cliente, nm_cliente, email, logradouro, complemento, cep, id_cidade, uf, tp_cliente, comentario) 
values (4, 'Victor', 'victor7@gmail.com', 'Rua victor', 'Apartamento', 45, 2, 'SP', 'PF', 'teste');

INSERT INTO CLIENTE (id_cliente, nm_cliente, email, logradouro, complemento, cep, id_cidade, uf, tp_cliente, comentario) 
values (5, 'Reinaldo', 'reinaldo7@gmail.com', 'Rua Jose', 'Casa', 123, 2, 'SP', 'PF', 'teste');

INSERT INTO CLIENTE (id_cliente, nm_cliente, email, logradouro, complemento, cep, id_cidade, uf, tp_cliente, comentario) 
values (6, 'Joao', 'joao7@gmail.com', 'Rua joao', 'Apartamento', 4566, 1, 'SP', 'PF', 'teste');

INSERT INTO CLIENTE (id_cliente, nm_cliente, email, logradouro, complemento, cep, id_cidade, uf, tp_cliente, comentario) 
values (7, 'Ester', 'ester7@gmail.com', 'Rua Jose', 'Casa', 123, 2, 'SP', 'PF', 'teste');

INSERT INTO CLIENTE (id_cliente, nm_cliente, email, logradouro, complemento, cep, id_cidade, uf, tp_cliente, comentario) 
values (8, 'Vitinho', 'vtinho@gmail.com', 'Rua dos campos', 'Apartamento', 172, 3, 'MG', 'PJ', 'teste');

commit;

/*TABELA ANIMAL*/

INSERT INTO ANIMAL (id_animal, nm_animal, dt_nascimento, id_raca, id_tipo, id_cliente) 
values (1, 'toto', '01/01/2001', 1, 1, 1);

INSERT INTO ANIMAL (id_animal, nm_animal, dt_nascimento, id_raca, id_tipo, id_cliente) 
values (2, 'rex', '02/05/1998', 2, 2, 2);

commit;

/*b. Inserir pelo menos 5 clientes PF e 2 clientes PJ.*/

/* TABELA PJ*/

INSERT INTO PJ (cnpj, pj_id, id_cliente) values (12345, 1, 1);
INSERT INTO PJ (cnpj, pj_id, id_cliente) values (45678, 2, 2);

commit;

/* TABELA PF*/

INSERT INTO PF (cpf, dt_nascimento, id_cliente) values (123, '09/08/2001', 3);
INSERT INTO PF (cpf, dt_nascimento, id_cliente) values (456, '05/07/2006', 4);
INSERT INTO PF (cpf, dt_nascimento, id_cliente) values (678, '08/07/2006', 5);
INSERT INTO PF (cpf, dt_nascimento, id_cliente) values (910, '08/01/1986', 6);
INSERT INTO PF (cpf, dt_nascimento, id_cliente) values (131, '09/08/2002', 7);

commit;

/* TABELA DEVOLUÇÃO*/

INSERT INTO DEVOLUCAO (id_devolucao, dt_devolucao, cpf) values (1, '15/09/2022', 678);
INSERT INTO DEVOLUCAO (id_devolucao, dt_devolucao, cpf) values (10, '12/08/2002', 123);

commit;

/* TABELA RESERVA */

INSERT INTO RESERVA (id_reserva, dt_reserva, dt_retirada, pj_id) 
values (1, '01/10/2022', '16/09/2022', 1);

INSERT INTO RESERVA (id_reserva, dt_reserva, dt_retirada, pj_id) 
values (2, '10/10/2022', '18/09/2022', 2);

commit;

/* TABELA LOJA*/

INSERT INTO LOJA (id_loja, nm_loja, nr_telefone) 
values (1, 'Filial A', 99955555);

INSERT INTO LOJA (id_loja, nm_loja, nr_telefone) 
values (2, 'Filial B', 8888444);

commit;

/* TABELA FORNECEDOR */

INSERT INTO FORNECEDOR (id_fornecedor, nm_fornecedor) values (1, 'FIAP');

INSERT INTO FORNECEDOR (id_fornecedor, nm_fornecedor) values (2, 'ALURA');

commit;

/* TABELA UNIDADE PRODUTO */

INSERT INTO UNIDADE_PRODUTO (id_unidade, ds_unidade) values (1, 'Shampoo');

INSERT INTO UNIDADE_PRODUTO (id_unidade, ds_unidade) values (2, 'Perfume');

INSERT INTO UNIDADE_PRODUTO (id_unidade, ds_unidade) values (3, 'Banho');

INSERT INTO UNIDADE_PRODUTO (id_unidade, ds_unidade) values (4, 'Tosa');

commit;

/* TABELA STATUS_PRODUTO */

INSERT INTO STATUS_PRODUTO (id_status, ds_status) values (1, 'Em estoque');

INSERT INTO STATUS_PRODUTO (id_status, ds_status) values (2, 'Fora de estoque');

commit;

/* TABELA PRODUTO */

INSERT INTO PRODUTO (id_produto, nm_produto, vl_unitario, id_unidade, id_status)
values (1, 'Shampoo neutro', 15, 1, 1);

INSERT INTO PRODUTO (id_produto, nm_produto, vl_unitario, id_unidade, id_status)
values (2, 'Perfume frescor', 35, 2, 2);

INSERT INTO PRODUTO (id_produto, nm_produto, vl_unitario, id_unidade, id_status)
values (3, 'Banho', 75, 3, 1);

INSERT INTO PRODUTO (id_produto, nm_produto, vl_unitario, id_unidade, id_status)
values (4, 'Tosa', 45, 4, 1);

INSERT INTO PRODUTO (id_produto, nm_produto, vl_unitario, id_unidade, id_status)
values (5, 'Acao do pet shop', 25000, 4, 1);

commit;

/* TABELA FORNECEDOR_PRODUTO */

INSERT INTO FORNECEDOR_PRODUTO (id_fornecedor, id_produto) values (1, 1);

INSERT INTO FORNECEDOR_PRODUTO (id_fornecedor, id_produto) values (1, 2);

commit;

/* TABELA ESTOQUE_PRODUTO */

INSERT INTO ESTOQUE_PRODUTO (qtd_estoque, id_loja, id_produto) 
values (10, 1, 1);

INSERT INTO ESTOQUE_PRODUTO (qtd_estoque, id_loja, id_produto) 
values (8, 1, 2);

INSERT INTO ESTOQUE_PRODUTO (qtd_estoque, id_loja, id_produto) 
values (1, 2, 3);

INSERT INTO ESTOQUE_PRODUTO (qtd_estoque, id_loja, id_produto) 
values (2, 2, 4);

commit;

/* TABELA RESERVA_PRODUTOS */

INSERT INTO RESERVA_PRODUTOS (qtd, id_reserva, id_produto) 
values (5, 1, 1);

INSERT INTO RESERVA_PRODUTOS (qtd, id_reserva, id_produto) 
values (5, 2, 2);

commit;

/* TABELA VENDEDOR */

INSERT INTO VENDEDOR (id_vendedor, nm_vendedor) values (1, 'Leandro');

INSERT INTO VENDEDOR (id_vendedor, nm_vendedor, dt_admissao) values (2, 'Kaique', '06/08/2021');

commit;

/*c. Inserir pelo menos 5 vendas para diferentes clientes (distribuídas entre clientes PF e PJ). Em
cada venda devem existir pelo menos 2 produtos*/

INSERT INTO VENDA (id_venda, dt_venda, id_cliente, id_vendedor, id_loja) 
values (10, '02/08/2021', 1, 1, 1);

INSERT INTO ITENS_VENDA (qtd, vl_unit_venda, id_venda, id_vendedor, id_produto)
values (15, 15, 10, 1, 4);

INSERT INTO ITENS_VENDA (qtd, vl_unit_venda, id_venda, id_vendedor, id_produto)
values (100, 50, 10, 1, 5);

/* TABELA VENDA E ITENS_VENDA */

INSERT INTO VENDA (id_venda, dt_venda, id_cliente, id_vendedor, id_loja) 
values (1, '06/09/2022', 1, 1, 1);

INSERT INTO ITENS_VENDA (qtd, vl_unit_venda, id_venda, id_vendedor, id_produto)
values (1, 15, 1, 1, 1);

INSERT INTO ITENS_VENDA (qtd, vl_unit_venda, id_venda, id_vendedor, id_produto)
values (1, 15, 1, 1, 2);

commit;

INSERT INTO VENDA (id_venda, dt_venda, id_cliente, id_vendedor, id_loja) 
values (2, '07/09/2022', 2, 2, 2);

INSERT INTO ITENS_VENDA (qtd, vl_unit_venda, id_venda, id_vendedor, id_produto)
values (2, 45, 2, 2, 2);

INSERT INTO ITENS_VENDA (qtd, vl_unit_venda, id_venda, id_vendedor, id_produto)
values (2, 45, 2, 2, 1);

commit;

INSERT INTO VENDA (id_venda, dt_venda, id_cliente, id_vendedor, id_loja) 
values (3, '08/09/2022', 3, 1, 1);

INSERT INTO ITENS_VENDA (qtd, vl_unit_venda, id_venda, id_vendedor, id_produto)
values (3, 25, 3, 1, 1);

INSERT INTO ITENS_VENDA (qtd, vl_unit_venda, id_venda, id_vendedor, id_produto)
values (3, 25, 3, 1, 2);

commit;

INSERT INTO VENDA (id_venda, dt_venda, id_cliente, id_vendedor, id_loja) 
values (4, '09/09/2022', 4, 2, 2);

INSERT INTO ITENS_VENDA (qtd, vl_unit_venda, id_venda, id_vendedor, id_produto)
values (10, 50, 4, 2, 2);

INSERT INTO ITENS_VENDA (qtd, vl_unit_venda, id_venda, id_vendedor, id_produto)
values (10, 50, 4, 2, 1);

commit;

INSERT INTO VENDA (id_venda, dt_venda, id_cliente, id_vendedor, id_loja) 
values (5, '10/09/2022', 5, 1, 1);

INSERT INTO ITENS_VENDA (qtd, vl_unit_venda, id_venda, id_vendedor, id_produto)
values (2, 75, 5, 1, 1);

INSERT INTO ITENS_VENDA (qtd, vl_unit_venda, id_venda, id_vendedor, id_produto)
values (2, 75, 5, 1, 2);

commit;

INSERT INTO VENDA (id_venda, dt_venda, id_cliente, id_vendedor, id_loja) 
values (6, '10/09/2022', 5, 1, 1);

INSERT INTO ITENS_VENDA (qtd, vl_unit_venda, id_venda, id_vendedor, id_produto)
values (1, 150000, 6, 1, 5);

commit;

/* TABELA DEVOLUCAO_PRODUTOS */

INSERT INTO DEVOLUCAO_PRODUTOS (qtd, id_venda, id_produto, id_devolucao) 
values (3, 1, 1, 1);

INSERT INTO DEVOLUCAO_PRODUTOS (qtd, id_venda, id_produto, id_devolucao) 
values (2, 2, 1, 1);

/*Tarefa 2: Modificação e Remoção de dados
No mesmo script usado para colocar os comandos da tarefa 1, adicione comandos para executar as ações
abaixo. Cada item deve ser uma transação SQL diferente, devidamente efetivada.*/

/*a. Modificar o nome de um dos clientes. Use o CPF para identificar qual o cliente que terá o
nome modificado.*/

UPDATE CLIENTE
SET nm_cliente = 'Pedro'
WHERE ID_CLIENTE IN (
SELECT ID_CLIENTE
FROM PF
WHERE CPF = 123);

commit;

/*b. Modificar a quantidade em estoque de um produto “x” em uma loja “y”. (lembre-se que a
quantidade de estoque de cada produto é por loja, como definido na fase de projeto)*/

UPDATE ESTOQUE_PRODUTO
SET qtd_estoque = 75
WHERE id_loja = 1 AND id_produto = 1;

commit;

/*c. Remover uma das vendas cadastradas no item “c” data tarefa 1. Lembre-se que remover uma
venda implica, obrigatoriamente, em remover os itens daquela venda.*/

DELETE FROM ITENS_VENDA
where id_venda = 5;

commit;

DELETE FROM VENDA
WHERE id_venda = 5;

commit;


