import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testCasosBase() {
        // Testa a base da recursão conforme visto na árvore: fib(0) e fib(1)
        assertEquals(0, Fibonacci.calcular(0));
        assertEquals(1, Fibonacci.calcular(1));
    }

    @Test
    void testSequenciaPadrao() {
        // Testa um valor intermediário, como fib(5), que é a raiz da sua imagem
        // A sequência é: 0, 1, 1, 2, 3, 5
        assertEquals(5, Fibonacci.calcular(5));
    }

    @Test
    void testValorNegativo() {
        // Testa o tratamento de erro para garantir que a recursão não entre em loop
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.calcular(-1));
    }
}