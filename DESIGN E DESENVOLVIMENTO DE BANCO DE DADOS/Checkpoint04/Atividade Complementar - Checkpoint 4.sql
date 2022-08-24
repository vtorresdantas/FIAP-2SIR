
/*1) Connected com seu usuário no banco de dados, abra uma "tabsheet" and execute o seguinte comando:*/
EXEC PF0400.SET_ACCESS_PROF;

/*2) crie no seu usuário a uma tabela chamada TB_AUDITORIA com as seguintes colunas e as constraints necessárias

id_auditoria  number(10)       -- vai ser a chave primária da tabela
nm_usuario    varchar2(50)     -- vai conter o nome do usuario que fez a alteração e é um campo obrigatório
nm_tabela     varchar2(35)     -- vai conter o nome da tabela sendo alterada e é um campo obrigatório
tp_comando    varchar2(30)     -- vai conter o tipo de comando que deve ser obrigatoriamente um dos tres valores: INSERT ou UPDATE ou DELETE

Descreva as colunas da tabela usando:
DESC TB_AUDITORIA*/

DROP TABLE tb_auditoria CASCADE CONSTRAINTS;


CREATE TABLE tb_auditoria (
    id_auditoria  NUMBER(10) NOT NULL,
    nm_usuario     VARCHAR2 (50) NOT NULL,
    nm_tabela     VARCHAR2 (35) NOT NULL,
    tp_comando     VARCHAR2 (30) NOT NULL
)
LOGGING;

ALTER TABLE tb_auditoria ADD CONSTRAINT auditoria_pk PRIMARY KEY (id_auditoria);

ALTER TABLE tb_auditoria ADD CONSTRAINT tp_comando_check CHECK (tp_comando IN ('INSERT', 'UPDATE', 'DELETE'));

DESC TB_AUDITORIA;

/*3) Altere a tabela TB_AUDITORIA para que tenha duas novas colunas, conforme especificação abaixo:

dt_alteracao   date         -- deve ser obrigatória e conter o valor default SYSDATE
status         number(1)    -- deve conter o valor default 1*/

ALTER TABLE tb_auditoria ADD dt_alteracao date default sysdate not null;

ALTER TABLE tb_auditoria ADD status number(1);

/*4) Altere a tabela  TB_AUDITORIA de forma que a coluna status tenha o tipo de dados number(2)*/

ALTER TABLE tb_auditoria MODIFY status number(2);

/*5) execute o seguinte comando:

EXEC PF0400.SET_ACCESS_PROF*/

EXEC PF0400.SET_ACCESS_PROF;





