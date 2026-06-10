## Funcionalidades
A classe Calculadora implementa as seguintes operações:

1. Adicionar: Soma dois números inteiros.
2. Subtrair: Subtrai o segundo número do primeiro.
3. Multiplicar: Multiplica dois números inteiros.
4. Dividir: Divide o primeiro pelo segundo, com tratamento de erro para divisão por zero (ArithmeticException).

## Testes Unitários
Os testes foram desenvolvidos utilizando o framework JUnit. Eles cobrem:

1. Cenários de sucesso para todas as operações básicas.
2. Cenário de exceção para a divisão por zero, garantindo que o sistema lance o erro esperado ao invés de  falhar silenciosamente ou retornar valores inválidos.

**Por que documentar?**
A documentação (Javadoc) e este arquivo garantem que:

1. O contrato dos métodos seja claro para outros desenvolvedores.
2. A intenção por trás de tratamentos de erro (como a divisão por zero) seja explícita.
3. A manutenção do código seja facilitada a médio e longo prazo, reduzindo a carga cognitiva e o risco de introduzir regressões.

*Projeto desenvolvido como exercício de boas práticas de código e desenvolvimento orientado a testes (TDD).*

# Resposta sobre Documentação de Código

## Pergunta: Você conseguiria entender o código que escreveu sem documentá-lo?

Embora o exemplo da classe `Calculadora` seja simples e possua nomes de métodos claros, a resposta curta é: **a longo prazo, não com a mesma eficiência e segurança.**

### Justificativa:

1. **O contrato do método:** Sem a documentação (especialmente o Javadoc indicando o `ArithmeticException`), um desenvolvedor que utilizasse o método `dividir` poderia não saber de imediato que precisa tratar o caso de divisão por zero. A documentação torna o comportamento esperado (o contrato) explícito.
2. **Carga Cognitiva:** Em sistemas reais, os métodos raramente são tão simples. Eles contêm regras de negócio, validações complexas e integrações. Quando um método cresce, tentar entender a lógica apenas "lendo o código" força o cérebro a reconstruir o raciocínio do autor original, o que é cansativo e propenso a erros.
3. **Memória de Curto Prazo:** O próprio autor do código tende a esquecer os detalhes de implementação após algumas semanas ou meses. Documentar é, acima de tudo, um gesto de empatia com o seu "eu do futuro".

### Conclusão:
Documentar não serve apenas para explicar o que o código faz (o *quê*), mas para explicar as premissas e os comportamentos (o *porquê*). Isso reduz drasticamente o tempo necessário para qualquer pessoa realizar uma manutenção futura com confiança e evita que se caia na armadilha de reescrever códigos funcionais apenas por falta de compreensão.

*Desenvolvido como parte do exercício de Testes Unitários .*
## 📝 Autor: Gabriel Flores Guimarães