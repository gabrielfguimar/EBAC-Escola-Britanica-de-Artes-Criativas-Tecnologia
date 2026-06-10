public class MinhaPilha {
    private int[] elementos;
    private int topo;

    // Construtor: define o tamanho máximo da pilha
    public MinhaPilha(int capacidade) {
        elementos = new int[capacidade];
        topo = -1; // Começa em -1 indicando pilha vazia
    }

    // Coloca um inteiro no topo
    public void push(int valor) {
        if (topo == elementos.length - 1) {
            System.out.println("Erro: A pilha está cheia!");
        } else {
            topo++;
            elementos[topo] = valor;
        }
    }

    // Remove e retorna o valor do topo
    public int pop() {
        if (isEmpty()) {
            System.out.println("Erro: A pilha está vazia!");
            return -1; // Retorno de segurança
        }
        int valorRemovido = elementos[topo];
        topo--;
        return valorRemovido;
    }

    // Espia o topo sem remover
    public int top() {
        if (isEmpty()) {
            System.out.println("Erro: A pilha está vazia!");
            return -1;
        }
        return elementos[topo];
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return topo == -1;
    }

    // Retorna a quantidade de elementos
    public int size() {
        return topo + 1;
    }
}