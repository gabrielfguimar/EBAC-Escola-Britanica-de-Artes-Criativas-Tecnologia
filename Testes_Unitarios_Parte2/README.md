## Funcionalidades
A classe Fibonacci contém o método calcular(int n):

Implementação recursiva: fib(n) = fib(n-1) + fib(n-2).

Base da recursão: fib(0) = 0, fib(1) = 1.

Tratamento de erro: Lança IllegalArgumentException para números negativos.

## Testes Unitários
A suíte de testes FibonacciTest garante a integridade da implementação através de:

testCasosBase: Valida a precisão dos retornos para os valores iniciais (0 e 1).

testSequenciaPadrao: Verifica o cálculo para valores maiores (ex: fib(5) = 5).

testValorNegativo: Assegura que o sistema trata entradas inválidas conforme esperado.

## Configuração
Para rodar este projeto, certifique-se de que o arquivo pom.xml está configurado corretamente com a dependência do junit-jupiter-engine. O VS Code detectará automaticamente o framework e permitirá a execução dos testes via interface.

*Exercício focado em recursividade, tratamento de exceções e automação de testes em Java.*
## 📝 Autor: Gabriel Flores Guimarães