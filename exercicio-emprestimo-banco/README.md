
# Exercício Empréstimo Bancário

Escreva um programa que avalie a elegibilidade de um usuário para um empréstimo bancário com base em múltiplos critérios (renda, idade, score de crédito) e forneça feedback detalhado.

## Critérios de Avaliação
#### Renda Mensal:

A renda mensal do usuário deve atender a um mínimo especificado para ser considerado para um empréstimo.
Parâmetro: Valor mínimo da renda mensal.
Exemplo: A renda mensal mínima deve ser de R$ 3.000,00.

#### Idade:

A idade do usuário deve estar dentro de uma faixa aceitável para o empréstimo.
Parâmetro: Faixa etária mínima e máxima.
Exemplo: O usuário deve ter entre 18 e 65 anos.

#### Score de Crédito:

O score de crédito do usuário deve estar acima de um determinado valor para ser elegível para o empréstimo.
Parâmetro: Valor mínimo do score de crédito.
Exemplo: O score de crédito mínimo deve ser 700.

#### Histórico de Dívidas:

Critério: O usuário deve ter um histórico de dívidas controlado (por exemplo, não ter dívidas vencidas).
Parâmetro: Status das dívidas.
Exemplo: O usuário não deve ter dívidas vencidas há mais de 30 dias.

#### Tempo de Emprego:

Critério: O usuário deve ter um tempo mínimo de emprego no atual trabalho.
Parâmetro: Tempo mínimo de emprego.
Exemplo: O usuário deve estar empregado no mesmo trabalho há pelo menos 6 meses.

### Parâmetros de Entrada
- Renda Mensal: Um valor numérico representando a renda mensal do usuário.

- Idade: Um valor numérico representando a idade do usuário.

- Score de Crédito: Um valor numérico representando o score de crédito do usuário.

- Histórico de Dívidas: Um valor booleano ou uma descrição do status das dívidas do usuário.

- Tempo de Emprego: Um valor numérico representando o número de meses que o usuário está no mesmo emprego.

### Avaliação dos Critérios:

Verificar cada critério individualmente usando condições if-else.
Utilizar os parâmetros definidos para comparar com os dados do usuário.

### Feedback ao Usuário:

Fornecer uma mensagem detalhada com base na avaliação dos critérios.
Informar quais critérios foram atendidos e quais não foram, explicando as razões.

### Exemplo de Estrutura de Feedback

#### Renda Mensal:

Mensagem: "Sua renda mensal é suficiente para o empréstimo."

#### Idade:

Mensagem: "Sua idade está dentro da faixa aceitável para o empréstimo."

#### Score de Crédito:

Mensagem: "Seu score de crédito atende ao requisito mínimo."

#### Histórico de Dívidas:

Mensagem: "Seu histórico de dívidas está em ordem."

#### Tempo de Emprego:

Mensagem: "Você cumpre o requisito de tempo mínimo de emprego."

##### Mensagem de Rejeição
Se algum critério não for atendido, a mensagem pode ser ajustada para refletir a falta de elegibilidade. Por exemplo:

"Infelizmente, sua renda mensal não atende ao requisito mínimo para o empréstimo."
"Seu score de crédito é abaixo do mínimo exigido para o empréstimo."

### Resumo


- Entrada de Dados: Captura dos dados do usuário.
- Validação dos Critérios: Verificação de cada critério com base nos parâmetros.

- Feedback Detalhado : Mensagens informativas e claras sobre a elegibilidade.

