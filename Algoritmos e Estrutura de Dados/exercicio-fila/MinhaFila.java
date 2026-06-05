public class MinhaFila {
    private int[] elementos;
    private int front; // Índice do primeiro elemento
    private int rear;  // Índice do último elemento
    private int tamanho; // Quantidade atual de elementos

    public MinhaFila(int capacidade) {
        elementos = new int[capacidade];
        front = 0;
        rear = -1;
        tamanho = 0;
    }

    // Adiciona um inteiro ao final da fila
    public void enqueue(int valor) {
        if (tamanho == elementos.length) {
            System.out.println("Erro: A fila está cheia!");
        } else {
            rear = (rear + 1) % elementos.length; // Lógica circular
            elementos[rear] = valor;
            tamanho++;
        }
    }

    // Remove um inteiro do início da fila
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Erro: A fila está vazia!");
            return -1;
        }
        int valorRemovido = elementos[front];
        front = (front + 1) % elementos.length; // Lógica circular
        tamanho--;
        return valorRemovido;
    }

    // Retorna o primeiro elemento (quem sai)
    public int front() {
        if (isEmpty()) {
            System.out.println("Erro: A fila está vazia!");
            return -1;
        }
        return elementos[front];
    }

    // Retorna o último elemento (quem entrou por último)
    public int rear() {
        if (isEmpty()) {
            System.out.println("Erro: A fila está vazia!");
            return -1;
        }
        return elementos[rear];
    }

    // Verifica se a fila está vazia
    public boolean isEmpty() {
        return tamanho == 0;
    }

    // Retorna a quantidade de elementos na fila
    public int size() {
        return tamanho;
    }
}