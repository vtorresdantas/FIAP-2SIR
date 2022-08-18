/*a) Deve conter obrigatoriamente no início os comandos para remover todos os objetos que
serão criados ao executar o script.*/

DROP TABLE ESTADO CASCADE CONSTRAINTS;
DROP TABLE CIDADE CASCADE CONSTRAINTS;
DROP TABLE ANIMAL CASCADE CONSTRAINTS;
DROP TABLE RACA_ANIMAL CASCADE CONSTRAINTS;
DROP TABLE TIPO_ANIMAL CASCADE CONSTRAINTS;
DROP TABLE CLIENTE CASCADE CONSTRAINTS;
DROP TABLE PF CASCADE CONSTRAINTS;
DROP TABLE PJ CASCADE CONSTRAINTS;
DROP TABLE DEVOLUCAO CASCADE CONSTRAINTS;
DROP TABLE RESERVA CASCADE CONSTRAINTS;
DROP TABLE DEVOLUCAO_PRODUTOS CASCADE CONSTRAINTS;
DROP TABLE RESERVA_PRODUTOS CASCADE CONSTRAINTS;
DROP TABLE VENDA CASCADE CONSTRAINTS;
DROP TABLE VENDEDOR CASCADE CONSTRAINTS;
DROP TABLE ITENS_VENDA CASCADE CONSTRAINTS;
DROP TABLE LOJA CASCADE CONSTRAINTS;
DROP TABLE ESTOQUE_PRODUTO CASCADE CONSTRAINTS;
DROP TABLE PRODUTO CASCADE CONSTRAINTS;
DROP TABLE UNIDADE_PRODUTO CASCADE CONSTRAINTS;
DROP TABLE STATUS_PRODUTO CASCADE CONSTRAINTS;
DROP TABLE FORNECEDOR CASCADE CONSTRAINTS;
DROP TABLE FORNECEDOR_PRODUTO CASCADE CONSTRAINTS;

/*b) Criação de todas as tabelas e constraints com os mesmos nomes apresentados no modelo
relacional. */

/* CRIAÇÃO DA TABELA ANIMAL*/

CREATE TABLE animal (
    id_animal     INTEGER NOT NULL,
    nm_animal     VARCHAR2 (20) NOT NULL,
    dt_nascimento DATE,
    id_raca       INTEGER NOT NULL,
    id_tipo       INTEGER NOT NULL,
    id_cliente    INTEGER NOT NULL
)
LOGGING;

ALTER TABLE animal ADD CONSTRAINT animal_pk PRIMARY KEY ( id_animal );

/* CRIAÇÃO DA TABELA CIDADE*/

CREATE TABLE cidade (
    id_cidade INTEGER NOT NULL,
    uf        VARCHAR2(10) NOT NULL,
    nm_cidade VARCHAR2(50) NOT NULL
)
LOGGING;

ALTER TABLE cidade ADD CONSTRAINT cidade_pk PRIMARY KEY ( id_cidade,uf );

/* CRIAÇÃO DA TABELA CLIENTEE*/

CREATE TABLE cliente (
    id_cliente  INTEGER NOT NULL,
    nm_cliente  VARCHAR2(50) NOT NULL,
    email       VARCHAR2(50) NOT NULL,
    logradouro  VARCHAR2(50),
    complemento VARCHAR2(50),
    cep         INTEGER,
    id_cidade   INTEGER,
    uf          VARCHAR2(10),
    tp_cliente  VARCHAR(2) NOT NULL
)
LOGGING;

ALTER TABLE cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( id_cliente );

ALTER TABLE cliente ADD CONSTRAINT email UNIQUE ( email );

/* CRIAÇÃO DA TABELA DEVOLUCAO*/

CREATE TABLE devolucao (
    id_devolucao INTEGER NOT NULL,
    dt_devolucao DATE DEFAULT SYSDATE NOT NULL,
    cpf          INTEGER NOT NULL
)
LOGGING;

