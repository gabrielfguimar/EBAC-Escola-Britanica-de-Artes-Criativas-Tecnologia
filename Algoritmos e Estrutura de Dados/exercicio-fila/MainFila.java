public class MainFila {
    public static void main(String[] args) {
        // 1. Instancia a fila com capacidade para 3 elementos
        MinhaFila fila = new MinhaFila(3);

        // 2. Testando enqueue()
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        System.out.println("Tamanho após inserir 3 elementos: " + fila.size());

        // 3. Testando front() e rear()
        System.out.println("Quem está na frente (sai primeiro): " + fila.front()); // Deve ser 10
        System.out.println("Quem está no fim (entrou por último): " + fila.rear()); // Deve ser 30

        // 4. Testando dequeue() - FIFO: o 10 deve sair primeiro
        System.out.println("Removido da fila: " + fila.dequeue()); // Remove 10
        System.out.println("Novo elemento na frente: " + fila.front()); // Deve ser 20

        // 5. Testando comportamento circular
        fila.enqueue(40); // Como a fila é circular, este ocupa o espaço que era do 10
        System.out.println("Tamanho atual: " + fila.size());
        System.out.println("Novo fim da fila: " + fila.rear()); // Deve ser 40
    }
}