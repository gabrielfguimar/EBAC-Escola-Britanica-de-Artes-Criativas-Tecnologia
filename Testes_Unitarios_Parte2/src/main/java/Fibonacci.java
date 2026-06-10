public class Fibonacci {
    public static int calcular(int n) {
        if (n < 0) throw new IllegalArgumentException("Entrada negativa");
        if (n == 0) return 0;
        if (n == 1) return 1;
        return calcular(n - 1) + calcular(n - 2);
    }
}