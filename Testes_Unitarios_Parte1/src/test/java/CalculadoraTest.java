import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes unitários para a classe Calculadora.
 */
class CalculadoraTest {
    
    private final Calculadora calc = new Calculadora();

    @Test
    void testAdicionar() {
        assertEquals(5, calc.adicionar(2, 3));
    }

    @Test
    void testSubtrair() {
        assertEquals(1, calc.subtrair(3, 2));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2, calc.dividir(4, 2));
    }

    @Test
    void testDividirPorZero() {
        // Testando explicitamente o erro de Division by Zero
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0), 
            "Deveria lançar uma exceção ao dividir por zero");
    }
}