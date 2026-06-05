# Exercício: Fatorial com Recursão

Este projeto apresenta uma implementação em Java focada no conceito de **recursividade** para o cálculo de fatoriais, com suporte para números elevados através da classe `BigInteger`.

## 📌 Descrição do Problema
O objetivo é calcular o fatorial de um número ($n!$) utilizando uma função recursiva. O desafio inclui calcular fatoriais acima de 100, superando as limitações dos tipos de dados primitivos.

## 🚀 Funcionalidades
* **Abordagem Recursiva:** O código utiliza chamadas sucessivas à própria função para resolver o cálculo seguindo a definição matemática.
* **Tratamento de Números Grandes:** Utiliza a classe `java.math.BigInteger` para evitar o *overflow* (estouro) que ocorreria com tipos de dados como `int` ou `long`.

## 🛠 Como Compilar e Executar

1.  Certifique-se de ter o **JDK** (Java Development Kit) instalado.
2.  No terminal, navegue até a pasta onde guardou o ficheiro `.java`.
3.  Compile o código:
    ```bash
    javac FatorialBig.java
    ```
4.  Execute o programa:
    ```bash
    java FatorialBig
    ```

## 🔍 Justificativa Técnica (Resposta ao Desafio)

**É possível calcular fatoriais acima de 100 recursivamente?**

* **Sim**, logicamente é possível. A classe `BigInteger` permite armazenar resultados extremamente grandes que não caberiam em variáveis comuns.
* **Limitação Prática:** A solução recursiva depende da "pilha de chamadas" (*call stack*) da memória. Cada chamada de função ocupa um pouco dessa memória. Se o número for muito alto (ex: milhares), o programa atingirá o limite da pilha, gerando um `StackOverflowError`. 
* **Conclusão:** Embora a recursão seja uma forma elegante e correta de resolver este exercício, para números realmente gigantescos, uma abordagem iterativa (loops) seria mais eficiente em termos de gestão de memória.

---
*Desenvolvido como parte do exercício de lógica e recursividade.*