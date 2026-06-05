## Desafio: Mapa de Hash (HashMap)

Esta implementação utiliza um array de tamanho fixo para armazenar pares chave-valor, resolvendo colisões através de endereçamento aberto (*linear probing*).

### Justificativa da Função Hash
A função de dispersão escolhida foi: `Math.abs(chave % TAMANHO)`.

* **Por que o operador módulo (`%`)?** É uma forma eficiente de garantir que qualquer inteiro inserido (a chave) seja mapeado para um índice válido dentro do intervalo do nosso array (0 a 9).
* **Por que `Math.abs()`?** Essencial para tratar chaves negativas. Como o operador `%` em Java pode retornar valores negativos para chaves negativas, o `Math.abs()` garante que o índice resultante seja sempre um número natural positivo, evitando erros de `ArrayIndexOutOfBoundsException`.
* **Tratamento de Colisões:** Utilizamos a técnica de *linear probing*, onde, caso o índice calculado já esteja ocupado por uma chave diferente, o algoritmo percorre o array sequencialmente até encontrar a próxima posição livre.