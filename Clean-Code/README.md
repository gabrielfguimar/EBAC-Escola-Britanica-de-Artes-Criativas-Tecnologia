# Guia de Boas Práticas e Código Limpo

Este documento apresenta uma análise sobre princípios de Código Limpo (Clean Code) e a aplicação desses conceitos em exemplos práticos de assinaturas de métodos.

## Parte 1: Princípios de Código Limpo

### 1. Usar nomenclatura adequada
A nomenclatura é uma das formas mais fundamentais de documentação. Nomes significativos e precisos (variáveis, métodos, classes) descrevem a **intenção** do desenvolvedor. Quando um nome é bem escolhido, ele elimina a necessidade de comentários óbvios, facilita a leitura, torna o código mais compreensível para novos membros e reduz a carga cognitiva durante a manutenção.

### 2. Resolver os problemas na causa raiz
Tratar apenas os sintomas de um erro em vez de resolver sua origem é uma receita para dívida técnica e bugs recorrentes. Resolver a causa raiz significa investigar por que o erro aconteceu (falha de lógica, acoplamento, falta de validação, etc.) e corrigir a fonte. Isso garante que o sistema se torne mais robusto a longo prazo, em vez de apenas "maquiar" comportamentos inesperados.

### 3. Seguir a política do escoteiro
Inspirada na máxima: *"Deixe o local do acampamento mais limpo do que você o encontrou"*. No desenvolvimento, isso significa que, sempre que precisar editar um arquivo, aproveite para realizar pequenas melhorias (refatorar um nome de variável, extrair um método, remover um comentário morto). Isso impede a degradação gradual da qualidade do código e mantém a base do projeto sempre em um estado saudável.

---

## Parte 2: Análise de Assinaturas de Métodos

### 1. `private void somaNumeros(int a, int b, int c, int d, int e, int f)`
* **Princípio ferido:** **Método com muitos argumentos (Long Parameter List).**
* **Explicação:** Métodos que recebem muitos argumentos são difíceis de testar, de entender e de manter. O ideal é reduzir o número de parâmetros, possivelmente agrupando-os em um objeto (ex: `SomaRequest` ou uma `List`/`Array`). Além disso, os nomes `a` a `f` são genéricos e não transmitem a intenção de cada valor.

### 2. `private void oPaiTaOn()`
* **Princípio ferido:** **Nomenclatura inadequada / Falta de intenção clara.**
* **Explicação:** O nome é coloquial, informal e não descreve o que o método faz. Nomes de métodos devem ser verbos ou frases verbais que indiquem a ação executada. Código profissional deve ser objetivo e compreensível por qualquer pessoa, em qualquer contexto cultural.

### 3. `private double checaSaldoEAtualiza(long userId, double value)`
* **Princípio ferido:** **Princípio da Responsabilidade Única (Single Responsibility Principle - SRP).**
* **Explicação:** O nome indica que o método faz duas coisas distintas: "checa saldo" e "atualiza". Um método deve fazer apenas uma coisa. Ao combinar operações (especialmente uma de consulta e outra de escrita/atualização), torna-se mais difícil testar, reutilizar e depurar o código. O ideal seria dividir em dois métodos: um para consultar o saldo e outro para realizar a atualização.

*Desenvolvido como parte do exercício de Clean Code.*
## 📝 Autor: Gabriel Flores Guimarães