ALTER TABLE devolucao ADD CONSTRAINT devolucao_pk PRIMARY KEY ( id_devolucao );

CREATE TABLE devolucao_produtos (
    qtd          INTEGER NOT NULL,
    id_venda     INTEGER NOT NULL,
    id_produto   INTEGER NOT NULL,
    id_devolucao INTEGER NOT NULL
)
LOGGING;

ALTER TABLE devolucao_produtos
    ADD CONSTRAINT devolucao_produtos_pk PRIMARY KEY ( id_devolucao,
                                                       id_produto,
                                                       id_venda );
                                                       
/* CRIAÇÃO DA TABELA ESTADO*/  

CREATE TABLE estado (
    uf        VARCHAR2(10) NOT NULL,
    nm_estado VARCHAR2(50) NOT NULL
)
LOGGING;

ALTER TABLE estado ADD CONSTRAINT estado_pk PRIMARY KEY ( uf );

/* CRIAÇÃO DA TABELA ESTOQUE_PRODUTO*/

CREATE TABLE estoque_produto (
    qtd_estoque INTEGER NOT NULL,
    id_loja     INTEGER NOT NULL,
    id_produto  INTEGER NOT NULL
)
LOGGING;

ALTER TABLE estoque_produto ADD CONSTRAINT estoque_produto_pk PRIMARY KEY ( id_loja,
                                                                            id_produto );

/* CRIAÇÃO DA TABELA FORNECEDOR*/

CREATE TABLE fornecedor (
    id_fornecedor INTEGER NOT NULL,
    nm_fornecedor VARCHAR2(50) NOT NULL
)
LOGGING;

ALTER TABLE fornecedor ADD CONSTRAINT fornecedor_pk PRIMARY KEY ( id_fornecedor );

/* CRIAÇÃO DA TABELA FORNECEDOR_PRODUTO*/

CREATE TABLE fornecedor_produto (
    id_fornecedor INTEGER NOT NULL,
    id_produto    INTEGER NOT NULL
)
LOGGING;

ALTER TABLE fornecedor_produto ADD CONSTRAINT fornecedor_produto_pk PRIMARY KEY ( id_fornecedor,
                                                                                  id_produto );

/* CRIAÇÃO DA TABELA ITENS_VENDA*/

CREATE TABLE itens_venda (
    qtd           INTEGER NOT NULL,
    vl_unit_venda NUMBER,
    id_venda      INTEGER NOT NULL,
    id_vendedor   INTEGER NOT NULL,
    id_produto    INTEGER NOT NULL
)
LOGGING;

ALTER TABLE itens_venda ADD CONSTRAINT itens_venda_pk PRIMARY KEY ( id_venda,
                                                                    id_produto );
                                                                                                                       
/* CRIAÇÃO DA TABELA LOJA*/

CREATE TABLE loja (
    id_loja     INTEGER NOT NULL,
    nm_loja     VARCHAR2(50) NOT NULL,
    nr_telefone NUMBER
)
LOGGING;

ALTER TABLE loja ADD CONSTRAINT loja_pk PRIMARY KEY ( id_loja );

/* CRIAÇÃO DA TABELA PF*/

CREATE TABLE pf (
    cpf           INTEGER,
    dt_nascimento DATE,
    id_cliente    INTEGER NOT NULL
)
LOGGING;

ALTER TABLE pf ADD CONSTRAINT cpf UNIQUE ( cpf );

/* CRIAÇÃO DA TABELA PJ*/

CREATE TABLE pj (
    cnpj       INTEGER NOT NULL,
    pj_id      INTEGER NOT NULL,
    id_cliente INTEGER NOT NULL
)
LOGGING;

ALTER TABLE pj ADD CONSTRAINT pj_pk PRIMARY KEY ( pj_id );

/* CRIAÇÃO DA TABELA PRODUTO*/

