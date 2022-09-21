DROP TABLE JAVA_CLIENTE CASCADE CONSTRAINTS;
DROP TABLE JAVA_PRODUTO CASCADE CONSTRAINTS;
DROP TABLE JAVA_VENDA CASCADE CONSTRAINTS;

/* TABELA cliente */

CREATE TABLE java_cliente (
    id_cliente  INTEGER NOT NULL,
    nome  VARCHAR2(50) NOT NULL,
    email       VARCHAR2(50) NOT NULL,
    cpf  VARCHAR2(50)
)
LOGGING;

ALTER TABLE java_cliente ADD CONSTRAINT java_cliente_pk PRIMARY KEY ( id_cliente );

/* TABELA produto */

CREATE TABLE java_produto (
    id_produto  INTEGER NOT NULL,
    nome  VARCHAR2(50) NOT NULL,
    valor NUMBER NOT NULL,
    descricao  VARCHAR2(50) NOT NULL
)
LOGGING;

ALTER TABLE java_produto ADD CONSTRAINT java_produto_pk PRIMARY KEY ( id_produto );

/* TABELA venda */

CREATE TABLE java_venda (
    id_venda    INTEGER NOT NULL,
    data_venda    DATE NOT NULL,
    nome_vendedor  VARCHAR2(50) NOT NULL
)
LOGGING;

ALTER TABLE java_venda ADD CONSTRAINT java_venda_pk PRIMARY KEY ( id_venda );
