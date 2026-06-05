import java.util.ArrayList;
import java.util.List;

public class BacktrackingSubconjuntos {

    public static List<List<Integer>> encontrarSubconjuntos(int[] S, int n) {
        List<List<Integer>> resultado = new ArrayList<>();
        backtrack(S, n, 0, new ArrayList<>(), resultado);
        return resultado;
    }

    private static void backtrack(int[] S, int n, int indice, List<Integer> solucaoAtual, List<List<Integer>> resultado) {
        // 1. Caso Base: Se a solução atingiu o tamanho n, adicionamos ao resultado
        if (solucaoAtual.size() == n) {
            resultado.add(new ArrayList<>(solucaoAtual));
            return;
        }

        // 2. Caso de Poda: Se chegamos ao fim do array, voltamos
        if (indice == S.length) {
            return;
        }

        // Decisão 1: Incluir o elemento S[indice]
        solucaoAtual.add(S[indice]);
        backtrack(S, n, indice + 1, solucaoAtual, resultado);

        // Backtracking: Removemos o elemento para testar o caminho sem ele
        solucaoAtual.remove(solucaoAtual.size() - 1);

        // Decisão 2: Não incluir o elemento S[indice] e avançar
        backtrack(S, n, indice + 1, solucaoAtual, resultado);
    }

    public static void main(String[] args) {
        int[] S = {1, 2, 3};
        int n = 2;
        System.out.println(encontrarSubconjuntos(S, n));
    }
}