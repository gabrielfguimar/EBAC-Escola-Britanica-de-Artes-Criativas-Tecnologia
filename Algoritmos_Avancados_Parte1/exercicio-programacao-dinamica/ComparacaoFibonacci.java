public class ComparacaoFibonacci {

    // 1. Abordagem Recursiva Ingênua: O(2^n)
    public static long fibRecursivo(int n) {
        if (n <= 1) return n;
        return fibRecursivo(n - 1) + fibRecursivo(n - 2);
    }

    // 2. Abordagem Programação Dinâmica (Bottom-Up): O(n)
    public static long fibDP(int n) {
        if (n <= 1) return n;
        long[] tabela = new long[n + 1];
        tabela[0] = 0;
        tabela[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            tabela[i] = tabela[i - 1] + tabela[i - 2];
        }
        return tabela[n];
    }

    public static void main(String[] args) {
        int n = 45; // Testando com um valor alto

        // Teste Recursivo
        long inicio = System.currentTimeMillis();
        System.out.println("Fibonacci Recursivo (" + n + "): " + fibRecursivo(n));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo Recursivo: " + (fim - inicio) + "ms");

        System.out.println("-----------------------------------");

        // Teste Dinâmico
        inicio = System.currentTimeMillis();
        System.out.println("Fibonacci DP (" + n + "): " + fibDP(n));
        fim = System.currentTimeMillis();
        System.out.println("Tempo DP: " + (fim - inicio) + "ms");
    }
}