# Acesso a banco de dados

- Este repositório está realizando acesso a banco de dados e acionando as ações de CRUD - CREATE, READ, UPDATE E DELETE a partir de comandos SQL.

## Ferramentas utilizadas

- Eclipse
- Oracle SQL Database
- Oracle SQL Developer

## Download do driver OJDBC

https://www.oracle.com/br/database/technologies/appdev/jdbc-downloads.html

## JDBC - Conceito

JDBC (Java Database Connectivity) é um conjunto de classes e interfaces (API) escritas em Java que faz o envio de instruções SQL para qualquer banco de dados relacional.

- É uma API de baixo nível e base para APIs de alto nível.
- Possibilita o uso de banco de dados já instalados.
- Para cada banco de dados há um driver específico.
- Um programa Java utiliza uma API JDBC única que independe do banco de dados ou driver que estiver sendo utilizado.
- Os drivers para conexão e acesso aos principais banco de dados existentes são fornecidos pelos seus fabricantes.

## JDBC - Principais Componentes 

![image](https://user-images.githubusercontent.com/62342894/183528374-92408129-77a0-4cb3-b9e2-531b5875a28d.png)

## Drivers e Strings de Conexão

![image](https://user-images.githubusercontent.com/62342894/183528408-62e9d0c6-7ca4-4d71-a8ae-b57bfd96931c.png)

## Interface PreparedStatement

![image](https://user-images.githubusercontent.com/62342894/183528547-d1421b75-5c4d-42a1-88e6-9d7210fcb467.png)

## Resultado da Interface PreparedStatement

![image](https://user-images.githubusercontent.com/62342894/183528644-882b02fe-e0d6-412f-8e74-30415b714e82.png)

## Interface ResultSet

![image](https://user-images.githubusercontent.com/62342894/183528582-63a80097-96e9-4f15-82d1-a05e0a2f75be.png)

## Resultado da Interface ResultSet

![image](https://user-images.githubusercontent.com/62342894/183528629-60f30481-0a4a-4675-814c-8ab9a2ac833f.png)

## Classe de conexão com o banco de dados

![image](https://user-images.githubusercontent.com/62342894/188200315-bbc8cea9-e487-4080-84bc-407dbe814a5e.png)

## Classe que irá realizar as operações no banco de dados (DAO)

### método inserir

![image](https://user-images.githubusercontent.com/62342894/188200742-c4224cb3-a37f-42d7-b591-7ab309885a7a.png)

### método consultar por número

![image](https://user-images.githubusercontent.com/62342894/188200872-4e525e6c-f12b-45ba-9d3c-e58cfb94aa2d.png)

### método para retornar dados

![image](https://user-images.githubusercontent.com/62342894/188200942-4bbb1053-5304-4029-9f74-c42f01232ded.png)

### método deletar

![image](https://user-images.githubusercontent.com/62342894/188201275-d1527a38-fcff-4189-8c10-6a2431b0031a.png)

### método editar

![image](https://user-images.githubusercontent.com/62342894/188201245-c5bc6905-eab9-4bf2-b0aa-1e384976cd2c.png)

### método listar

![image](https://user-images.githubusercontent.com/62342894/188200973-1275c02b-3255-4693-9a76-0ab4c1798187.png)

### Inserir objeto de forma estática no banco de dados

EnderecoDAO dao = new EnderecoDAO();

Endereco endereco = new Endereco(3, 10, "teste", 10);

dao.inserir(endereco);

### Consultar objeto de forma estática no banco de dados

EnderecoDAO dao = new EnderecoDAO();
dao.pesquisar(1);

### Listar objeto de forma estática

EnderecoDAO dao = new EnderecoDAO();

dao.listar();

















