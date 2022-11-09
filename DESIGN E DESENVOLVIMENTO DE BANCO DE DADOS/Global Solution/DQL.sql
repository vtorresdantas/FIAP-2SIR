/* a. Mostrar todos os clientes que são pessoa física e todos os clientes cujo e-mail seja do GMAIL.
O relatório deve mostrar o nome do cliente e o e-mail. O nome do cliente deve ser mostrado
com a primeira letra de cada string em maiúsculo e o resto em minúsculo. O e-mail do cliente
deve ser mostrado em minúsculo. O resultado deve ser ordenado pelo nome do cliente de
maneira alfabética. As colunas devem ser nomeadas como: “Cliente” e “E-mail”. */

select INITCAP(nm_cliente) as "Cliente", lower(email) as "E-mail"
from cliente 
where tp_cliente = 'PF'  
and  email like '%@gmail.com'
order by nm_cliente;

/* b. Altere o comando feito no item “a” para que também mostre em qual cidade o cliente reside
e em qual estado (UF). Também garanta que todos os clientes de MG sejam mostrados,
independentemente se sejam PF ou PJ e do e-mail. Caso o cliente não possua a cidade e/ou
estado, eles devem aparecer no relatório mesmo assim. Nomeie as colunas como: “UF”,
“Cidade”, “Cliente” e “E-mail. Ordene o resultado de maneira ascendente de UF, cidade e
cliente */

select INITCAP(c.nm_cliente) as "Cliente", lower(c.email) as "E-mail", c.uf as "Estado", d.nm_cidade as "Cidade"
from cliente c JOIN cidade d
on (c.uf = d.uf and c.uf = 'MG' and d.uf = 'MG')
order by c.uf, d.nm_cidade, c.nm_cliente;

/* c. Mostrar todos os animais cadastrados. O relatório deve conter o nome do animal, o tipo do
animal, a raça do animal e a idade do animal. As colunas devem ser nomeadas como: Nome,
Tipo, Raça e Idade. O resultado deve ser ordenado de maneira ascendente pelo tipo e raça e,
de maneira descendente pela idade. */

select trunc((sysdate-dt_nascimento)/365) as "Idade", a.nm_animal as "Nome",
t.nm_tipo "Tipo de animal", r.nm_raca "Nome da raça"
from animal a
JOIN raca_animal r
on (a.id_raca = r.id_raca)
JOIN tipo_animal t
on (a.id_tipo = t.id_tipo)
order by t.nm_tipo, r.nm_raca asc, a.dt_nascimento desc;

/* d. Mostrar o nome de todos os clientes e seu CPF ou CNPJ, dependendo do tipo do cliente. O
relatório deve ter apenas 2 colunas: Nome e Identificação. Quando o cliente for pessoa física
a coluna identificação deve mostrar o CPF, quando for pessoa jurídica deve mostrar o CNPJ.
Ordene o resultado pelo nome do cliente em ordem alfabética. */

select distinct c.nm_cliente as nome, 
CASE WHEN c.tp_cliente = 'PJ' THEN d.cnpj
WHEN c.tp_cliente = 'PF' THEN e.cpf
END "Identificação"
from cliente c
LEFT OUTER JOIN pj d
ON (c.id_cliente = d.id_cliente)
LEFT OUTER JOIN pf e
ON (c.id_cliente = e.id_cliente)
order by c.nm_cliente;

/* e. Mostrar todas as vendas feitas no ano de 2022. O relatório deve conter o ID da venda (ou nr
da nota fiscal), a data da venda, o nome do cliente, o nome da loja, a quantidade de itens
vendidos em cada venda e o valor total de cada venda. As colunas devem ser nomeadas como:
Identificação Venda, data, cliente, loja, Qtd Itens e Valor Venda. Ordene o resultado
mostrando as vendas mais recentes primeiro e as mais antigas por fim e para cada data as
maiores vendas devem aparecer primeiro. */

