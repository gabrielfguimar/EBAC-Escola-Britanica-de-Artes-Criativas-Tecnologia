Este README.md foi elaborado para cobrir os exercícios de Programação Dinâmica (Fibonacci) e a comparação de desempenho, sendo ideal para documentar seu projeto de estudos.Estudo de Algoritmos: Recursão vs Programação Dinâmica

Este projeto documenta o estudo prático sobre a otimização de algoritmos, comparando a abordagem recursiva ingênua com a Programação Dinâmica (PD), utilizando a sequência de Fibonacci como caso de teste.

## 🎯 Objetivos
* Implementar a sequência de Fibonacci usando recursão simples.
* Implementar a sequência de Fibonacci utilizando Programação Dinâmica (abordagem Bottom-Up).
* Comparar a eficiência de tempo entre as duas abordagens.

## 🚀 Como Executar
1. Certifique-se de ter o **JDK** instalado.
2. Compile o arquivo e e execute o programa:
   ```bash
   javac ComparacaoFibonacci.java
   
## 📊 Análise de Complexidade
Recursão Simples: $O(2^n)$  📉 Baixa (Exponencial)

Programação Dinâmica: $O(n)$    📈 Alta (Linear)

## 💡 Por que a Programação Dinâmica é melhor?
A recursão ingênua sofre de explosão combinatória, recalculando os mesmos subproblemas repetidamente.

A Programação Dinâmica resolve esse gargalo através da "memória":

1.Memoization (Top-Down): Resolve recursivamente, salvando resultados em cache.
2.Tabulation (Bottom-Up): Resolve iterativamente, construindo a solução do menor caso base até o valor desejado.

Estudo realizado para consolidar o entendimento sobre eficiência algorítmica e estruturas de dados.

Desenvolvido para o aprendizado de algoritmos.
