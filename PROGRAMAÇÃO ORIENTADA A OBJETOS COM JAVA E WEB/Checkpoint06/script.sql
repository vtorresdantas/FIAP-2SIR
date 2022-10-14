/*a)  remover todos os objetos que serão criados ao executar o script.*/

DROP TABLE JAVA_CATEGORIA CASCADE CONSTRAINTS;
DROP TABLE JAVA_PRODUTO CASCADE CONSTRAINTS;
DROP TABLE JAVA_PEDIDO CASCADE CONSTRAINTS;
DROP TABLE JAVA_PEDIDODETALHE CASCADE CONSTRAINTS;

/* Criação das sequences */

create sequence categoria_sequence
  MINVALUE 1
  MAXVALUE 99999999
  start WITH 1;

  create sequence produto_sequence
  MINVALUE 1000
  MAXVALUE 99999999
  start WITH 1000;
  
  
create sequence pedido_sequence
  MINVALUE 1000
  MAXVALUE 99999999
  start WITH 1000;
  
  create sequence detalhe_sequence
  MINVALUE 10
  MAXVALUE 99999999
  start WITH 10;

/* Criação da tabela java_categoria */

CREATE TABLE java_categoria (
    categoria_id     NUMBER(10) NOT NULL,
    categoria varchar2(50)
)
LOGGING;

ALTER TABLE java_categoria ADD CONSTRAINT id_categoria_pk PRIMARY KEY (categoria_id);

/* Criação da tabela java_produto */

CREATE TABLE java_produto (
    produto_id    NUMBER(10) NOT NULL,
    categoria_id    NUMBER(10) NOT NULL,
    nome varchar2(50),
    descricao varchar2(50),
    preco number(10,2)
)
LOGGING;

ALTER TABLE java_produto ADD CONSTRAINT id_produto_pk PRIMARY KEY (produto_id);

ALTER TABLE java_produto
    ADD CONSTRAINT id_categoria_fk FOREIGN KEY (categoria_id)
        REFERENCES java_categoria (categoria_id)
    NOT DEFERRABLE;
    
/* Criação da tabela java_pedido */

CREATE TABLE java_pedido (
    pedido_id    NUMBER(10) NOT NULL,
    nome_contato varchar2(50),
    endereco_contato varchar2(50),
    data DATE
)
LOGGING;

ALTER TABLE java_pedido ADD CONSTRAINT id_pedido_pk PRIMARY KEY (pedido_id);

/* Criação da tabela java_pedidodetalhe */

CREATE TABLE java_pedidodetalhe (
    id    NUMBER(10) NOT NULL,
    pedido_id    NUMBER(10) NOT NULL,
    produto_id    NUMBER(10) NOT NULL,
    quantidade number,
    total number(10,2)
  
)
LOGGING;

ALTER TABLE java_pedidodetalhe ADD CONSTRAINT id_pedidodetalhe_pk PRIMARY KEY (id);

ALTER TABLE java_pedidodetalhe
    ADD CONSTRAINT id_pedido_fk FOREIGN KEY (pedido_id)
        REFERENCES java_pedido (pedido_id)
    NOT DEFERRABLE;
    
ALTER TABLE java_pedidodetalhe
    ADD CONSTRAINT id_produto_fk FOREIGN KEY (produto_id)
        REFERENCES java_produto (produto_id)
    NOT DEFERRABLE;
    
    