select distinct b.id_venda as "Identificacao Venda", b.dt_venda as "data", c.nm_cliente as "cliente", 
d.nm_loja as "loja", e.vl_unit_venda as "Valor unitário", e.qtd as "Qtd itens",  e.qtd*e.vl_unit_venda as "Valor Venda"
from venda b
LEFT OUTER JOIN cliente c
ON (b.id_cliente = c.id_cliente)
LEFT OUTER JOIN loja d
ON (d.id_loja = b.id_loja)
LEFT OUTER JOIN itens_venda e
ON (e.id_venda = b.id_venda)
where dt_venda between  
TO_DATE('01/01/2022','DD/MM/YYYY') and 
TO_DATE('31/12/2022 23:59:59','DD/MM/YYYY HH24:mi:ss')
order by b.dt_venda desc, e.qtd*e.vl_unit_venda;

/* f. Mostrar os 10 clientes que mais gastaram no petshop nos últimos 12 meses(Este é o relatório
dos TOP 10 clientes). O relatório deve conter o nome do cliente, o e-mail e o total que eles
gastaram no petshop nos últimos 12 meses. As colunas devem ser nomeadas como: Cliente,
E-mail e Total Gasto. Ordene o resultado de forma a mostrar os que gastaram mais primeiro. */

select distinct c.nm_cliente as "cliente", c.email as "E-mail",  
e.qtd*e.vl_unit_venda as "Total gasto"
from venda b
LEFT OUTER JOIN cliente c 
ON (b.id_cliente = c.id_cliente)
LEFT OUTER JOIN itens_venda e
ON (b.id_venda = e.id_venda)
where dt_venda between  
TO_DATE('02/11/2021','DD/MM/YYYY') and 
TO_DATE('02/11/2022 23:59:59','DD/MM/YYYY HH24:mi:ss')
order by e.qtd*e.vl_unit_venda desc
fetch first 10 rows with ties;

/* g. Mostrar o nome da cidade e sua UF para qual se fez mais de 50.000,00 em vendas. O relatório
deve mostrar o nome da cidade, sua UF e o total e vendas. Nomeie as colunas como: Cidade,
UF e Total Vendas. Ordene o resultado de forma a mostra os totais de forma ascendente.
Dica: As vendas para uma cidade são as vendas para os clientes que residem naquela cidade */


select a.nm_cidade as "Cidade", b.uf as "UF", d.qtd*d.vl_unit_venda as "Total de vendas"
from cidade a
LEFT OUTER JOIN cliente b
on (b.id_cidade = a.id_cidade)
LEFT OUTER JOIN venda c
on (c.id_venda = b.id_cliente)
LEFT OUTER JOIN itens_venda d
on (c.id_venda = d.id_venda)
where d.qtd*d.vl_unit_venda >= 50000 
order by d.qtd*d.vl_unit_venda asc;

/* h. Mostrar os Dados de uma venda: Devem ser mostrados o ID da venda (ou nr da nota), a data
da venda, o nome do cliente, o nome do vendedor, o nome da loja, o nome e a quantidade
de dada produto, o valor unitário do item (*) e o valor total de cada item. Usem o identificador
da venda para encontrar a venda. As colunas devem ser nomeadas como: ID, Data Venda,
Cliente, Vendedor, Loja, Produto, Qtd, Valor Unitário, Total Item.
(*) => O valor unitário pode ser o valor de tabela ou o valor da venda. Se o valor da venda
estiver nulo, deve-se usar o valor unitário do produto, caso contrário, deve-se usar o valor
unitário da venda*/

select b.id_venda as "ID", b.dt_venda as "Data Venda", c.nm_cliente as "Cliente", 
d.nm_loja as "Loja", g.nm_produto as "Produto", f.nm_vendedor as "Vendedor", e.qtd as "Qtd", 
e.vl_unit_venda as "Valor unitário", e.qtd*e.vl_unit_venda as "Total item"
from venda b
LEFT OUTER JOIN cliente c
ON (b.id_cliente = c.id_cliente)
LEFT OUTER JOIN loja d
ON (b.id_loja = d.id_loja)
LEFT OUTER JOIN itens_venda e
ON (b.id_venda = e.id_venda)
LEFT OUTER JOIN vendedor f
ON (b.id_vendedor = f.id_vendedor)
LEFT OUTER JOIN produto g
ON (e.id_produto = g.id_produto)
order by b.dt_venda desc, e.qtd*e.vl_unit_venda;




















