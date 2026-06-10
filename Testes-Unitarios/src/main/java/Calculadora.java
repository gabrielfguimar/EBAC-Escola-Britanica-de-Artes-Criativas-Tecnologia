package src.main.java;
/**
 * A classe Calculadora fornece operações aritméticas básicas.
 * Esta classe foi projetada para realizar operações simples de forma segura.
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     * @param a Primeiro valor
     * @param b Segundo valor
     * @return A soma de a e b
     */
    private int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo valor do primeiro.
     * @param a Valor base
     * @param b Valor a ser subtraído
     * @return O resultado da subtração
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     * @param a Primeiro fator
     * @param b Segundo fator
     * @return O produto de a e b
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro valor pelo segundo.
     * @param a Dividendo
     * @param b Divisor
     * @return O quociente da divisão
     * @throws ArithmeticException se o divisor for zero
     */
    private int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
        return a / b;
    }
}