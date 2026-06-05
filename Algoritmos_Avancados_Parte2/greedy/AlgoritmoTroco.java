import java.util.ArrayList;
import java.util.List;

public class AlgoritmoTroco {

    /**
     * Resolve o problema do troco usando uma abordagem gulosa.
     * @param valor Total a ser trocado
     * @param moedas Array de moedas disponíveis (deve estar ordenado decrescentemente)
     * @return Lista com as moedas utilizadas
     */
    public static List<Integer> calcularTroco(int valor, int[] moedas) {
        List<Integer> resultado = new ArrayList<>();
        int restante = valor;

        // Loop guloso: para cada moeda, pega o máximo possível
        for (int moeda : moedas) {
            while (restante >= moeda) {
                resultado.add(moeda);
                restante -= moeda;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Moedas ordenadas decrescentemente para garantir a lógica gulosa
        int[] moedas = {5, 2, 1}; 
        int troco = 18;

        List<Integer> moedasUsadas = calcularTroco(troco, moedas);
        
        System.out.println("Troco de " + troco + ": " + moedasUsadas);
        System.out.println("Total de moedas: " + moedasUsadas.size());
    }
}