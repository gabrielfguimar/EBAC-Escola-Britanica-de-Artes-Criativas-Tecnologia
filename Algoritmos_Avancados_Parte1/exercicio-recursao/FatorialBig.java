import java.math.BigInteger;

public class FatorialBig {

    public static BigInteger calcularFatorial(int n) {
        // Caso base: o fatorial de 0 ou 1 é 1
        if (n <= 1) {
            return BigInteger.ONE;
        }
        // Chamada recursiva usando BigInteger
        return BigInteger.valueOf(n).multiply(calcularFatorial(n - 1));
    }

    public static void main(String[] args) {
        int numero = 100;
        System.out.println("O fatorial de " + numero + " é: " + calcularFatorial(numero));
    }
}