CREATE TABLE produto (
    id_produto  INTEGER NOT NULL,
    nm_produto  VARCHAR2(50) NOT NULL,
    vl_unitario NUMBER NOT NULL,
    id_unidade  INTEGER NOT NULL,
    id_status   INTEGER NOT NULL
)
LOGGING;

ALTER TABLE produto ADD CONSTRAINT produto_pk PRIMARY KEY ( id_produto );

/* CRIAÇÃO DA TABELA RACA_ANIMAL*/

CREATE TABLE raca_animal (
    id_raca INTEGER NOT NULL,
    nm_raca VARCHAR2(50) NOT NULL,
    id_tipo INTEGER NOT NULL
)
LOGGING;

ALTER TABLE raca_animal ADD CONSTRAINT raca_animal_pk PRIMARY KEY ( id_raca,
                                                                    id_tipo );
                                                                    
/* CRIAÇÃO DA TABELA RESERVA*/

CREATE TABLE reserva (
    id_reserva  INTEGER NOT NULL,
    dt_reserva  DATE DEFAULT SYSDATE NOT NULL,
    dt_retirada DATE DEFAULT SYSDATE NOT NULL,
    pj_id       INTEGER NOT NULL
)
LOGGING;

ALTER TABLE reserva ADD CONSTRAINT reserva_pk PRIMARY KEY ( id_reserva );

/* CRIAÇÃO DA TABELA RESERVA_PRODUTOS*/

CREATE TABLE reserva_produtos (
    qtd        INTEGER NOT NULL,
    id_reserva INTEGER NOT NULL,
    id_produto INTEGER NOT NULL
)
LOGGING;

ALTER TABLE reserva_produtos ADD CONSTRAINT reserva_produtos_pk PRIMARY KEY ( id_produto,
                                                                              id_reserva );

/* CRIAÇÃO DA TABELA STATUS_PRODUTO*/

CREATE TABLE status_produto (
    id_status INTEGER NOT NULL,
    ds_status VARCHAR2(50) NOT NULL
)
LOGGING;

ALTER TABLE status_produto ADD CONSTRAINT status_produto_pk PRIMARY KEY ( id_status );

/* CRIAÇÃO DA TABELA TIPO_ANIMAL*/

CREATE TABLE tipo_animal (
    id_tipo INTEGER NOT NULL,
    nm_tipo VARCHAR2(50)
)
LOGGING;

ALTER TABLE tipo_animal ADD CONSTRAINT tipo_animal_pk PRIMARY KEY ( id_tipo );

/* CRIAÇÃO DA TABELA UNIDADE_PRODUTO*/

CREATE TABLE unidade_produto (
    id_unidade INTEGER NOT NULL,
    ds_unidade VARCHAR2(50)
)
LOGGING;

ALTER TABLE unidade_produto ADD CONSTRAINT unidade_produto_pk PRIMARY KEY ( id_unidade );

/* CRIAÇÃO DA TABELA VENDA*/

CREATE TABLE venda (
    id_venda    INTEGER NOT NULL,
    dt_venda    DATE NOT NULL,
    id_cliente  INTEGER NOT NULL,
    id_vendedor INTEGER NOT NULL,
    id_loja     INTEGER NOT NULL
)
LOGGING;

ALTER TABLE venda ADD CONSTRAINT venda_pk PRIMARY KEY ( id_venda );

/* CRIAÇÃO DA TABELA VENDEDOR*/

CREATE TABLE vendedor (
    id_vendedor        INTEGER NOT NULL,
    nm_vendedor        VARCHAR2(50) NOT NULL,
    dt_admissao        DATE,
    dt_demissao        DATE,
    id_vend_aprov_item INTEGER
)
LOGGING;

ALTER TABLE vendedor ADD CONSTRAINT vendedor_pk PRIMARY KEY ( id_vendedor );

