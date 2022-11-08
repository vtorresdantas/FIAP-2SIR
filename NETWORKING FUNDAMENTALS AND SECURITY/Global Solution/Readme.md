# Global Solution

## Endereço público x endereço privado

- endereços privados

10.0.0.0 — 10.255.255.255;

172.16.0.0 — 172.31.255.255; 

192.168.0.0 — 192.168.255.255

Exemplo: 10.11.12.13

- endereços públicos

Qualquer número não incluído no intervalo de endereços IP privados reservados

![image](https://user-images.githubusercontent.com/62342894/200634313-a276b37e-5725-4ec3-a941-15d7399828b9.png)

## Máscara padrão

![image](https://user-images.githubusercontent.com/62342894/200631977-8f65ebc1-6639-4d7d-a3d6-2863661deae9.png)

## Exercícios com endereçamento Internet Protocol

![image](https://user-images.githubusercontent.com/62342894/200632489-ca723c42-24ca-4d45-93f1-fe602c855e4b.png)

![image](https://user-images.githubusercontent.com/62342894/200632545-21a85f09-b7c4-4fa9-9498-aa3883e7e51f.png)

## Máscaras válidas

![image](https://user-images.githubusercontent.com/62342894/200641656-04b338a1-52c3-407f-8a08-9e16256d620b.png)

## CIDR (sub-rede)

![image](https://user-images.githubusercontent.com/62342894/200643663-7c5d1ed6-23fd-482b-b94e-c6c6478c7558.png)
![image](https://user-images.githubusercontent.com/62342894/200643722-cb8fee79-23d0-4375-a7bf-f9a225670581.png)
![image](https://user-images.githubusercontent.com/62342894/200643927-8fd3d3eb-a231-4ccb-9f64-e33f8bdf412f.png)

## Domínio de Broadcast

O domínio broadcast consiste em um conjunto de dispositivos que recebem qualquer pacote broadcast originário de qualquer dispositivo dentro do segmento de rede. Todas as portas de um hub ou de um switch pertencem ao mesmo domínio broadcast. O domínio broadcast pode ser segmentado por um roteador, no qual cada porta do roteador representa um domínio broadcast distinto. Outra forma de segmentar o domínio broadcast é através de uma VLAN, como será comentado mais a frente.

![image](https://user-images.githubusercontent.com/62342894/200635498-2fb9ae1b-1f6f-444e-b03c-4948a48ad9ae.png)

- Um domínio de broadcast é um segmento lógico de uma rede de
computadores em que um computador ou qualquer outro dispositivo
conectado à rede é capaz de se comunicar com outro sem a necessidade de
utilizar um dispositivo de roteamento (roteador).
- Embora os switches filtrem a maioria dos quadros com base nos endereços
MAC, eles não filtram quadros de broadcast.
- Para que outros switches na LAN recebam quadros de broadcast, os
switches precisam enviar esses quadros para todas as portas.
- Um conjunto de switches interconectados forma um único domínio de
broadcast.
- Somente um dispositivo de camada de rede, como um roteador, pode
dividir um domínio de broadcast de camada 2.
- Os roteadores são usados para segmentar tanto domínios de broadcast
como domínios de colisão.

![image](https://user-images.githubusercontent.com/62342894/200632769-b9f720c6-10b5-427d-813d-824b8dfd913c.png)

![image](https://user-images.githubusercontent.com/62342894/200632945-58acc151-9299-4b82-81b3-bea704d48ace.png)

![image](https://user-images.githubusercontent.com/62342894/200632955-0f42dc50-5a10-488b-b6b2-9ecf813f92cd.png)

- Cada porta utilizada pelo roteador utiliza um domínio de broadcast (sub-rede)

- Switch configuração padrão, hud e bridge utiliza 1 domínio de broadcast

- Switch configurado com VLan utiliza um domínio de broadcast (sub-rede)

## Domínio de colisão

O domínio de colisão é um segmento lógico da rede onde os pacotes transmitidos por elementos pertencentes a ele podem colidir uns com os outros. Uma colisão ocorre quando duas ou mais estações pertencentes ao mesmo segmento de rede compartilhado transmitem quadros ao mesmo tempo. Os quadros então colidem e as estações necessitam retransmiti-los, o que reduz a eficiência da rede. Colisões são frequentes em topologias de barramento ou em topologias formadas pela interligaçao das estações através de hubs, visto que todas as portas de um hub pertencem ao mesmo domínio de colisão.

![image](https://user-images.githubusercontent.com/62342894/200635431-948ea4c4-bebd-49c3-b8a3-d07ebdd75af5.png)

## Tipos de comunicação e endereços

![image](https://user-images.githubusercontent.com/62342894/200633406-6347d7c0-92ac-4781-b3da-7c5b07e9dc64.png)

## Modelo OSI/TCP

![image](https://user-images.githubusercontent.com/62342894/200630170-5b932fd2-ffe8-4e5d-abf1-492c20706c21.png)

## Endereço MAC

- O Endereço MAC (Media Access Control) é um endereço físico associado à interface de
comunicação, que conecta um dispositivo à rede.
- O MAC é um endereço “único”, não havendo duas interfaces com a mesma numeração.
- Esse endereço é utilizado para controle de acesso em redes de computadores (acesso à
Rede Local (LAN).
- Sua identificação é gravada em hardware, isto é, na memória ROM da placa de rede de
equipamentos como desktops, notebooks, roteadores, smartphones, tablets, impressoras
de rede._x005F_x0001_

- O tamanho (número de bits) do endereço físico varia conforme a tecnologia de rede.

- No caso da tecnologia Ethernet para redes locais, esse endereço Físico é conhecido como
endereço MAC (Media Access Control) e é estruturado da seguinte forma: _x005F_x0001_

- os endereços têm 48 bits (6 bytes), representados por seis números hexadecimais, separados por “:”
_x005F_x0001_
- os 3 primeiros bytes definem o identificador do fabricante _x005F_x0001_
- os 3 últimos bytes são definidos pelo fabricante, de forma única _x005F_x0001

![image](https://user-images.githubusercontent.com/62342894/200630539-7c7f9044-e3d5-4706-85b1-aec2f3bff66e.png)

![image](https://user-images.githubusercontent.com/62342894/200630790-e9a2e097-3671-4272-a297-46e117084f64.png)

## NAT

NAT foi criado com o objetivo principal de economizar endereços IPv4, uma vez que toda
uma rede com endereços privados da RFC 1918 (10.0.0.0 /8, 172.16.0.0 /12 e 192.168.0.0 /16)
pode ter acesso à Internet através de apenas um (ou poucos) endereço(s) público(s). 

### Tradução de Endereços de Rede

![image](https://user-images.githubusercontent.com/62342894/200641854-05157f3b-4803-4ade-919d-f7ab3ab2856a.png)

![image](https://user-images.githubusercontent.com/62342894/200641918-f25db29c-b98f-4e54-affd-1182842f24f8.png)
![image](https://user-images.githubusercontent.com/62342894/200641959-ce1b98af-ec5d-4f21-9162-278a0b344542.png)
![image](https://user-images.githubusercontent.com/62342894/200641979-9489ed3a-95df-44bd-a19b-1e90a9a1a700.png)

## DHCP

- Dynamic Host Configuration Protocol v4 (DHCPv4) atribui endereços IPv4 e outras informações de configuraçãode rede dinamicamente.
- Como os hosts (PCs, Notebooks, tablets, SmartPhones, ...) geralmente constituem a grande maioria dos nós de
uma rede, o DHCPv4 é uma ferramenta extremamente útil para poupar o tempo dos administradores da rede.
- Quando um host está conectado à rede, o servidor DHCP é contatado e um endereço
IP é requisitado (via broadcast).
- A alternativa para o endereçamento dinâmico é o endereçamento estático.

## Termos utilizados no DHCP

- Intervalo de exclusão: sequência limitada de endereços IP dentro
de um escopo, excluído dos endereços que são fornecidos pelo
DHCP
- Ex.: dentro da faixa 192.168.0.0 a 192.168.0.255 (rede 192.168.0.0/máscara
255.255.255.0), é criada uma faixa de exclusão de 192.168.0.120 a
192.168.0.130

- Pool de endereços: Endereços remanescentes após a definição do
escopo DHCP e intervalo de exclusão
- No exemplo anterior o pool de endereços é formado pelos endereços de 192.168.0.4 a
192.168.0.119 e endereços de 192.168.0.131 a 192.168.0.254.

- Concessão: período de tempo especificado por um servidor DHCP
durante o qual um computador cliente pode utilizar um endereço
IP que ele recebeu do servidor DHCP.

- Reserva: concessão de endereço permanente pelo servidor DHCP,
assegurando que um dispositivo de hardware especificado na
subrede possa utilizar sempre o mesmo endereço IP

## DNS

- O DNS (Domain Name System) é um serviço de gerenciamento de nomes
hierárquicos e distribuído operando segundo duas definições:

1. Examinar e atualizar seu banco de dados;
2. Resolver nomes de domínios em endereços de rede (IPs).

![image](https://user-images.githubusercontent.com/62342894/200642894-d869f9f6-4bc4-4646-8c18-77b4ef5219e3.png)

### Exemplo

De uma maneira simples, o DNS permite ao usuário a possibilidade de
memorizar os endereços de uma maneira mais fácil e prática. 

![image](https://user-images.githubusercontent.com/62342894/200642933-6fe10f28-364c-404e-ba18-7c4500a17212.png)

## Funcionamento do DNS

![image](https://user-images.githubusercontent.com/62342894/200643013-0a11a497-1d59-4874-afc6-4e0b51762cad.png)

## Componentes do DNS

![image](https://user-images.githubusercontent.com/62342894/200643083-ef61bd09-1b89-49f3-a9b9-b5c109a21c44.png)
![image](https://user-images.githubusercontent.com/62342894/200643105-6cded8cf-b76b-474a-a38a-c9e5006e8bdf.png)
![image](https://user-images.githubusercontent.com/62342894/200643139-f64102a6-6cdd-42e2-ab93-8e6287ee1381.png)

## HTTP

O Hypertext Transfer Protocol, sigla HTTP é um protocolo de comunicação utilizado para sistemas de informação de hipermídia, distribuídos e colaborativos. Ele é a base para a comunicação de dados da World Wide Web. Hipertexto é o texto estruturado que utiliza ligações lógicas entre nós contendo texto.


## Camada transporte

A camada de transporte é:

- responsável pela comunicação
lógica entre aplicativos
executados em hosts
diferentes.
- Link entre a camada de
aplicação e as camadas
inferiores responsáveis pela
transmissão da rede.

## TCP

![image](https://user-images.githubusercontent.com/62342894/200642230-450ee813-dca5-4466-957a-23f63d1bce83.png)

## UDP

![image](https://user-images.githubusercontent.com/62342894/200642264-12966a76-7d23-454d-91b9-904544724ce6.png)

## IPV6

![image](https://user-images.githubusercontent.com/62342894/200644364-152600d4-9cfe-4cab-9b68-f0f97e1f0872.png)

## Comparativo IPv4 x IPv6

![image](https://user-images.githubusercontent.com/62342894/200644406-8e3ab394-87f9-47d4-b1f6-d829f303ffbb.png)
![image](https://user-images.githubusercontent.com/62342894/200644467-753c53d6-16e4-4a83-a590-669a15b7ea40.png)
![image](https://user-images.githubusercontent.com/62342894/200644520-c88e595b-3d0f-48ef-931a-939cbcd8129a.png)
![image](https://user-images.githubusercontent.com/62342894/200644671-b6d04d6c-b44c-4d0c-8762-afa47e7ece28.png)
![image](https://user-images.githubusercontent.com/62342894/200644712-60da25c1-ce69-49cf-9e1c-da05abe22690.png)

## Switches

Os dispositivos de interconexão têm duas áreas de atuação nas redes telemáticas. Em um segundo nível estariam os switches, que são responsáveis ​​pela interconexão de equipamentos dentro de uma mesma rede, ou o que é o mesmo, são os dispositivos que, junto com a fiação, constituem as redes locais ou LAN.

