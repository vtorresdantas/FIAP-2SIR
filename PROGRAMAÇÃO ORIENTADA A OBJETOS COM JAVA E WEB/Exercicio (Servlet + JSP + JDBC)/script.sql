DROP SEQUENCE EMPREGADO_SEQUENCE;
DROP SEQUENCE JAVA_DEPARTAMENTO;
DROP TABLE java_departamento CASCADE CONSTRAINTS;
DROP TABLE java_empregado CASCADE CONSTRAINTS;

create sequence empregado_sequence
    MINVALUE 1
    MAXVALUE 9999999
    start with 1000
    cache 20;

commit;

create table java_departamento (
  id number(10, 0) primary key,
  nome varchar2(50) not null unique
);

commit;

create table java_empregado (
  id number(10, 0),
  id_departamento number(10, 0),
  nome varchar2(100) not null,
  cpf varchar2(14),
  primary key(id),
  foreign key (id_departamento) references java_departamento(id)
);
commit;

insert into java_departamento values(1, 'Vendas');
insert into java_departamento values(2, 'Compras');
insert into java_departamento values(3, 'Comunicação');
insert into java_departamento values(4, 'Financeiro');
commit;

insert into java_empregado values(empregado_sequence.nextval, 1, 'Ana Maria', '123.456.789-10');
insert into java_empregado values(empregado_sequence.nextval, 1, 'Xuxa Meneguel', '234.567.890-11');
insert into java_empregado values(empregado_sequence.nextval, 2, 'Pedro Bial', '111.111.111-11');
insert into java_empregado values(empregado_sequence.nextval, 2, 'Fernanda Montenegro', '222.222.222-22');
insert into java_empregado values(empregado_sequence.nextval, 3, 'Lima Duarte', '333.333.333-33');
insert into java_empregado values(empregado_sequence.nextval, 3, 'Osmar Prado', '444.444.444-44');
insert into java_empregado values(empregado_sequence.nextval, 4, 'Marilia Pera', '555.555.555-55');
insert into java_empregado values(empregado_sequence.nextval, 4, 'Meryl Streep', '666.666.666-66');
commit;