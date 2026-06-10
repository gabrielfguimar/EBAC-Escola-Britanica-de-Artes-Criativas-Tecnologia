# Estruturas de Dados em Java

Este repositório contém as implementações de estruturas de dados fundamentais desenvolvidas durante o Módulo 1 do curso.

## Exercícios Realizados

- **Pilha (Stack):** Implementação LIFO usando `Array`.
- **Fila (Queue):** Implementação FIFO usando `Array` circular.
- **Lista Encadeada (Linked List):** Implementação dinâmica utilizando `Node`.

## Análise de Complexidade (Big-O)

### 1. Pilha (Array)
* **Tempo:** * `push()`: $O(1)$
    * `pop()`: $O(1)$
* **Espaço:** $O(N)$ (capacidade definida no construtor)

### 2. Fila (Array Circular)
* **Tempo:** * `enqueue()`: $O(1)$
    * `dequeue()`: $O(1)$
    * `front()` / `rear()`: $O(1)$
* **Espaço:** $O(N)$

### 3. Lista Encadeada (Nós)
* **Tempo:** * `push()` (ao final): $O(N)$ - *Justificativa: Necessita percorrer a lista até o último elemento.*
    * `pop()` (do final): $O(N)$ - *Justificativa: Necessita encontrar o penúltimo nó.*
    * `insert()` / `remove()`: $O(N)$ - *Justificativa: Busca linear pelo índice.*
* **Espaço:** $O(N)$ - *Crescimento dinâmico conforme o número de nós.*

---
*Desenvolvido por Gabriel Flores Guimaraes.*