ALTER TABLE animal
    ADD CONSTRAINT animal_cliente_fk FOREIGN KEY ( id_cliente )
        REFERENCES cliente ( id_cliente )
    NOT DEFERRABLE;
ALTER TABLE animal
    ADD CONSTRAINT animal_raca_animal_fk FOREIGN KEY ( id_raca,
                                                       id_tipo )
        REFERENCES raca_animal ( id_raca,
                                 id_tipo )
    NOT DEFERRABLE;
ALTER TABLE cidade
    ADD CONSTRAINT cidade_estado_fk FOREIGN KEY ( uf )
        REFERENCES estado ( uf )
    NOT DEFERRABLE;
ALTER TABLE cliente
    ADD CONSTRAINT cliente_cidade_fk FOREIGN KEY ( id_cidade,
                                                   uf )
        REFERENCES cidade ( id_cidade,
                            uf )
    NOT DEFERRABLE;
ALTER TABLE devolucao
    ADD CONSTRAINT devolucao_pf_fk FOREIGN KEY ( cpf )
        REFERENCES pf ( cpf )
    NOT DEFERRABLE;
ALTER TABLE devolucao_produtos
    ADD CONSTRAINT devolucao_produtos_itens_venda_fk FOREIGN KEY ( id_venda,
                                                                   id_produto )
        REFERENCES itens_venda ( id_venda,
                                 id_produto )
    NOT DEFERRABLE;
ALTER TABLE devolucao_produtos
    ADD CONSTRAINT devolucao_produtos_devolucao_fk FOREIGN KEY ( id_devolucao )
        REFERENCES devolucao ( id_devolucao )
    NOT DEFERRABLE;
ALTER TABLE estoque_produto
    ADD CONSTRAINT estoque_produto_loja_fk FOREIGN KEY ( id_loja )
        REFERENCES loja ( id_loja )
    NOT DEFERRABLE;
ALTER TABLE estoque_produto
    ADD CONSTRAINT estoque_produto_produto_fk FOREIGN KEY ( id_produto )
        REFERENCES produto ( id_produto )
    NOT DEFERRABLE;
ALTER TABLE fornecedor_produto
    ADD CONSTRAINT fornecedor_produto_fornecedor_fk FOREIGN KEY ( id_fornecedor )
        REFERENCES fornecedor ( id_fornecedor )
    NOT DEFERRABLE;
ALTER TABLE fornecedor_produto
    ADD CONSTRAINT fornecedor_produto_produto_fk FOREIGN KEY ( id_produto )
        REFERENCES produto ( id_produto )
    NOT DEFERRABLE;
ALTER TABLE itens_venda
    ADD CONSTRAINT itens_venda_vendedor_fk FOREIGN KEY ( id_vendedor )
        REFERENCES vendedor ( id_vendedor )
    NOT DEFERRABLE;
ALTER TABLE itens_venda
    ADD CONSTRAINT itens_venda_venda_fk FOREIGN KEY ( id_venda )
        REFERENCES venda ( id_venda )
    NOT DEFERRABLE;
ALTER TABLE itens_venda
    ADD CONSTRAINT itens_venda_produto_fk FOREIGN KEY ( id_produto )
        REFERENCES produto ( id_produto )
    NOT DEFERRABLE;
ALTER TABLE pf
    ADD CONSTRAINT pf_cliente_fk FOREIGN KEY ( id_cliente )
        REFERENCES cliente ( id_cliente )
    NOT DEFERRABLE;
ALTER TABLE pj
    ADD CONSTRAINT pj_cliente_fk FOREIGN KEY ( id_cliente )
        REFERENCES cliente ( id_cliente )
    NOT DEFERRABLE;
ALTER TABLE produto
    ADD CONSTRAINT produto_status_produto_fk FOREIGN KEY ( id_status )
        REFERENCES status_produto ( id_status )
    NOT DEFERRABLE;
