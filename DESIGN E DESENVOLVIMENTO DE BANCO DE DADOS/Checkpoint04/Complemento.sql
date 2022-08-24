# Inserir dados

INSERT INTO tb_auditoria (id_auditoria, nm_usuario, nm_tabela, tp_comando, dt_alteracao, status) values (1, 'vitor', 'teste', 'DELETE', TO_DATE('0101/2020', 'dd/mm/yyyy'), 2);

INSERT INTO tb_auditoria (id_auditoria, nm_usuario, nm_tabela, tp_comando, dt_alteracao, status) values (4, 'vitor', 'teste', 'TESTE', TO_DATE('0101/2020', 'dd/mm/yyyy'), 2);

SELECT * FROM tb_auditoria;
