import java.util.Arrays;

public class MeuHashMap {
    private int[] chaves;
    private int[] valores;
    private final int TAMANHO = 10;

    public MeuHashMap() {
        chaves = new int[TAMANHO];
        valores = new int[TAMANHO];
        // Inicializa com -1 para representar posições vazias
        Arrays.fill(chaves, -1);
    }

    private int calcularHash(int chave) {
        return Math.abs(chave % TAMANHO);
    }

    public void put(int key, int value) {
        int index = calcularHash(key);
        // Tratamento de colisão: busca próxima posição vazia (linear probing)
        while (chaves[index] != -1 && chaves[index] != key) {
            index = (index + 1) % TAMANHO;
        }
        chaves[index] = key;
        valores[index] = value;
    }

    public int get(int key) {
        int index = calcularHash(key);
        int inicio = index;
        while (chaves[index] != -1) {
            if (chaves[index] == key) return valores[index];
            index = (index + 1) % TAMANHO;
            if (index == inicio) break; // Percorreu tudo
        }
        return -1; // Não encontrado
    }

    public void delete(int key) {
        int index = calcularHash(key);
        while (chaves[index] != -1) {
            if (chaves[index] == key) {
                chaves[index] = -1;
                valores[index] = 0;
                return;
            }
            index = (index + 1) % TAMANHO;
        }
    }

    public void clear() {
        Arrays.fill(chaves, -1);
        Arrays.fill(valores, 0);
    }
}