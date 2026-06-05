# Exercício: Problema do Troco (Algoritmo Guloso)

Este projeto contém uma implementação em **Java** para o problema clássico do "Troco", utilizando a técnica de **Algoritmos Gulosos (Greedy Algorithms)** para encontrar a solução que utiliza o menor número de moedas possível para uma determinada quantia.

## 📋 Descrição do Problema
Dado um valor inteiro representando a quantia e um conjunto de denominações de moedas disponíveis, o objetivo é encontrar a combinação de moedas que totalize esse valor utilizando a menor quantidade de itens possível.

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java
* **Conceito:** Algoritmos Gulosos (Greedy)

## 🚀 Como Executar
1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado.
2. Clone este repositório.
3. Compile o arquivo e execute o programa:
   ```bash
   javac AlgoritmoTroco.java

## 🧠 Lógica de Funcionamento
O algoritmo segue uma abordagem Top-Down:
1. Ordenação: As moedas são organizadas em ordem decrescente de valor.
2. Seleção Gulosa: Em cada etapa, o algoritmo escolhe a maior moeda que não excede o valor restante do troco.
3. Atualização: Subtrai o valor da moeda do total restante e repete o processo até que o troco seja zero.
4. Decisão Definitiva: Diferente do Backtracking, uma vez que uma moeda é escolhida, o algoritmo não reconsidera a decisão.

## 📈 Análise de Complexidade

* **Complexidade de Tempo**: $O(M)$
Onde M é o número de tipos de moedas disponíveis. Como o algoritmo percorre o array de moedas uma única vez (ou realiza subtrações sucessivas), a performance é altamente eficiente, sendo linear em relação ao número de denominações.

* **Complexidade de Espaço**: $O(K)$
Onde K é o número total de moedas retornadas na lista final, que representa o espaço necessário para armazenar o resultado da composição do troco.

## ⚠️ Limitações
Como observado em estudos de algoritmos, a abordagem gulosa nem sempre produz a solução ótima se o sistema de moedas não for "canônico" (por exemplo, com moedas de valores especiais como [4, 3, 1]). Nestes casos específicos, seria necessária a aplicação de Programação Dinâmica.

## 📝 Autor Gabriel Flores Guimarães