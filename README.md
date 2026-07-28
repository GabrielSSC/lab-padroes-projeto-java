# Padrões de Projeto em Java: Strategy Pattern 🎯

Projeto desenvolvido como parte do desafio prático sobre Padrões de Projeto (Design Patterns) do Bootcamp DIO.

## 📌 Sobre o Projeto
Este repositório contém uma implementação do padrão Comportamental **Strategy** em Java Puro.

O padrão foi aplicado na simulação de um **Carrinho de Compras**, onde diferentes estratégias de cálculo de desconto podem ser aplicadas dinamicamente sem alterar a estrutura da classe principal ou poluir o código com estruturas de decisão (`if/else` ou `switch`).

## 🛠️ Padrão Aplicado: Strategy
- **`DescontoStrategy`**: Interface que define o contrato da estratégia.
- **`DescontoNenhum` / `DescontoCupomDez` / `DescontoBlackFriday`**: Implementações concretas de regras de negócio.
- **`CarrinhoDeCompras`**: Classe contexto que utiliza a estratégia atribuída.

## 🚀 Como Executar
1. Clone o repositório:
   ```bash
   git clone [https://github.com/GabrielSSC/lab-padroes-projeto-java.git](https://github.com/GabrielSSC/lab-padroes-projeto-java.git)