ALTER TABLE produto
    ADD CONSTRAINT produto_unidade_produto_fk FOREIGN KEY ( id_unidade )
        REFERENCES unidade_produto ( id_unidade )
    NOT DEFERRABLE;
ALTER TABLE raca_animal
    ADD CONSTRAINT raca_animal_tipo_animal_fk FOREIGN KEY ( id_tipo )
        REFERENCES tipo_animal ( id_tipo )
    NOT DEFERRABLE;
ALTER TABLE reserva
    ADD CONSTRAINT reserva_pj_fk FOREIGN KEY ( pj_id )
        REFERENCES pj ( pj_id )
    NOT DEFERRABLE;
ALTER TABLE reserva_produtos
    ADD CONSTRAINT reserva_produtos_produto_fk FOREIGN KEY ( id_produto )
        REFERENCES produto ( id_produto )
    NOT DEFERRABLE;
ALTER TABLE reserva_produtos
    ADD CONSTRAINT reserva_produtos_reserva_fk FOREIGN KEY ( id_reserva )
        REFERENCES reserva ( id_reserva )
    NOT DEFERRABLE;
ALTER TABLE venda
    ADD CONSTRAINT venda_loja_fk FOREIGN KEY ( id_loja )
        REFERENCES loja ( id_loja )
    NOT DEFERRABLE;
ALTER TABLE venda
    ADD CONSTRAINT venda_vendedor_fk FOREIGN KEY ( id_vendedor )
        REFERENCES vendedor ( id_vendedor )
    NOT DEFERRABLE;
ALTER TABLE venda
    ADD CONSTRAINT venda_cliente_fk FOREIGN KEY ( id_cliente )
        REFERENCES cliente ( id_cliente )
    NOT DEFERRABLE;
ALTER TABLE vendedor
    ADD CONSTRAINT vendedor_vendedor_fk FOREIGN KEY ( id_vend_aprov_item )
        REFERENCES vendedor ( id_vendedor )
    NOT DEFERRABLE;

/*c) Em pelo menos duas das tabelas, deve existir uma coluna com um valor DEFAULT*/

/* As tabelas devolucao (DT_DEVOLUCAO) e reserva (DT_RESERVA, DT_RETIRADA) possuem valor DEFAULT*/

/*d) O script deve conter a criação de índexes. Você pode cria-los conforme julgar necessário, mas
é obrigatório:
i. Pelo menos 10 índices distribuídos em diferentes tabelas
ii. Em pelo menos 2 das tabelas, deve existir pelo menos 2 índices além da chave
primária
iii. Em pelo menos uma das tabelas, deve existir um índice composto*/

CREATE INDEX indice_devolucao ON DEVOLUCAO (DT_DEVOLUCAO);

CREATE INDEX indice_reseva ON RESERVA (DT_RESERVA, DT_RETIRADA);

CREATE INDEX indice_vendedor ON VENDEDOR (DT_ADMISSAO, DT_DEMISSAO);

CREATE INDEX indice_reserva_produtos ON RESERVA_PRODUTOS (qtd);

CREATE INDEX indice_produto ON PRODUTO (vl_unitario);

CREATE INDEX indice_estoque_produto ON ESTOQUE_PRODUTO (qtd_estoque);

CREATE INDEX indice_estado ON  ESTADO (nm_estado);

CREATE INDEX indice_cidade ON  CIDADE (nm_cidade);

CREATE INDEX indice_venda ON VENDA (dt_venda);

/*e) Ao final do script, escreva um comando que adicione uma coluna na tabela de cliente. A nova
coluna deve se chamar COMENTARIO, ser opcional e ter o tipo de dado varchar2(500). Em
seguida, escreva o comando SQL que altera a coluna COMMENTARIO para que ela seja um
varchar2 (800).*/

ALTER TABLE CLIENTE ADD COMENTARIO VARCHAR2(500);

ALTER TABLE CLIENTE MODIFY COMENTARIO VARCHAR2(800);




