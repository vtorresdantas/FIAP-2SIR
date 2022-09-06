# Caso de uso - Reserva de horário pelo aluno

## Resumo

- Os alunos da academia poderão fazer apenas uma reserva por vez para utilizarem a academia em horário de pico por 1 hora (segunda a sexta de 6h até 8h e de 18h até 22h), existindo 50 posições
de treino (vaga) por hora. 

- Toda utilização da academia deve ser agendada para que um instrutor seja alocado para acompanhar o aluno.

## Atores

- Aluno
- Instrutor

## Pré-condições

- O usuário do sistema deve ser aluno da academia (possuir cadastro no sistema)

## Requisitos associados
- Controlar limites de vagas na academia em dias e horários de pico
- Controlar agendamento de uso da academia
- Alocar instrutores para acompanhar alunos

# Descrição do Fluxo Principal
1. O aluno deve fazer Login no sistema online da academia (WEB)
2. O aluno deve acessar o link de “Reserva de Horário” [A1]
3. O sistema verifica se o aluno já possui reserva ativa
4. O sistema exibe o calendário de dias úteis da academia [E1, A1]
5. O aluno deve selecionar o dia de treino
6. O sistema apresenta os horários de pico com disponibilidade de pelo menos 1 posição de treino [A2]
7. O aluno deve selecionar o horário de treino
8. O sistema solicita confirmação da reserva
9. O aluno confirma a reserva
10. O sistema reduz o número de vagas disponíveis no dia e horário
11. O sistema envia mensagem para o usuário com o número da reserva
12. O sistema verifica se há instrutor no dia e horário de agendamento [A3]
13. O sistema pesquisa um instrutor com horário de trabalho/turno previsto para o dia e horário14. O sistema envia uma mensagem ao instrutor para confirmação de ciência de confirmação de
alocação
15. O instrutor confirma a alocação [A4]
16. O sistema associa o instrutor ao aluno no dia e horário de treino
17. O sistema envia mensagem para o aluno de confirmação da agenda com o nome do instrutor
associado
18. [P4]

## E1-Descrição do Fluxo de Exceção – Impedimento de Reserva
1. O aluno possui reserva ativa
2. O sistema exibe mensagem de impedimento de nova reserva
3. [P4]

## A1-Descrição do Fluxo Alternativo 1 – Saída do Sistema de Reserva
1. O aluno desiste da reserva
2. Sair do sistema

## A2-Descrição do Fluxo Alternativo 2 – Inexistência de vagas disponíveis
1. O sistema informa o usuário que não há vagas disponíveis no dia e horário
2. [P4]

## A3-Descrição do Fluxo Alternativo 3 – Já existe instrutor atendendo no horário de agendamento
1. O sistema obtém os dados do instrutor que já está alocado
2. [P16]

## A4-Descrição do Fluxo Alternativo 4 – O instrutor não confirma disponibilidade para cumprir agenda
1. O sistema obtém os dados de outro instrutor que não está alocado
2. [P14]

## Fluxograma

![image](https://user-images.githubusercontent.com/62342894/188698579-57444ef8-c24f-4888-b156-8fb3f5b9df8a.png)
